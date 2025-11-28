package classes;
import java.util.ArrayList;

public class Mercado {
    private String nomeMercado;
    private ArrayList<Produto> produtos;
    private ArrayList<Pedido> pedidos;

//Construtor

    public Mercado(String nomeMercado) {
        this.nomeMercado = nomeMercado;
        this.produtos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

//Getters e Setters

    public String getNomeMercado() {
        return nomeMercado;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void addProdutos(Produto produto) {
        this.produtos.add(produto);
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void addPedidos(Pedido pedido) {
        this.pedidos.add(pedido);
    }

//Métodos



}
