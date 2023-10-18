package edu.guilherme.pilarespoo;

import java.util.Scanner;

import edu.guilherme.pilarespoo.appsmensagem.FacebookMessenger;
import edu.guilherme.pilarespoo.appsmensagem.MSNMessenger;
import edu.guilherme.pilarespoo.appsmensagem.ServicoMensagemInstantanea;
import edu.guilherme.pilarespoo.appsmensagem.Telegram;

public class ComputadorMensagens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ServicoMensagemInstantanea smi = null;

        System.out.println("INSIRA UM DOS 3 APPS DE MENSAGEM:\n[msn / fcb / tlg]");
        String appEscolhido = scan.nextLine();
        scan.close();

        switch (appEscolhido) {
            case "msn":
                smi = new MSNMessenger();
                break;
            case "fcb":
                smi = new FacebookMessenger();
                break;
            case "tlg":
                smi = new Telegram();
                break;
            default:
                System.out.println("APP INVÁLIDO");
                break;
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
