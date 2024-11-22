

package ec.edu.espoch.figurasgeometricas;

import ec.edu.espoch.figurasgeometricas.clases.Circulo;
import ec.edu.espoch.figurasgeometricas.clases.Rectangulo;


public class FigurasGeometricas {

    public static void main(String[] args) {
        
        //Circulo//
       Circulo objCirculo = new Circulo();
       objCirculo.Radio = 5;
       
       objCirculo.imprimir();
       
       double areaCirculo = objCirculo.determinarAreaCirculo();
        System.out.println("El area del Circulo es: "+ areaCirculo);
       double perimetroCirculo = objCirculo.determinarPerimetroCirculo();
        System.out.println("El perimetro del Circulo es: "+perimetroCirculo);
        
        //Rectangulo//
    Rectangulo objRectangulo = new Rectangulo();
    objRectangulo.baseRec = 10;
    objRectangulo.alturaRec = 20;
    
    objRectangulo.imprimir();
    
    double areaRectangulo = objRectangulo.determinarAreaRectangulo();
        System.out.println("El area del Rectangulo es: "+ areaRectangulo);
       double perimetroRectangulo = objRectangulo.determinarPerimetroRectangulo();
        System.out.println("El perimetro del Rectangulo es: "+perimetroRectangulo);
    
    }
    
    
}
