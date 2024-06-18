package pessoa;

public class SistemaCadastro {
	
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("1122312", "Luiz");
		pessoa.setEndereco("Rua 2");
		
		System.out.println("Nome: " + pessoa.getNome() + "\nCPF: " + pessoa.getCpf()
							+ "\nEndereco: " + pessoa.getEndereco());
		
		
		
		
		
	}
	

	
	
}
