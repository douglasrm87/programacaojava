package padraoprojeto.aula12.visitor.aluno;

public class ExibirIndentadoVisitor implements ArvoreVisitor {

	@Override
	public void visitar(Aluno no) {
		if (no == null) {
			return;
		}
		System.out.println(no);
		visitar(no.getEsquerdo(), 1);
		visitar(no.getDireito(), 1);
	}

	private void visitar(Aluno no, int qtdEspacos) {
		if (no == null) {
			return;
		}
		for (int i = 0; i < qtdEspacos; i++) {
			System.out.print("-");
		}
		System.out.println(no);
		visitar(no.getEsquerdo(), qtdEspacos + 1);
		visitar(no.getDireito(), qtdEspacos + 1);
	}

}
