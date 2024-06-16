package ContaBancaria;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
			
			ContaTerminal cliente = new ContaTerminal();
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Digite o numero da sua conta");
			cliente.numero = scanner.nextInt();
			
			System.out.println("Digite a agencia da sua contas");
			cliente.agencia = scanner.next();
			
			System.out.println("Digite o nome do cliente");
			cliente.nomeCliente = scanner.next();
			
			System.out.println("Digite o saldo da conta");
			cliente.saldo = scanner.nextFloat();
			
			
			
			System.out.println("Olé " + cliente.nomeCliente + ", obrigado por criar uma conta em nosso banco"
					+ ", sua agência é " + cliente.agencia + ", conta " + cliente.numero + " e seu saldo " + cliente.saldo 
					+ " ja está disponível para saque");
			
			
			scanner.close();
		}

}
