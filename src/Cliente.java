import java.util.Scanner;

public class Cliente {
    private String nome;
    private String endereco;
    private String telefone;

    public Cliente(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente:");
        String nome = scanner.nextLine();

        System.out.println("Digite o endereço do cliente:");
        String endereco = scanner.nextLine();

        System.out.println("Digite o telefone do cliente:");
        String telefone = scanner.nextLine();

        Cliente cliente = new Cliente(nome, endereco, telefone);

        System.out.println("\nDados do cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Telefone: " + cliente.getTelefone());

        scanner.close();
    }
}
