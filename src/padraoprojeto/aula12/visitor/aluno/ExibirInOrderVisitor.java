package padraoprojeto.aula12.visitor.aluno;
public class ExibirInOrderVisitor implements ArvoreVisitor {
	@Override
	public void visitar(Aluno no) {
		if (no == null)
			return;
		this.visitar(no.getEsquerdo());
		System.out.println(no);
		this.visitar(no.getDireito());
	}
}
