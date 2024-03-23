import java.util.Scanner;

public class ReajusteSalario {
    private double salarioAtual;
    private double percentualReajuste;

    public ReajusteSalario(double salarioAtual, double percentualReajuste) {
        this.salarioAtual = salarioAtual;
        this.percentualReajuste = percentualReajuste;
    }

    public double calcularNovoSalario() {
        return salarioAtual * (1 + percentualReajuste / 100);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário atual do funcionário:");
        double salarioAtual = scanner.nextDouble();

        System.out.println("Digite o percentual de reajuste (%):");
        double percentualReajuste = scanner.nextDouble();

        ReajusteSalario reajusteSalario = new ReajusteSalario(salarioAtual, percentualReajuste);

        double novoSalario = reajusteSalario.calcularNovoSalario();

        System.out.println("O novo salário do funcionário após o reajuste é: R$" + novoSalario);

        scanner.close();
    }
}
