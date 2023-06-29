public class Esfera extends Circulo {
    @Override
    public double calcularArea() {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    public double calcularVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
    }
}
