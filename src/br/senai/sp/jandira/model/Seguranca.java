package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Seguranca extends Pessoas{

    String arma;

    Scanner scanner = new Scanner(System.in);

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public void cadastrarSeguranca() {
        System.out.println("--------------/ Cadastro Segurança /---------------");
        super.cadastrarPessoa();
        System.out.print("Informe a arma: ");
        setArma(scanner.nextLine());
        System.out.println("-------------------------------------------------");
    }

    public void printarInformacoes() {

        System.out.println("--------------/ Segurança /---------------");
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getCpf());
        System.out.println(getRg());
        System.out.println(getTelefone());
        System.out.println(getArma());

    }
}
