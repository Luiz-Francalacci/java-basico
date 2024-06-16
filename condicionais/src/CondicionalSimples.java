
import java.util.Scanner;

public class CondicionalSimples {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int valor1;
		int valor2;
		
		System.out.println("Digite o primeiro valor");
		valor1 = scanner.nextInt();
		System.out.println("Digite o segundo valor");
		valor2 = scanner.nextInt();
		
		if(valor1 > valor2) {
			System.out.println("O primeiro valor " + valor1 + " é maior que o segundo " + valor2);
		}else if(valor2 > valor1){
			System.out.println("O segundo valor " + valor2 + " é maior que o primeiro " + valor1);
		}else {
			System.out.println("Os valores são iguais");
		}
		
		
		scanner.close();

	}

}
