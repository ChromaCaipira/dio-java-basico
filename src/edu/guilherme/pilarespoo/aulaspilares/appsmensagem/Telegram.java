package edu.guilherme.pilarespoo.aulaspilares.appsmensagem;

public class Telegram extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("[Enviando mensagem pelo Telegram..]");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("[Recebendo mensagem pelo Telegram..]");
        salvarHistoricoMensagem();
    }

    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("[SALVANDO HISTÓRICO NO TELEGRAM]");
    }
    
}
