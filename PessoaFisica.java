public class PessoaFisica {
    private String cpf;
    private char sexo;

    public PessoaFisica(String cpf, char sexo) {
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
