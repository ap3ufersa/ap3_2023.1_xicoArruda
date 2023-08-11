package br.com.xico.aula4;

import java.util.LinkedList;

public class Banco {

    String nomeDoBanco = "X&A Bank of Angicos";
    LinkedList<ContaBancaria> contasBancarias;

    public String imprimeTodasAsContas() {
        String todasAsContas = "Contas atuais:" + "\n";

        for (int i = 0; i < contasBancarias.size(); i++) {
            todasAsContas += contasBancarias.get(i).toString() + "\n";
        }

        return todasAsContas;
    }

    public void adicionaConta(ContaBancaria novaConta) {
        contasBancarias.add(novaConta);
    }

    public void removeConta(int numeroDaConta) {
        for (int i = 0; i < contasBancarias.size(); i++) {
            if (contasBancarias.get(i).getNumConta() == numeroDaConta)
                contasBancarias.remove(i);

        }
    }

    public String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public void setNomeDoBanco(String nomeDoBanco) {
        this.nomeDoBanco = nomeDoBanco;
    }

    public LinkedList<ContaBancaria> getContasBancarias() {
        return contasBancarias;
    }

    public void setContasBancarias(LinkedList<ContaBancaria> contasBancarias) {
        this.contasBancarias = contasBancarias;
    }

    @Override
    public String toString() {
        return "Banco=" + nomeDoBanco +
                "Contas=" + imprimeTodasAsContas();
    }

}
