package edu.guilherme.pilarespoo.aulaspilares.appsmensagem;

public class MSNMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("[Enviando mensagem pelo MSN Messenger..]");
        salvarHistoricoMensagem();
    }

    @Override
    public void receberMensagem() {
        System.out.println("[Recebendo mensagem pelo MSN Messenger..]");
        salvarHistoricoMensagem();
    }

    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("[SALVANDO HISTÓRICO NO MSN MESSENGER]");
    }
    
}
