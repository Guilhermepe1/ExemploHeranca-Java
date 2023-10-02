package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Juiz extends Pessoas{

    String federacao;

    Scanner scanner = new Scanner(System.in);

    public void cadastrarJuiz() {
        System.out.println("--------------/ Cadastro Juiz /---------------");
        super.cadastrarPessoa();
        System.out.print("Informe a federação: ");
        setFederacao(scanner.nextLine());
        System.out.println("-------------------------------------------------");
    }

    public void printarInformacoes() {

        System.out.println("--------------/ Juiz /---------------");
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getCpf());
        System.out.println(getRg());
        System.out.println(getTelefone());
        System.out.println(getFederacao());

    }

    public String getFederacao() {
        return federacao;
    }

    public void setFederacao(String federacao) {
        this.federacao = federacao;
    }
}
