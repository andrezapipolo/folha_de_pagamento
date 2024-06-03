package Folha;

public class Pessoa {
    public String nome;
    public double salario;

    public Pessoa(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
