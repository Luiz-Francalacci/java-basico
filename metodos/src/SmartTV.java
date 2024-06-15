
public class SmartTV {

	boolean ligada = false;
	int canal =1;
	int volume = 50;
	
	public void ligar(){
		this.ligada = true;
	}
	
	public void desligar(){
		this.ligada = false;
	}
	
	public void aumentarVolume(){
		this.volume++;
	}
	
	public void diminuirVolume(){
		this.volume--;
	}
	
	public void subirCanal() {
		this.canal ++;
	}
	
	public void descerCanal() {
		this.canal--;
	}
	
	public void escolherCanal(int canal){
		this.canal = canal;
	}
	
	
	
}
