import java.util.Scanner;

public class ConsumoCombustivel {
    private double tempoViagem;
    private double velocidadeMedia;

    public ConsumoCombustivel(double tempoViagem, double velocidadeMedia) {
        this.tempoViagem = tempoViagem;
        this.velocidadeMedia = velocidadeMedia;
    }

    public double calcularDistancia() {
        return tempoViagem * velocidadeMedia;
    }

    public double calcularLitrosConsumidos() {
        double distanciaPercorrida = calcularDistancia();
        return distanciaPercorrida / 12.0; // 12 km/l de autonomia
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tempo decorrido na viagem (em horas):");
        double tempoViagem = scanner.nextDouble();

        System.out.println("Digite a velocidade média durante a viagem (em km/h):");
        double velocidadeMedia = scanner.nextDouble();

        ConsumoCombustivel consumo = new ConsumoCombustivel(tempoViagem, velocidadeMedia);

        double litrosConsumidos = consumo.calcularLitrosConsumidos();
        double distanciaPercorrida = consumo.calcularDistancia();

        System.out.println("Distância percorrida na viagem: " + distanciaPercorrida + " km");
        System.out.println("Litros de combustível consumidos na viagem: " + litrosConsumidos + " litros");

        scanner.close();
    }
}
