public class ProgramaConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.setTitular("Max");
        conta1.setNumero(123);
        conta1.setSaldo(1500.00);

        System.out.println("Titular: " + conta1.getTitular());
        System.out.println("Número: " + conta1.getNumero());
        System.out.println("Saldo: " + conta1.getSaldo());

        conta1.sacar(500.00);
    }
}
