package br.edu.ifpi.Model;
import java.time.LocalDate;

public class Aluguel {

    private Veiculo veiculo;
    private Cliente cliente;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private double valorTotal;

    public Aluguel() {
        this.dataInicio = LocalDate.now();
    }

    public double calcularValorFinal() {
        long dias = java.time.temporal.ChronoUnit.DAYS.between(dataInicio, dataFim);
        valorTotal = veiculo.calcularValorAluguel((int) dias);
        return valorTotal;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}