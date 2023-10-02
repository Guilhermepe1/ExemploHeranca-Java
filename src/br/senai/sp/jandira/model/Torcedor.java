package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Torcedor extends Pessoas {

    String setor;

    Scanner scanner = new Scanner(System.in);

    public void cadastrarTorcedor() {
        System.out.println("--------------/ Cadastro Torcedor /---------------");
        super.cadastrarPessoa();
        System.out.print("Informe o setor: ");
        setSetor(scanner.nextLine());
        System.out.println("-------------------------------------------------");

    }

    public void printarInformacoes() {

        System.out.println("--------------/ Torcedor /---------------");
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getCpf());
        System.out.println(getRg());
        System.out.println(getTelefone());
        System.out.println(getSetor());

    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
