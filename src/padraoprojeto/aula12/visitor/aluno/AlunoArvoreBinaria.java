package padraoprojeto.aula12.visitor.aluno;

public class AlunoArvoreBinaria {
	Aluno raiz;
	int quantidadeDeElementos;

	public AlunoArvoreBinaria(int chaveRaiz) {
		raiz = new Aluno(chaveRaiz);
		quantidadeDeElementos = 0;
	}

	public void inserir(Aluno chave) {
		inserir(chave, raiz);
	}
	
	public void remover(int chave){
	}
	
	public void buscar(int chave){
		
	}

	private void inserir(Aluno chave, Aluno no) {
		if (no.getChave() == chave.chave)
			return;
		if (chave.chave > no.getChave()) {
			if (no.getDireito() == null) {
				no.setDireito(new Aluno(chave.chave));
				quantidadeDeElementos++;
				return;
			}
			inserir(chave, no.getDireito());
		} else {
			if (no.getEsquerdo() == null) {
				no.setEsquerdo(new Aluno(chave.chave));
				quantidadeDeElementos++;
				return;
			}
			inserir(chave, no.getEsquerdo());
		}
	}

	public void aceitarVisitante(ArvoreVisitor visitor) {
		visitor.visitar(raiz);
	}
}
