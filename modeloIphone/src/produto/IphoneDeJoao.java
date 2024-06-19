package produto;

import java.util.Scanner;

public class IphoneDeJoao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Iphone iphoneDeJoao = new Iphone();
		
		while(iphoneDeJoao.getLigado()) {
			int opcao;
			System.out.println("Digite o numero da acao a ser realizada: ");
			System.out.println("1. Telefone");
			System.out.println("2. Safari");
			System.out.println("3. Musica");
			System.out.println("0. Delisgar: ");
			opcao = scanner.nextInt();
			
			if(opcao == 1) {
				int app = 0;
				System.out.println("Bem-Vindo a lista de contatos");
				System.out.println("Digite 1 para ligar e 2 para Correio de voz");
				app = scanner.nextInt();
				
				if(app == 1) {
					System.out.println("Digite o numero para a chamda: ");
					String numero = scanner.next();
					iphoneDeJoao.ligar(numero);
				}else {
					iphoneDeJoao.iniciarCorreioVoz();
				}
				
			}else if(opcao == 2) {
				System.out.println("Digite o URL");
				String url = scanner.next();
				iphoneDeJoao.exibirPagina(url);
				iphoneDeJoao.atualizarPagina();
				iphoneDeJoao.adicionarNovaAba();
				
			}else if(opcao == 3) {
				int flag = 0;
				while(flag ==0) {
					int app;
					System.out.println("Digite o que quer executar: \n1.Tocar Musica\n2.Play\n3.Pausar\n4.Menu Inicial");
					app = scanner.nextInt();
					if(app == 1) {
						System.out.println("Digite o nome da musica");
						String musica = scanner.next();
						iphoneDeJoao.selecionarMusica(musica);
					}else if(app == 2) {
						iphoneDeJoao.despausar();
					}else if(app == 3) {
						iphoneDeJoao.pausar();
					}else {
						flag = 1;
					}
				}
			}else if(opcao == 0) {
				iphoneDeJoao.desligar();
				
			}else {
				System.out.println("Opcao Inexistente");
				continue;
			}
			
		}
		
		
		
		
		
		
		scanner.close();
	}

}
