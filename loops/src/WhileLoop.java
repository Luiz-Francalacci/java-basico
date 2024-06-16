
public class WhileLoop {

	public static void main(String[] args) {
		
		int flag = 0;
		int numero = 0;
		
		while(flag != 5) {
			numero = numero + (numero + 1);
			flag++;
		}

		System.out.println(numero);
		
	}

}
