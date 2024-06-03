package Folha;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o salário: ");
        double salario = scanner.nextDouble();

        Pessoa pessoa = new Pessoa(nome, salario);
        ImpostoDeRenda imposto = new ImpostoDeRenda(pessoa);
        imposto.imprimir();

        scanner.close();
    }
}
