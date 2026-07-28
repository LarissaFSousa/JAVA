package br.edu.ifpi.Model;
public class Moto extends Veiculo {

    private int cilindradas;

    @Override
    public double calcularValorAluguel(int dias) {
        return getValorDiaria() * dias;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
}
