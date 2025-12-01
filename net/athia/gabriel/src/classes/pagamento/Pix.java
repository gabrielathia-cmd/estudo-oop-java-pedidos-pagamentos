package classes.pagamento;

import classes.abstratas.MetodoPagamento;

public class Pix extends MetodoPagamento {

    public Pix() {
        setNomeMetodo("Pix");
        setTaxa(0);
    }

    @Override
    public double calcularValorTotal(double valorTotal) {
        return valorTotal;
    }
}
