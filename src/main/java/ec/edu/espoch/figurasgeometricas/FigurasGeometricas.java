

package ec.edu.espoch.figurasgeometricas;

import ec.edu.espoch.figurasgeometricas.clases.Circulo;
import ec.edu.espoch.figurasgeometricas.clases.Rectangulo;


public class FigurasGeometricas {

    public static void main(String[] args) {
        
        //Circulo//
       Circulo objCirculo = new Circulo();
       objCirculo.Radio = 5;
       
       objCirculo.imprimir();
       double area = objCirculo.determinarAreaCirculo();
        System.out.println("El area del Circulo es: "+ area);
       double perimetro = objCirculo.determinarPerimetroCirculo();
        System.out.println("El perimetro del Circulo es: "+perimetro);
    }
    
    
    //Rectagulo//
    Rectangulo objrRectangulo = new Rectangulo();
    
    
    
    
}
