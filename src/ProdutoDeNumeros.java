import java.util.Scanner;

public class ProdutoDeNumeros {
    private int numero1;
    private int numero2;

    public ProdutoDeNumeros(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public int calcularProduto() {
        return numero1 * numero2;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        ProdutoDeNumeros calculadora = new ProdutoDeNumeros(numero1, numero2);
        int resultado = calculadora.calcularProduto();

        System.out.println("O Produto dos números é: " + resultado);

        scanner.close();

    }

}
