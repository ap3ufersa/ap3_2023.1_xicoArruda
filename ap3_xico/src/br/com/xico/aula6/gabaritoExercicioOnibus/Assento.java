package br.com.xico.aula5.gabaritoExercicioOnibus;

public class Assento {
    private int numeroAssento;
    private TipoAssento tipo;
    private boolean disponivel;

    public Assento(int numeroAssento, TipoAssento tipo) {
        this.numeroAssento = numeroAssento;
        this.tipo = tipo;
        this.disponivel = true;
    }

    public void marcarIndisponivel() {
        this.disponivel = false;
    }

}