package LELE;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Theo", 20, "123.456.789-00");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());
        System.out.println("CPF: " + pessoa1.getCpf());
    }
}
