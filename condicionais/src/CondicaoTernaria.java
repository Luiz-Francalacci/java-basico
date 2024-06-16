
import java.util.Scanner;

public class CondicaoTernaria {

	public static void main(String[] args) {
		int valor1;
		int valor2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		valor1 = scanner.nextInt();
		System.out.println("Digite o segundo valor");
		valor2 = scanner.nextInt();
		
		String resultado = valor1 > valor2? "Valor 1 é maior" : valor2 > valor1? "Valor 2 é maior":
			"Os valores são iguais";
		
		System.out.println(resultado);
		
		scanner.close();

	}

}
