package classes;

import classes.abstratas.MetodoPagamento;

public class Boleto extends MetodoPagamento {

    public Boleto() {
        setNomeMetodo("Boleto");
        setTaxa(0.97);
    }

    @Override
    public double calcularValorTotal(double valorTotal) {
        return valorTotal * getTaxa();
    }
}
