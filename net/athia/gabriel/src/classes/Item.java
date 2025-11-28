package classes;
import java.util.ArrayList;

public class Item {
    private Produto produto;
    private double valorTotal;
    private int quantidade;

//Construtor

    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorTotal = this.quantidade * produto.getValor();
    }

    public Item() {
        this.produto = null;
        this.valorTotal = 0;
        this.quantidade = 0;
    }

//Getters e Setters

    public Produto getProduto() {
        if (this.produto == null) {
            System.out.println("Produto ainda não definido.");
            return null;
        }
        return this.produto;
    }

    public void setProduto(Produto produto) {
        if (this.produto == null) {
            this.produto = produto;
        } else {
            System.out.println("Já tem um produto definido nesse item: " + produto.getNome());
        }
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    public void somarValorTotal(double valor) {
        this.valorTotal += valor;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (this.quantidade < 0) {
            System.out.println("Quantidade deve ser maior que 0");
        } else {
            this.quantidade = quantidade;
            this.valorTotal = this.produto.getValor() * this.quantidade;
        }
    }

    //Métodos

    @Override
    public String toString() {
        return "Produto: " + this.produto + " | Quantidade: " + this.quantidade + " | Valor total: " + this.valorTotal;
    }

}



