public class ContaCorrente extends Conta {

    private double limite;

    public double getLimite() {
        return this.limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ContaCorrente() {
        this.setSaldo(0.0);
    }

    @Override
    public void sacar(double valor) {
        if (valor > this.getSaldo() + this.limite) {
            System.out.println("Saque não efetuado.");
        } else {
            this.setSaldo(this.getSaldo() - valor);
            System.out.println("Saque realizado com sucesso. Seu novo saldo é: " + this.getSaldo());
        }
    }

}