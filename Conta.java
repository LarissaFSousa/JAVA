public class Conta {
    private String titular;
    private int numero;
    private double saldo;

    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getNumero() {
        return numero;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
     
    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso. Seu novo saldo é: " + this.saldo);
        } else {
            System.out.println("Saque não efetuado.");
        }
    }
}


