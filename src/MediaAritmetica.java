import java.util.Scanner;

public class MediaAritmetica {
    private double numero1;
    private double numero2;
    private double numero3;

    public MediaAritmetica(double numero1, double numero2, double numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public double calcularMedia() {
        return (numero1 + numero2 + numero3) / 3.0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Digite o segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Digite o terceiro número:");
        double numero3 = scanner.nextDouble();

        MediaAritmetica calculadora = new MediaAritmetica(numero1, numero2, numero3);
        double media = calculadora.calcularMedia();

        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}