package apps;

public abstract class ServicoMensagemInstantanea {

	public abstract void enviarMensagem();
	
	public abstract void receberMensagem();
	
	public void salvarHistoricoMensagens() {
		System.out.println("Salvando Historico Mensagens");
	}
	
	protected void validarConectadoInternet() {
		System.out.println("Validando Conexao");
	}
	
	
}
