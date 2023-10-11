package edu.guilherme.estruturarepeticao;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // "INSTA" SAI DO FOR, QUANDO i SE TORNA IGUAL A 3, E NÃO DÁ CHANCE PARA IMPRIMIR ALÉM DISSO
            }
            System.out.println(i);
        }
        System.out.println("=============");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // INTERROMPE APENAS A ITERAÇÃO DE QUANDO i FOR IGUAL A 3 E "CONTINUA" ITERAÇÕES SEGUINTES
            }
            System.out.println(i);
        }
    }
}
