package padraoprojeto.aula12.visitor.aluno;
public class Aluno {
	protected int chave;
	Aluno esquerdo, direito;
	public Aluno(int chave) {
		this.chave = chave;
		esquerdo = null;
		direito = null;
	}
	@Override
	public String toString() {
		return "Aluno [chave=" + chave + "]";
	}
	public int getChave() {
		return chave;
	}
	public Aluno getEsquerdo() {
		return esquerdo;
	}
	public void setEsquerdo(Aluno esquerdo) {
		this.esquerdo = esquerdo;
	}
	public Aluno getDireito() {
		return direito;
	}
	public void setDireito(Aluno direito) {
		this.direito = direito;
	}
}
