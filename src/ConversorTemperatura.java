import java.util.Scanner;

public class ConversorTemperatura {
    private double celsius;

    public ConversorTemperatura(double celsius) {
        this.celsius = celsius;
    }

    public double converterParaFahrenheit() {
        return ((9 * celsius) + 160) / 5;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius:");
        double celsius = scanner.nextDouble();

        ConversorTemperatura conversor = new ConversorTemperatura(celsius);
        double fahrenheit = conversor.converterParaFahrenheit();

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "°F");

        scanner.close();
    }
}
