package classes;
import java.util.ArrayList;
import classes.abstratas.MetodoPagamento;
import enums.Status;

public class Pedido {
    private Mercado mercado;
    private ArrayList<Item> itens;
    private double valorPedido;
    private MetodoPagamento metodoPagamento;
    private Status status;

//Construtor

    public Pedido(Mercado mercado){
        this.mercado = mercado;
        this.itens = new ArrayList<>();
        this.valorPedido = 0;
        this.status = Status.Aberto;
    }

//Getters e Setters

    public Mercado getMercado() {
        return mercado;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void addItem(Item item) {
        if (validarStatus()) {
            this.itens.add(item);
            this.valorPedido += item.getValorTotal();
        } else {
            System.out.println("Pedido indisponível para adicionar itens.");
        }
    }

    public double getValorPedido() {
        return valorPedido;
    }

    public Status getStatus() {
        return status;
    }

    public MetodoPagamento getMetodoPagamento() {
        return this.metodoPagamento;
    }

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

//Métodos

    public double finalizarPedido() {
        if (this.metodoPagamento != null) {
            this.status = Status.Concluido;
            return this.valorPedido;
        }
        System.out.println("Método de pagamento ainda não selecionado.");
        this.status = Status.Pendente;
        return 0;
    }

    public void cancelarPedido() {
        this.status = Status.Cancelado;
        this.valorPedido = 0;
        this.metodoPagamento = null;
        this.itens.clear();
    }

//Auxiliares

    public boolean validarItem(Item item) {
        if (item != null) {
            return true;
        }
        return false;
    }

    public boolean validarStatus() {
        if (this.status == Status.Aberto ||  this.status == Status.Pendente) {
            return true;
        }
        return false;
    }

    public boolean validarStatusFinal() {
        if (this.status == Status.Aberto) {
            return true;
        }
        return false;
    }

    public String mostrarPedidobyId(int id) {
        return "ID " + id + " Valor Pedido: " + this.valorPedido + " Status: " + this.status;
    }

}