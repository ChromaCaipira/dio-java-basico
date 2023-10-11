package edu.guilherme.estruturarepeticao;
import java.util.Random;

public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("[Discando..]");
        do {
            System.out.println("[Telefone tocando..]");
        }
        while(tocando()); // Continua o do/while até que a função "tocando()" retorne "falso"

        System.out.println("> Alô!?");
    }
    private static boolean tocando() {
        // A expressão booleana espera que o número aleatório, entre 0 e 3, iguale a 1 para se tornar verdadeira
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("[Atendeu?]: " + atendeu);
        // Inverte o valor booleando para negar o ato de continuar tocando, caso se torne verdadeira
        return ! atendeu;
    }
}
