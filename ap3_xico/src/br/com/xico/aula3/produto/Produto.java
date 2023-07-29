package br.com.xico.aula3.produto;

public class Produto {
    String nome = "SemNome";
    double preco = -1.0;
    int quantEstoque = -1;

    public Produto(String nome, double preco, int quantEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }

    public void acrescentarEstoque(int quantidade) {
        quantEstoque = quantEstoque + quantidade;
    }

    public void removerEstoque(int quantidade) {
        quantEstoque = quantEstoque - quantidade;
    }

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

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantEstoque=" + quantEstoque + "]";
    }

}