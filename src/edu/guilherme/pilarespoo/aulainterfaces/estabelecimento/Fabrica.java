package edu.guilherme.pilarespoo.aulainterfaces.estabelecimento;

import edu.guilherme.pilarespoo.aulainterfaces.equipamentos.copiadora.Copiadora;
import edu.guilherme.pilarespoo.aulainterfaces.equipamentos.copiadora.Xerox;
import edu.guilherme.pilarespoo.aulainterfaces.equipamentos.digitalizadora.Digitalizadora;
import edu.guilherme.pilarespoo.aulainterfaces.equipamentos.digitalizadora.Scanner;
import edu.guilherme.pilarespoo.aulainterfaces.equipamentos.impressora.Deskjet;
import edu.guilherme.pilarespoo.aulainterfaces.equipamentos.impressora.Impressora;
import edu.guilherme.pilarespoo.aulainterfaces.equipamentos.impressora.Laserjet;
import edu.guilherme.pilarespoo.aulainterfaces.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Xerox xerox = new Xerox();
        Scanner scanner = new Scanner();
        Deskjet deskjet = new Deskjet();
        Laserjet laserjet = new Laserjet();

        xerox.copiar();
        scanner.digitalizar();
        deskjet.imprimir();
        laserjet.imprimir();

        System.out.println("========================");

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Copiadora copiadora = em;
        Digitalizadora digitalizadora = em;
        Impressora impressora = em;

        // em.copiar();
        // em.digitalizar();
        // em.imprimir();

        copiadora.copiar();
        digitalizadora.digitalizar();
        impressora.imprimir();
    }
}
