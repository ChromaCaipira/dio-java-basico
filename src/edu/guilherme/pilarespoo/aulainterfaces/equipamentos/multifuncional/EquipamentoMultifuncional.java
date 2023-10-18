package edu.guilherme.pilarespoo.aulainterfaces.equipamentos.multifuncional;

import edu.guilherme.pilarespoo.aulainterfaces.equipamentos.copiadora.Copiadora;
import edu.guilherme.pilarespoo.aulainterfaces.equipamentos.digitalizadora.Digitalizadora;
import edu.guilherme.pilarespoo.aulainterfaces.equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    @Override
    public void copiar() {
        System.out.println("[COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL]");
    }

    @Override
    public void digitalizar() {
        System.out.println("[DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL]");
    }

    @Override
    public void imprimir() {
        System.out.println("[IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL]");
    }
    
}
