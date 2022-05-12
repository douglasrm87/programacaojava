package padraoprojeto.aula12.visitor.aluno;
public class ExibirPostOrderVisitor implements ArvoreVisitor {
	@Override
	public void visitar(Aluno no) {
		if (no == null)
			return;
		visitar(no.getEsquerdo());
		visitar(no.getDireito());
		System.out.println(no);
	}
}
