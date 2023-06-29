import java.util.Scanner;

public class Cubo extends Cuadrado {
    double altura;

    @Override
    public double calcularPerimetro() {
        double perimetroBase = super.calcularPerimetro();
        double perimetroTotal = perimetroBase * 4;
        return perimetroTotal;
    }

    @Override
    public double calcularArea() {
        double areaBase = super.calcularArea();
        double areaLateral = l * altura * 4;
        double areaTotal = areaBase * 2 + areaLateral;
        return areaTotal;
    }

    public double calcularVolumen() {
        double areaBase = super.calcularArea();
        double volumen = areaBase * altura;
        return volumen;
    }

    public void ingresarLadoYAltura() {
        ingresarLado();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la altura del cubo: ");
        altura = sc.nextDouble();
    }
}
