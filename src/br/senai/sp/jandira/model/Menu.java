package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    public void executarMenu() {

        boolean continuar = true;

        while (continuar) {

            System.out.println("==============> Menu <================");
            System.out.println(" 1- Cadastrar Jogador");
            System.out.println(" 2- Cadastrar Torcedor");
            System.out.println(" 3- Cadastrar Juiz");
            System.out.println(" 4- Cadastrar Segurança");
            System.out.println(" 5- Sair");
            System.out.println("======================================");

            int optionUser = scanner.nextInt();
            scanner.nextLine();

            switch (optionUser) {

                case 1:
                    Jogador jogador1 = new Jogador();
                    jogador1.cadastrarJogador();
                    jogador1.printarInformacoes();
                    break;
                case 2:
                    Torcedor torcedor1 = new Torcedor();
                    torcedor1.cadastrarTorcedor();
                    torcedor1.printarInformacoes();
                    break;
                case 3:
                    Juiz juiz1 = new Juiz();
                    juiz1.cadastrarJuiz();
                    juiz1.printarInformacoes();
                    break;
                case 4:
                    Seguranca seguranca1 = new Seguranca();
                    seguranca1.cadastrarSeguranca();
                    seguranca1.printarInformacoes();
                    break;
                case 5:
                    continuar = false;
                    break;
            }

        }

    }
}
