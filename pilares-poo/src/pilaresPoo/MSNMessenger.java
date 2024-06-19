package pilaresPoo;

import apps.ServicoMensagemInstantanea;

public class MSNMessenger extends ServicoMensagemInstantanea{
	
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem pelo MSN Messenger");
		salvarHistoricoMensagens();
		
	}
	
	
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo MSN Messenger");
		
	}
	
	
	
	
}

