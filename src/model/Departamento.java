package model;

import java.util.LinkedList;
import java.util.List;

public class Departamento {
    private int id;
    private String nome;
    List<Estacionamento> estacionamentos;

    public Departamento(int id, String nome){
        this.id = id;
        this.nome= nome;
        this.estacionamentos = new LinkedList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private int busca(int id){
        for(int i=0; i < this.estacionamentos.size(); i++){
            if(this.estacionamentos.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    public void add(Estacionamento e){
        int pos= busca(e.getId());
        if(pos == -1){
            this.estacionamentos.add(e);
        }
    }

    public void remove(Estacionamento e){
        int pos= busca(e.getId());
        if(pos != -1){
            this.estacionamentos.remove(pos);
        }
    }

    public List<Estacionamento> getEstacionamentos() {
        return estacionamentos;
    }

    public void setEstacionamentos(List<Estacionamento> estacionamentos) {
        this.estacionamentos = estacionamentos;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("{ ");
        sb.append("ID: ").append(this.id).append(" / ").append("Nome: ").append(this.nome);

        sb.append(" }");
        return sb.toString();
    }
}
