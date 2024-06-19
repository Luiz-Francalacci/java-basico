package pilaresPoo;

import apps.ServicoMensagemInstantanea;

public class Telegram extends ServicoMensagemInstantanea{

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem pelo Telegram Messenger");
		salvarHistoricoMensagens();
		
	}
	
	
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem pelo Telegram Messenger");
		
	}
	
	
}
