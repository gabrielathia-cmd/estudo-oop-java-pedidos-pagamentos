package classes.abstratas;

public abstract class MetodoPagamento {
    private String nomeMetodo;
    private double taxa;

//Getters e Setters

    public String getNomeMetodo() {
        return nomeMetodo;
    }

    public void setNomeMetodo(String nomeMetodo) {
        this.nomeMetodo = nomeMetodo;
    }

    public double getTaxa() {
        return this.taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

//Métodos

    public abstract double calcularValorTotal(double valorTotal);

}
