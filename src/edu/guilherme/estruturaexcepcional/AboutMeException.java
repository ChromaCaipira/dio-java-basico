package edu.guilherme.estruturaexcepcional;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMeException {
    public static void main(String[] args) {
        try {
        // CRIAÇÃO DO OBJETO SCANNER
        Scanner scanner = new Scanner(System.in);

        // TÍTULO DO PROGRAMA
        System.out.println("[ABOUTME 3.0 - ENTRADA DO USUÁRIO]");

        // ENTRADAS [INPUT] DO USUÁRIO
        System.out.println("> Insira seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("> Insira seu sobrenome: ");
        String sobrenome = scanner.nextLine();

        System.out.println("> Insira sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("> Insira seu altura: ");
        double altura = scanner.nextDouble();

        // SAÍDAS [OUTPUT] DO PROGRAMA
        System.out.println("\n=-=-=-=-=-=");
        System.out.println("Então, seu nome é " + nome + " " + sobrenome);
        System.out.println("Você tem " + idade + " anos");
        System.out.println("(Teria se estivesse vivo- ..brincadeira XD");
        System.out.println("você provavelmente ainda está vivo, se deu entrada nesse programa.. ainda)");
        System.out.println("E, por fim, tem " + altura + "cm de altura");
        System.out.println("=-=-=-=-=-=\n");

        System.out.println("Caramba! É bastante coisa! ..espero que esses dados não caiam em mãos erradas..");
        System.out.println(":p");
        System.out.println("[FIM DO PROGRAMA]");

        scanner.close();
        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos e utilizar PONTO para decimais");
        }
    }
}
