package model;

import java.sql.Time;
import java.sql.Date;

public class Saida {

    private Date data;
    private String horario;
    private Veiculo veiculo;
    private Estacionamento estacionamento;

    public Saida(Date data, String horario, Veiculo veiculo, Estacionamento estacionamento){
        this.data= data;
        this.horario= horario;
        this.veiculo= veiculo;
        this.estacionamento= estacionamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Estacionamento getEstacionamento() {
        return estacionamento;
    }

    public void setEstacionamento(Estacionamento estacionamento) {
        this.estacionamento = estacionamento;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("{ ");

        sb.append("Veículo: ").append(this.veiculo).append("\n");
        sb.append("Estacionamento: ").append(this.estacionamento).append("\n");
        sb.append("Data: ").append(this.data.toString()).append("\n");
        sb.append("Horário: ").append(this.horario.toString()).append("\n");
        sb.append(" }\n");

        return sb.toString();
    }
}
