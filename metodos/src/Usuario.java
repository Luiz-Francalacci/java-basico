
public class Usuario {

	public static void main(String[] args) {
		SmartTV smart = new SmartTV();
		
		
		System.out.println(smart.ligada);
		System.out.println(smart.canal);
		System.out.println(smart.volume);
		smart.ligar();
		System.out.println(smart.ligada);
		smart.aumentarVolume();
		smart.aumentarVolume();
		System.out.println(smart.volume);
		smart.diminuirVolume();
		System.out.println(smart.volume);
		smart.subirCanal();
		System.out.println(smart.canal);
		smart.descerCanal();
		System.out.println(smart.canal);
		smart.escolherCanal(150);
		System.out.println(smart.canal);
		
		
		
		


	}

}
