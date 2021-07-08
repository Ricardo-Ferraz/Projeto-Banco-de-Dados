package model;

import java.util.Date;

public class Convidado extends Pessoa{
    private String cpf;
    private Date data;

    public Convidado(String nome, Date data, String sobrenome, char sexo, String rua, String numeroRua, String complmento, Veiculo veiculo, String cpf, String fone1, String fone2){
        super(nome, sobrenome, sexo, rua, numeroRua, complmento, veiculo,fone1,fone2);
        this.cpf= cpf;
        this.data= data;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Convidado => { ");
        sb.append("Nome: ").append(super.nome).append(" / ").append("Sobrenome: ").append(super.sobrenome).append(" / ").append("Sexo: ").append(super.sexo).append(" / ").append("CPF: ").append(this.cpf).append("\n");
        sb.append("Rua: ").append(super.rua).append(" / ").append("Número: ").append(super.numeroRua).append(" / ").append("Complemento: ").append(super.complmento).append("\n");
        sb.append("Veículo: ").append(super.veiculo.toString()).append("\n");
        sb.append("Data de Entrada: ").append(this.data.toString()).append("\n");
        sb.append("Fones: ").append(super.fone1).append(" / ").append(super.fone2).append("\n");
        sb.append(" }\n");
        return sb.toString();
    }
}
