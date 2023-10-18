package edu.guilherme.pilarespoo.aulaspilares.appsmensagem;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    // SERÃO VISÍVEIS POR HERANÇA
    protected void validarConectadoInternet() {
        System.out.println("[Validando conexão com Internet..]");
    }
    protected abstract void salvarHistoricoMensagem();
}
