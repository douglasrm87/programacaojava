package padraoprojeto.aula12.visitor.aluno;
public class ExibirPreOrdemVisitor implements ArvoreVisitor {
	@Override
	public void visitar(Aluno no) {
		if (no == null)
			return;
		System.out.println(no);
		visitar(no.getEsquerdo());
		visitar(no.getDireito());
	}
}
