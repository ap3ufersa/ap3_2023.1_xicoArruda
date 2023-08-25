package br.com.xico.aula6;

import java.util.ArrayList;

public class Empresa {

    ArrayList<Funcionario> meusFuncionarios = new ArrayList<Funcionario>();

    public Empresa() {
        meusFuncionarios.add(new Funcionario("Xico", Cargo.DIRETOR, 2000.0));
        meusFuncionarios.add(new Funcionario("Wellington", Cargo.GERENTE, 1000.0));
    }
}
