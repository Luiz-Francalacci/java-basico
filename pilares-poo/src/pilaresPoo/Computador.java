package pilaresPoo;

import apps.ServicoMensagemInstantanea;

public class Computador {

	public static void main(String[] args) {
		
		
		ServicoMensagemInstantanea smi = null;
		
		String appEscolhido = "telegram";
		
		if(appEscolhido.equals("msn")) {
			smi = new MSNMessenger();
			
		}else if(appEscolhido.equals("telegram")) {
			smi = new Telegram();
			
		}else if(appEscolhido.equals("facebook")) {
			smi = new FacebookMessenger();
			
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();
		
		
		

	}

}
