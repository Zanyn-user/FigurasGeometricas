
package ec.edu.espoch.figurasgeometricas.clases;


public class Cuadrado {
    
     public double longitud;
     
     public void imprimir (){
         System.out.println("La longitud de sus lados en centimetros del Cuadrado es :"+longitud);
     }
     
     public double determinarAreaCuadrado (){
         return (longitud * longitud);
     }
     
     public double determinarPerimetroCuadrado (){
         return (longitud *4);
     }
     
}
