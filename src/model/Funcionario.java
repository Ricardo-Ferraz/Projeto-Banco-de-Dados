package model;

public class Funcionario extends Pessoa {
    private String matricula;
    private Departamento departamento;

    public Funcionario(String nome, String sobrenome, char sexo, String rua, String numeroRua, String complmento, Veiculo veiculo, String matricula, Departamento departamento, String fone1, String fone2){
        super(nome, sobrenome, sexo, rua, numeroRua, complmento, veiculo, fone1, fone2);
        this.matricula= matricula;
        this.departamento= departamento;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("Funcionário => ");
        sb.append("{ ");
        sb.append("Nome: ").append(super.nome).append(" / ").append("Sobrenome: ").append(super.sobrenome).append(" / ").append("Sexo: ").append(super.sexo).append(" / ").append("Matrícula: ").append(this.matricula).append("\n");
        sb.append("Rua: ").append(super.rua).append(" / ").append("Número: ").append(super.numeroRua).append(" / ").append("Complemento: ").append(super.complmento).append("\n");
        sb.append("Veículo: ").append(super.veiculo.toString()).append("\n");
        sb.append(this.departamento.toString()).append("\n");
        sb.append("Fones: ").append(super.fone1).append(" / ").append(super.fone2).append("\n");
        sb.append(" }\n");
        return sb.toString();
    }
}
