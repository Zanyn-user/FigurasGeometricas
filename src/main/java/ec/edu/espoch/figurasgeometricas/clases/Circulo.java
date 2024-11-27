package ec.edu.espoch.figurasgeometricas.clases;

public class Circulo {

    public double Radio;

    public Circulo(double Radio) {
        this.Radio = Radio;
    }
    
    
    public void imprimir(){
        System.out.println("El radio en cm del Circulo es: "+Radio);
    }

    public double determinarAreaCirculo() {
        return (3.1416) * (Radio * Radio);
    }
    
    public double determinarPerimetroCirculo(){
        return 2*(3.1416)*(Radio);
    }
}
