

package ec.edu.espoch.figurasgeometricas;

import ec.edu.espoch.figurasgeometricas.clases.Circulo;
import ec.edu.espoch.figurasgeometricas.clases.Cuadrado;
import ec.edu.espoch.figurasgeometricas.clases.Rectangulo;
import ec.edu.espoch.figurasgeometricas.clases.Triangulo;


public class FigurasGeometricas {

    public static void main(String[] args) {
        
        //Circulo//
       Circulo objCirculo = new Circulo(5);
       
       objCirculo.imprimir();
       
       double areaCirculo = objCirculo.determinarAreaCirculo();
        System.out.println("El area del Circulo es: "+ areaCirculo);
       double perimetroCirculo = objCirculo.determinarPerimetroCirculo();
        System.out.println("El perimetro del Circulo es: "+perimetroCirculo);
        
        //Rectangulo//
    Rectangulo objRectangulo = new Rectangulo(10,20);
    objRectangulo.imprimir();
    
    double areaRectangulo = objRectangulo.determinarAreaRectangulo();
        System.out.println("El area del Rectangulo es: "+ areaRectangulo);
       double perimetroRectangulo = objRectangulo.determinarPerimetroRectangulo();
        System.out.println("El perimetro del Rectangulo es: "+perimetroRectangulo);
        
        
        //Cuadrado//
    Cuadrado objCuadrado =new Cuadrado(6);
    
    objCuadrado.imprimir();
    
    double areaCuadrado =objCuadrado.determinarAreaCuadrado();
        System.out.println("El area del Cuadrado es:"+areaCuadrado);
        double perimetroCuadrado =objCuadrado.determinarPerimetroCuadrado();
        System.out.println("El perimetro del Cuadrado es:"+perimetroCuadrado);
        
        
        //Triangulo//
        
     Triangulo objTriangulo = new Triangulo(2,2);
     
     
     
     objTriangulo.imprimir();
     
     double areaTriangulo =objTriangulo.determinarAreaTriangulo();
            System.out.println("El area del Triangulo es:"+areaTriangulo);
     double perimetroTriangulo = objTriangulo.calcularPerimetroTriangulo();
            System.out.println("El perimetro del Triangulo es:"+perimetroTriangulo);
     double hipotenusa= objTriangulo.calcularHipotenusaTriangulo();
            System.out.println("La hipotenusa del triangulo es:"+hipotenusa);
     String figuraTriangulo =objTriangulo.tipoTriangulo();
            System.out.println("El tipo de triangulo es:"+ figuraTriangulo);
            
     
              
     
             
             
     
     
    }
    
 }
    
