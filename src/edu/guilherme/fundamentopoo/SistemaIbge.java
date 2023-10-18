package edu.guilherme.fundamentopoo;

public class SistemaIbge {
    public static void main(String[] args) {
        System.out.println("[LISTAGEM DE ESTADOS BRASILEIROS]");
        
        System.out.println("SIGLA - NOME - CÓDIGO IBGE");
        for (EstadoBrasileiro e: EstadoBrasileiro.values()) {
            System.out.println(e.getSigla() + " - " + e.getNome() + " - " + e.getIbge());
        }

        System.out.println("[MELHOR ESTADO BRASILEIRO]");
        EstadoBrasileiro eb = EstadoBrasileiro.PERNAMBUCO;

        System.out.println(eb.getNomeMaiusculo() + " - " + eb.getSigla());
    }
}
