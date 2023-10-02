package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Pessoas {
    String nome;
    int idade;
    long cpf, rg, telefone;

    Scanner scanner = new Scanner(System.in);

    public Pessoas() {
        System.out.print("Informe o nome: ");
        setNome(scanner.nextLine());
        System.out.print("Informe a idade: ");
        setIdade(scanner.nextInt());
        System.out.print("Informe o CPF: ");
        setCpf(scanner.nextLong());
        System.out.print("Informe o RG: ");
        setRg(scanner.nextLong());
        System.out.print("Informe o telefone: ");
        setTelefone(scanner.nextLong());
        scanner.nextLine();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getRg() {
        return rg;
    }

    public void setRg(long rg) {
        this.rg = rg;
    }

    public long getTelefone() {
        return telefone;
    }

    public void setTelefone(long telefone) {
        this.telefone = telefone;
    }

    public void cadastrarPessoa() {
        System.out.print("Informe o nome: ");
        setNome(scanner.nextLine());
        System.out.print("Informe a idade: ");
        setIdade(scanner.nextInt());
        System.out.print("Informe o CPF: ");
        setCpf(scanner.nextLong());
        System.out.print("Informe o RG: ");
        setRg(scanner.nextLong());
        System.out.print("Informe o telefone: ");
        setTelefone(scanner.nextLong());
        scanner.nextLine();
    }
}
