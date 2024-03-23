import java.util.Scanner;

public class AntecessorESucessor {
    private int numero;

    public AntecessorESucessor(int numero) {
        this.numero = numero;
    }

    public int getAntecessor() {
        return numero - 1;
    }

    public int getSucessor() {
        return numero + 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scanner.nextInt();

        AntecessorESucessor calculadora = new AntecessorESucessor(numero);
        int antecessor = calculadora.getAntecessor();
        int sucessor = calculadora.getSucessor();

        System.out.println("O Antecessor de " + numero + " é: " + antecessor);
        System.out.println("O Sucessor de " + numero + " é: " + sucessor);

        scanner.close();
    }
}
