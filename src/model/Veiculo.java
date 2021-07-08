package model;

public class Veiculo {
    private String placa;
    private String modelo;
    private String cor;

    public Veiculo(String placa, String modelo, String cor){
        this.placa= placa;
        this.modelo= modelo;
        this.cor= cor;
    }



    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("{ ");
        sb.append("Placa: ").append(this.placa).append(" / ").append("Modelo: ").append(this.modelo).append(" / ").append("Cor: ").append(this.cor);
        sb.append(" }");
        return sb.toString();
    }
}
