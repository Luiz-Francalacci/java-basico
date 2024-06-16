
public class ForArrays {

	public static void main(String[] args) {
		String alunos[] = {"Felipe", "Jorge", "Manoel", "Beatriz"};
		
		for(int i = 0; i < alunos.length; i++) {
			System.out.println("Indice: " + i + "\nAluno: " + alunos[i]);
		}
		
		for(String aluno : alunos) {
			System.out.println(aluno);
		}

	}

}
