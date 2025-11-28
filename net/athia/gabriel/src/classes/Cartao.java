package classes;

import classes.abstratas.MetodoPagamento;

public class Cartao extends MetodoPagamento {

    public Cartao() {
        setNomeMetodo("Cartao de Crédito");
        setTaxa(1.03);
    }

    @Override
    public double calcularValorTotal(double valorTotal) {
        return valorTotal * getTaxa();
    }
}
