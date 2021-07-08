package model;

public class Curso {
    private int id;
    private String nome;
    private Departamento departamento;

    public Curso(int id, String nome, Departamento departamento){
        this.id= id;
        this.nome= nome;
        this.departamento= departamento;
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

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(" { ");
        sb.append("ID: ").append(this.id).append(" / ").append("Nome: ").append(this.nome).append(" / ").append("Departamento: ").append(this.departamento.toString());
        sb.append(" }\n");
        return sb.toString();
    }
}
