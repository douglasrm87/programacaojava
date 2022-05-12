package padraoprojeto.aula12.visitor.aluno;

public class Cliente {
	public static void main(String[] args) {
		AlunoArvoreBinaria arvore = new AlunoArvoreBinaria(7);

		arvore.inserir(new Aluno (15));
		arvore.inserir(new Aluno (10));
		arvore.inserir(new Aluno (5));
		arvore.inserir(new Aluno (2));
		arvore.inserir(new Aluno (1));
		arvore.inserir(new Aluno (20));

		System.out.println("### Exibindo em ordem ###");
		arvore.aceitarVisitante(new ExibirInOrderVisitor());
		System.out.println("### Exibindo pre ordem ###");
		arvore.aceitarVisitante(new ExibirPreOrdemVisitor());
		System.out.println("### Exibindo pos ordem ###");
		arvore.aceitarVisitante(new ExibirPostOrderVisitor());
		System.out.println("### Exibindo identado ###");
		arvore.aceitarVisitante(new ExibirIndentadoVisitor());
	}
}
