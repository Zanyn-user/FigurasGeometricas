

package ec.edu.espoch.figurasgeometricas;

import ec.edu.espoch.figurasgeometricas.clases.Circulo;


public class FigurasGeometricas {

    public static void main(String[] args) {
       Circulo objCirculo = new Circulo();
       objCirculo.Radio = 5;
       
       objCirculo.imprimir();
       double area = objCirculo.determinarArea();
        System.out.println("El area del Circulo es: "+ area);
       double perimetro = objCirculo.determinarPerimetro();
        System.out.println("El perimetro del Circulo es: "+perimetro);
    }
}
