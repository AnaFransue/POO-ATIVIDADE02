import java.util.Scanner;

public class ContaPoupanca {
    private double saldo;

    public ContaPoupanca(double saldo) {
        this.saldo = saldo;
    }

    public void aplicarReajuste() {
        double reajuste = saldo * 0.02; // 2% de reajuste
        saldo += reajuste;
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o saldo da conta poupança:");
        double saldoInicial = scanner.nextDouble();

        ContaPoupanca conta = new ContaPoupanca(saldoInicial);
        conta.aplicarReajuste(); // Aplica o reajuste de 2%

        System.out.println("Novo saldo após o reajuste: R$" + conta.getSaldo());

        scanner.close();
    }
}
