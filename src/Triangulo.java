public class Triangulo extends Figura {
    double l1;
    double l2;
    double l3;

    public Triangulo() {
    }

    public double calcularPerimetro() {
        this.l1 = this.calcularDistancia(0, 1);
        this.l2 = this.calcularDistancia(0, 2);
        this.l3 = this.calcularDistancia(1, 2);
        return this.l1 + this.l2 + this.l3;
    }

    public double calcularArea() {
        double s = this.calcularPerimetro() / 2.0;
        double area = Math.sqrt(s * (s - this.l1) * (s - this.l2) * (s - this.l3));
        return area;
    }
}
