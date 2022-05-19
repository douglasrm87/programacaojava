package padraoprojeto.aula14.interpreter.sobrecarga;

public class Principal {
	public static void main(String[] args) { 
		
		Aluno aluno1 = new Aluno(50);
		Aluno aluno2 = new Aluno(90);
		TrabalhoGrupo trabGrupo = new TrabalhoGrupo (aluno1,aluno2);
		System.out.println(trabGrupo.interpretar());
	}

}