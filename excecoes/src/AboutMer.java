
import java.util.InputMismatchException;
import java.util.Scanner;

public class AboutMer {

	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Informe seu nome");
			String nome = scanner.next();
			
			
			System.out.println("Informe seu sobrenome");
			String sobrenome = scanner.next();
			
			
			System.out.println("Informe sua idade");
			int idade = scanner.nextInt();
			
			
			System.out.println("Informe sua altura");
			float altura = scanner.nextFloat();
			
			
			
			
			System.out.println("Meu nome é " + nome + " " + sobrenome + " e eu tenho " + 
								idade + " anos" + " e " + altura + " de altura");
			
			scanner.close();
		}catch(InputMismatchException e){
			System.out.println("Os campos de idade e altura precisam ser numericos");
		}
		
		
	}

}
