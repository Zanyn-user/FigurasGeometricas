
package ec.edu.espoch.figurasgeometricas.clases;


public class Rectangulo {
     public double baseRec;
     public double alturaRec;
     
     
     public void imprimir (){
         System.out.println("La base del rectangulo en cm es: "+baseRec);
         System.out.println("La altura del rectagulo en cm es: "+alturaRec);
         
     }
     public double determinarAreaRectangulo(){
         return baseRec * alturaRec;
     } 
     public double determinarPerimetroRectangulo(){
         return (2*baseRec)+(2*alturaRec);
     }
}
