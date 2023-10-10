package edu.guilherme.controlefluxo;

public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 6;
        System.out.println("Nota: " + nota);

        // CONDICIONAL ENCANDEADA
        if (nota >= 7) { // SE MAIOR OU IGUAL A 7 = APROVADO
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) { // SE MAIOR OU IGUAL A 5 E MENOR QUE 7 = RECUPERAÇÃO
            System.out.println("Recuperação");
        } else { // SE NENHUMA DAS CONDIÇÕES ACIMA = REPROVADO
            System.out.println("Reprovado");
        }
    }
}
