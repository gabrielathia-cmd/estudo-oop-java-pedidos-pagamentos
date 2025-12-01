package classes;
import java.util.ArrayList;
import enums.Status;

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

    public ArrayList<Pedido> getPedidosbyStatus(Status status) {
        ArrayList<Pedido> pedidosF = new ArrayList<>();
        for (Pedido pedido : this.pedidos) {
            if (pedido.getStatus() == status) {
                pedidosF.add(pedido);
            }
        }
        betterviewLis(pedidosF);
        return pedidosF;
    }

//Auxiliares

    private void betterviewLis(ArrayList<Pedido> pedidosF) {
        for (int i = 0; i < pedidos.size(); i++) {
            pedidosF.get(i).mostrarPedidobyId(i);
        }
    }
}
