import java.util.Scanner;

public class Retangulo {
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public double calcularArea() {
        return base * altura;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a base do retângulo:");
        double base = scanner.nextDouble();

        System.out.println("Digite a altura do retângulo:");
        double altura = scanner.nextDouble();

        Retangulo retangulo = new Retangulo(base, altura);

        double perimetro = retangulo.calcularPerimetro();
        double area = retangulo.calcularArea();

        System.out.println("O perímetro do retângulo é: " + perimetro);
        System.out.println("A área do retângulo é: " + area);

        scanner.close();
    }
}
