package classes;
import classes.abstratas.MetodoPagamento;

public class Cliente {
    private String nome;
    private String cpf;
    private MetodoPagamento metodoPagamento;
    private Pedido pedido;

//Construtores

    public Cliente(String nome, String cpf, MetodoPagamento metodoPagamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.metodoPagamento = metodoPagamento;
        this.pedido = null;
    }

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.metodoPagamento = null;
        this.pedido = null;
    }

//Getters e Setters

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getCpf() {return cpf;}

    public void setCpf(String cpf) {this.cpf = cpf;}

    public MetodoPagamento getMetodoPagamento() {return metodoPagamento;}

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {this.metodoPagamento = metodoPagamento;}

    public Pedido getPedido() {return pedido;}

    public void  adicionarPedido(Mercado mercado) {this.pedido = new Pedido(mercado);}
}
