import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Figura figura = null;

        int opcionFigura;
        do {
            mostrarMenuFiguras();
            opcionFigura = sc.nextInt();
            sc.nextLine();

            switch (opcionFigura) {
                case 1:
                    figura = crearTriangulo();
                    break;
                case 2:
                    figura = crearCuadrado();
                    break;
                case 3:
                    figura = crearCirculo();
                    break;
                case 4:
                    figura = crearPiramide();
                    break;
                case 5:
                    figura = crearEsfera();
                    break;
                case 6:
                    figura = crearCubo();
                    break;

            }

            if (figura != null) {
                int opcionCalculo;
                do {
                    mostrarMenuCalculo();
                    opcionCalculo = sc.nextInt();
                    sc.nextLine();

                    switch (opcionCalculo) {
                        case 1:
                            System.out.println("Área: " + figura.calcularArea());
                            break;
                        case 2:
                            System.out.println("Perímetro: " + figura.calcularPerimetro());
                            break;
                        case 3:
                            if (figura instanceof Piramide) {
                                System.out.println("Volumen: " + ((Piramide) figura).calcularVolumen());
                            } else if (figura instanceof Esfera) {
                                System.out.println("Volumen: " + ((Esfera) figura).calcularVolumen());
                            } else if (figura instanceof Cubo) {
                                System.out.println("Volumen: " + ((Cubo) figura).calcularVolumen());
                            } else {
                                System.out.println("Opción no válida para esta figura.");
                            }
                    }
                } while (opcionCalculo != 4);
            }
        } while (true);
    }

    public static void mostrarMenuFiguras() {
        System.out.println("Seleccione una figura:");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Círculo");
        System.out.println("4. Pirámide");
        System.out.println("5. Esfera");
        System.out.println("6. Cubo");
        System.out.println("7. Salir");
    }

    public static void mostrarMenuCalculo() {
        System.out.println("Seleccione que calculo desea hacer:");
        System.out.println("1. Calcular área");
        System.out.println("2. Calcular perímetro");
        System.out.println("3. Calcular volumen");
        System.out.println("4. Regresar");
    }

    public static Triangulo crearTriangulo() {
        Triangulo triangulo = new Triangulo();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresar las coordenadas del punto " + (i + 1) + ":");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
            sc.nextLine();

            Punto punto = new Punto(x, y, z);
            triangulo.listaPuntos.add(punto);
        }

        return triangulo;
    }

    public static Cuadrado crearCuadrado() {
        Cuadrado cuadrado = new Cuadrado();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar el lado del cuadrado:");
        double lado = sc.nextDouble();
        cuadrado.l = lado;

        return cuadrado;
    }

    public static Circulo crearCirculo() {
        Circulo circulo = new Circulo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar el radio del círculo:");
        double radio = sc.nextDouble();
        circulo.r = radio;

        return circulo;
    }

    public static Piramide crearPiramide() {
        Piramide piramide = new Piramide();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar la altura de la pirámide:");
        double altura = sc.nextDouble();
        piramide.altura = altura;

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresar las coordenadas del punto " + (i + 1) + ":");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double z = sc.nextDouble();
            sc.nextLine();

            Punto punto = new Punto(x, y, z);
            piramide.listaPuntos.add(punto);
        }

        return piramide;
    }

    public static Esfera crearEsfera() {
        Esfera esfera = new Esfera();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar el radio de la esfera:");
        double radio = sc.nextDouble();
        esfera.r = radio;

        return esfera;
    }

    public static Cubo crearCubo() {
        Cubo cubo = new Cubo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresar el lado del cubo:");
        double lado = sc.nextDouble();
        cubo.l = lado;

        System.out.println("Ingresar la altura del cubo:");
        double altura = sc.nextDouble();
        cubo.altura = altura;

        return cubo;
    }
}
