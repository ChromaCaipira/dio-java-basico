package edu.guilherme.estruturarepeticao;

public class ExemploForArray {
    public static void main(String[] args) {
        // Em arrays, o índice inicial é ZERO (0)
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        // FOR TRADICIONAL EM ARRAYS
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Aluno " + (i+1) + ": " + alunos[i]);
        }

        System.out.println("================");

        // FOR "ABREVIADO" / FOR EACH
        for (String aluno : alunos) {
            System.out.println("Aluno: " + aluno);
        }
    }
}
