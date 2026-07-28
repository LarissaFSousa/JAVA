package br.edu.ifpi.Model;
public class CarroEletrico extends Carro {

    private int nivelBateria;

    public CarroEletrico() {
        this.nivelBateria = 100;
    }

    public void carregarBateria() {
        nivelBateria = 100;
    }

    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }
}