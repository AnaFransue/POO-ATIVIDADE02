import java.util.Scanner;

public class SomaDeInteiros {
    private int numero1;
    private int numero2;

    public SomaDeInteiros(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int calcularSoma() {
        return numero1 + numero2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        int numero2 = scanner.nextInt();

        SomaDeInteiros calculadora = new SomaDeInteiros(numero1, numero2);
        int resultado = calculadora.calcularSoma();

        System.out.println("A soma dos números é: " + resultado);

        scanner.close();
    }
}