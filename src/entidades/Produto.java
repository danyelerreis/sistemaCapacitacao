package entidades;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double calcularValoorEstoque(){
        double value;
        value = preco * quantidade;
        return (value);
    }
    public void adicionarProdutos(int quantidade){
        this.quantidade+= quantidade;
    }
    public void removerProdutos(int quantidade){
        this.quantidade-= quantidade;
    }

}

