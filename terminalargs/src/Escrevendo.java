import java.util.Locale;
import java.util.Scanner;

public class Escrevendo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite seu nome: ");
		String nome = scanner.next();
		System.out.println("Digite sua idade: ");
		int idade = scanner.nextInt();	
		scanner.close();
		
		System.out.println("Nome: " + nome + "\nIdade: " + idade);
		

	}

}
