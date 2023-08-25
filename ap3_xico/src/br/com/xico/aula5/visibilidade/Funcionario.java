package br.com.xico.aula6;

public class Funcionario {

    private String nomeCompleto = "SemNome";
    private Cargo cargoDoFuncionario = Cargo.SEMCARGO;
    private double salarioBruto = -1.0;
    private final double DESCONTO_SALARIO = 0.15;

    public Funcionario(String nomeCompleto, Cargo cargo, double salarioBruto) {
        this.nomeCompleto = nomeCompleto;
        this.cargoDoFuncionario = cargo;
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        return getSalarioBruto() - (getSalarioBruto() * DESCONTO_SALARIO);
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Cargo getCargoDoFuncionario() {
        return cargoDoFuncionario;
    }

    public void setCargoDoFuncionario(Cargo cargo) {
        this.cargoDoFuncionario = cargo;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    @Override
    public String toString() {
        return "Funcionario: " +
                "nomeCompleto=" + nomeCompleto +
                ", cargo=" + cargoDoFuncionario +
                ", salarioBruto=" + salarioBruto +
                ", salarioLiquido=" + getSalarioLiquido();
    }

}
