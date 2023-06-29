public class Piramide extends Triangulo {
    double altura;

    public Piramide() {
    }

    public double calcularArea() {
        double areaBase = super.calcularArea(); // Área de la base triangular
        double areaLateral = calcularAreaLateral(); // Área lateral de la pirámide
        return areaBase + areaLateral;
    }

    public double calcularVolumen() {
        double areaBase = super.calcularArea(); // Área de la base triangular
        return (areaBase * altura) / 3.0;
    }

    public double calcularAreaLateral() {
        double perimetroBase = super.calcularPerimetro(); // Perímetro de la base triangular
        double alturaPiramide = calcularAltura(); // Altura de la pirámide
        return (perimetroBase * alturaPiramide) / 2.0;
    }

    public double calcularAltura() {
        double l1 = this.calcularDistancia(0, 1); // Longitud de un lado del triángulo base
        double l2 = this.calcularDistancia(0, 2); // Longitud de otro lado del triángulo base
        double l3 = this.calcularDistancia(1, 2); // Longitud del tercer lado del triángulo base
        double s = super.calcularPerimetro() / 2.0; // Semiperímetro del triángulo base
        double areaBase = super.calcularArea(); // Área de la base triangular
        return (2.0 * areaBase) / (l1 + l2 + l3);
    }
}
