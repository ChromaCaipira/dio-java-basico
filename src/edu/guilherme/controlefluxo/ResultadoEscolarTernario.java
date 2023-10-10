package edu.guilherme.controlefluxo;

public class ResultadoEscolarTernario {
    public static void main(String[] args) {
        int nota = 6;
        System.out.println("Nota: " + nota);
        // CONDIÇÃO TERNÁRIA
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
