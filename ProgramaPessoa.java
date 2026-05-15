public class ProgramaPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Max", "01/01/1990");
        System.out.println("Nome: " + pessoa1.getNome());
        System.out.println("Data de Nascimento: " + pessoa1.getDataNasc());

        PessoaFisica pf1 = new PessoaFisica("123.456.789-00", 'M');
        System.out.println("CPF: " + pf1.getCpf());
        System.out.println("Sexo: " + pf1.getSexo());

        PessoaJuridica pj1 = new PessoaJuridica("12.345.678/0001-00");
        System.out.println("CNPJ: " + pj1.getCnpj());
    }
}
