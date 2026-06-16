package Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BancoAgenciaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Banco banco = new Banco();
        System.out.print("Digite o número do banco: ");
        banco.setNumero(Integer.parseInt(scanner.nextLine().trim()));

        System.out.print("Digite o nome do banco: ");
        banco.setNome(scanner.nextLine().trim());

        System.out.print("Quantas agências o banco terá? ");
        int quantidadeAgencias = Integer.parseInt(scanner.nextLine().trim());

        List<Agencia> agencias = new ArrayList<>();
        for (int i = 1; i <= quantidadeAgencias; i++) {
            System.out.println("\nAgência " + i + ":");
            Agencia agencia = new Agencia();

            System.out.print("  Digite o número da agência: ");
            agencia.setNumero(Integer.parseInt(scanner.nextLine().trim()));

            System.out.print("  Digite o nome da agência: ");
            agencia.setNome(scanner.nextLine().trim());

            agencias.add(agencia);
        }

        banco.setAgencias(agencias);

        System.out.println("\nDados cadastrados:");
        System.out.println("Número do Banco: " + banco.getNumero());
        System.out.println("Nome do Banco: " + banco.getNome());
        System.out.println("Agências:");
        for (Agencia agencia : banco.getAgencias()) {
            System.out.println("- Número: " + agencia.getNumero()
                    + ", Nome: " + agencia.getNome());
        }

        scanner.close();
    }

}