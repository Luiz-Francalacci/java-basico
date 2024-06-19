package produto;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorWeb;
import funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorWeb{
	
	private boolean ligado = true;
	
	public boolean getLigado() {
		return this.ligado;
	}
	
	public void desligar() {
		this.ligado = false;
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Entrando em: " + url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo nova aba");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando Pagina");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para " + numero);
		
	}

	@Override
	public void atender() {
		System.out.println("Atendendo Chamada");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Correio de Voz");
		
	}

	@Override
	public void despausar() {
		System.out.println("Despausando Musica");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Musica");
		
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Tocando Musica: " + musica);
		
	}
	
	

	
}
