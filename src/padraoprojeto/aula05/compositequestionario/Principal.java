package padraoprojeto.aula05.compositequestionario;

public class Principal {

	public static void main(String[] args) {
		Bloco blocoQuestaoA = new Bloco("A) Padr�o de Projetos");
		Questao q1 = new Questao("Q1- Qual sua experi�ncia com Patterns?");
		Questao q2 = new Questao("Q2- Usou o padr�o Composite?");
		Questao q3 = new Questao("Q3- J� utilizou o padr�o Proxy?");
		blocoQuestaoA.adicionar(q1);
		blocoQuestaoA.adicionar(q2);
		blocoQuestaoA.adicionar(q3);

		Bloco blocoQuestaoB = new Bloco("B) Patterns Estrutural.");
		Bloco blocoQuestaoB1 = new Bloco("B1) Proxy em constru��o.");

		Questao q4 = new Questao("Q4 - Onde conheceu o composite?");
		Questao q5 = new Questao("Q5 - Composite e seu amigo :)?");

		blocoQuestaoB1.adicionar(q4);
		blocoQuestaoB1.adicionar(q5);
		blocoQuestaoB.adicionar(blocoQuestaoB1);

		Bloco blocoQuestaoB2 = new Bloco("B2) Flyweigth em constru��o.");

		Questao q6 = new Questao("Q6 - Onde conheceu o Decorator?");
		Questao q7 = new Questao("Q7 - Decorator e seu amigo :)?");

		blocoQuestaoB2.adicionar(q6);
		blocoQuestaoB.adicionar(blocoQuestaoB2);
		blocoQuestaoB.adicionar(q7);
		
		Bloco blocoRaiz = new Bloco("inicio - Banco de Quest�es");
		blocoRaiz.adicionar(blocoQuestaoA);
		blocoRaiz.adicionar(blocoQuestaoB);

		System.out.println("_________________________Itens compostos");
		blocoRaiz.exibir();

	}
}
