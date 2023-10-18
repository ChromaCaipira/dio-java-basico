package edu.guilherme.pilarespoo.aulainterfaces.equipamentos.copiadora;

public class Xerox implements Copiadora {

    @Override
    public void copiar() {
        System.out.println("[COPIANDO VIA XEROX]");
    }
    
}
