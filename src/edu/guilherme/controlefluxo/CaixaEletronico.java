package edu.guilherme.controlefluxo;

public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 26.0;

        System.out.println("Saldo: " + saldo);
        System.out.println("Valor Solicitado: " + valorSolicitado);

        // CONDICIONAL SIMPLES
        /* if (valorSolicitado < saldo) { // APENAS SE A CONDICIONAL É VERDADEIRA
        /    saldo -= valorSolicitado;
        /}
        */

        // CONDICIONAL COMPOSTA
        if (valorSolicitado < saldo) {
            saldo -= valorSolicitado;
        } else {
            System.out.println("VALOR SOLICITADO EXCEDEU O SALDO!");
        }

        System.out.println("Saldo atual: " + saldo);
    }
}
