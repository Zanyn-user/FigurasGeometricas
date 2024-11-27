package ec.edu.espoch.figurasgeometricas.clases;

public class Triangulo {

    public double base;
    public double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void imprimir() {
        System.out.println("La base en centimetros del Triangulo es:" + base);
        System.out.println("La altura en centimetro el Triangulo es :" + altura);

    }

    public double determinarAreaTriangulo() {
        return (base * altura) / 2;
    }

    public double calcularHipotenusaTriangulo() {
        return Math.sqrt((base * base) + (altura * altura));

    }

    public double calcularPerimetroTriangulo() {

        return base + altura + calcularHipotenusaTriangulo();
    }

    public String tipoTriangulo() {

        double hipotenusa = calcularHipotenusaTriangulo();
        if (base == altura && altura == hipotenusa) {
            return "Equilatero";

        } else if (base == altura || base == hipotenusa || altura == hipotenusa) {
            return "Isosceles";
        } else {
            return "Escaleno";

        }

    }

}
