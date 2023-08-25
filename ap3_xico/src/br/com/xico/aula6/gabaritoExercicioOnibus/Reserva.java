package br.com.xico.aula6.gabaritoExercicioOnibus;

public class Reserva {
    private Passageiro passageiro;
    private Viagem viagem;
    private Assento assento;

    public Reserva(Passageiro passageiro, Viagem viagem, Assento assento) {
        this.passageiro = passageiro;
        this.viagem = viagem;
        this.assento = assento;
        viagem.realizarReserva(assento);
    }

    @Override
    public String toString() {
        return "Reserva [passageiro=" + passageiro + ", viagem=" + viagem + ", assento=" + assento + "]";
    }

}
