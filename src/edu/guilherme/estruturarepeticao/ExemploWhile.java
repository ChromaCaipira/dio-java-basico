package edu.guilherme.estruturarepeticao;
import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        int doces = 0;
        System.out.println("Mesada: " + mesada);

        while (mesada > 0) {
            System.out.println("--------");
            double valorDoce = valorAleatorio(); // A CADA ITERAÇÃO, DARÁ UM NOVO VALOR ALEATÓRIO AO VALOR DO DOCE
            if (valorDoce > mesada) { // SE O VALOR DO DOCE EXCEDER A QUANTIA DA MESADA..
                valorDoce = mesada; // ..O VALOR DO DOCE TERÁ DE SER O VALOR ATUAL DA MESADA
            }
            System.out.println("Doce de R$ " + valorDoce + " foi adicionado ao carrinho!");
            mesada -= valorDoce;
            System.out.println("Mesada: " + mesada);
            doces++;
        }
        System.out.println("===============");
        System.out.println("Toda a mesada foi gasta em doces!");
        System.out.println("Foram comprados " + doces + " doces!");
    }
    private static double valorAleatorio() {
        // RETORNA UM VALOR ALEATÓRIO ENTRE 2 E 8
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
