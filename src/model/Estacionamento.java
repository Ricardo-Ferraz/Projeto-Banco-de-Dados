package model;

public class Estacionamento {

    private String nome;
    private int id;
    private int qtdVagas;

    public Estacionamento(int id,String nome, int qtd){
        this.id= id;
        this.nome= nome;
        this.qtdVagas= qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdVagas() {
        return qtdVagas;
    }

    public void setQtdVagas(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString(){
        StringBuilder sb= new StringBuilder("{ ");
        sb.append("Nome: ").append(this.nome).append(" / ").append("Quantidade de vagas: ").append(this.qtdVagas);
        sb.append(" }");
        return sb.toString();
    }
}
