package edu.guilherme.pilarespoo.appsmensagem;

public class FacebookMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("[Enviando mensagem pelo Facebook Messenger..]");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("[Recebendo mensagem pelo Facebook Messenger..]");
        salvarHistoricoMensagem();
    }

    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("[SALVANDO HISTÓRICO NO FACEBOOK MESSENGER]");
    }
    
}
