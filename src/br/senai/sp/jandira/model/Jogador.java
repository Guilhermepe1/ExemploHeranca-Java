package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Jogador extends Pessoas{

    String posicao;
    int numeroCamisa;

    Scanner scanner = new Scanner(System.in);


    public void cadastrarJogador() {

        System.out.println("--------------/ Cadastro Jogador /---------------");
        super.cadastrarPessoa();
        System.out.print("Informe a posição: ");
        posicao = scanner.nextLine();
        System.out.print("Informe o número da camisa: ");
        numeroCamisa = scanner.nextInt();
        scanner.nextLine();
        System.out.println("-----------------------------------------------------");

    }

    public void printarInformacoes() {

        System.out.println("--------------/ Jogador /---------------");
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getCpf());
        System.out.println(getRg());
        System.out.println(getTelefone());
        System.out.println(getPosicao());
        System.out.println(getNumeroCamisa());

    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }
}
