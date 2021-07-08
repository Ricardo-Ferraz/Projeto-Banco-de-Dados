package model;

public class Aluno extends Pessoa{
    private String matricula;
    private Curso curso;

    public Aluno(String nome, String sobrenome, char sexo, String rua, String numeroRua, String complmento, Veiculo veiculo, String matricula, Curso curso, String fone1, String fone2){
        super(nome, sobrenome, sexo, rua, numeroRua, complmento, veiculo,fone1,fone2);
        this.matricula= matricula;
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Aluno => {");
        sb.append("Nome: ").append(super.nome).append(" / ").append("Sobrenome: ").append(super.sobrenome).append(" / ").append("Sexo: ").append(super.sexo).append(" / ").append("Matrícula: ").append(this.matricula).append("\n");
        sb.append("Rua: ").append(super.rua).append(" / ").append("Número: ").append(super.numeroRua).append(" / ").append("Complemento: ").append(super.complmento).append("\n");
        sb.append("Veículo: ").append(super.veiculo.toString()).append("\n");
        sb.append("Curso: ").append(this.curso.toString()).append("\n");
        sb.append("Fones: ").append(super.fone1).append(" / ").append(super.fone2).append("\n");
        sb.append(" }\n");
        return sb.toString();
    }
}
