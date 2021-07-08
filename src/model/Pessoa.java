package model;


public class Pessoa {
    protected String nome;
    protected String sobrenome;
    protected char sexo;
    protected String rua;
    protected String numeroRua;
    protected String complmento;
    protected Veiculo veiculo;
    protected String fone1;
    protected String fone2;

    public Pessoa(String nome, String sobrenome, char sexo, String rua, String numeroRua, String complmento, Veiculo veiculo, String fone1, String fone2){
        this.nome= nome;
        this.sobrenome= sobrenome;
        this.sexo= sexo;
        this.rua= rua;
        this.numeroRua= numeroRua;
        this.complmento= complmento;
        this.veiculo= veiculo;
        this.fone1= fone1;
        this.fone2= fone2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumeroRua() {
        return numeroRua;
    }

    public void setNumeroRua(String numero_rua) {
        this.numeroRua = numero_rua;
    }

    public String getComplmento() {
        return complmento;
    }

    public void setComplmento(String complmento) {
        this.complmento = complmento;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getFone1() {
        return fone1;
    }

    public void setFone1(String fone1) {
        this.fone1 = fone1;
    }

    public String getFone2() {
        return fone2;
    }

    public void setFone2(String fone2) {
        this.fone2 = fone2;
    }
}
