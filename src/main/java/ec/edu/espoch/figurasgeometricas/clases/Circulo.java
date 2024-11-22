package ec.edu.espoch.figurasgeometricas.clases;

public class Circulo {

    public double Radio;
    
    public void imprimir(){
        System.out.println("El radio en cm del Circulo es: "+Radio);
    }

    public double determinarArea() {
        return (3.1416) * (Radio * Radio);
    }
    
    public double determinarPerimetro(){
        return 2*(3.1416)*(Radio);
    }
}
