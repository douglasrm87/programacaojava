package padraoprojeto.aula05.compositequestionario;

public class Principal {

	public static void main(String[] args) {
		Bloco blocoQuestaoA = new Bloco("A) Padrão de Projetos");
		Questao q1 = new Questao("Q1- Qual sua experiência com Patterns?");
		Questao q2 = new Questao("Q2- Usou o padrão Composite?");
		Questao q3 = new Questao("Q3- Já utilizou o padrão Proxy?");
		blocoQuestaoA.adicionar(q1);
		blocoQuestaoA.adicionar(q2);
		blocoQuestaoA.adicionar(q3);

		Bloco blocoQuestaoB = new Bloco("B) Patterns Estrutural.");
		Bloco blocoQuestaoB1 = new Bloco("B1) Proxy em construção.");

		Questao q4 = new Questao("Q4 - Onde conheceu o composite?");
		Questao q5 = new Questao("Q5 - Composite e seu amigo :)?");

		blocoQuestaoB1.adicionar(q4);
		blocoQuestaoB1.adicionar(q5);
		blocoQuestaoB.adicionar(blocoQuestaoB1);

		Bloco blocoQuestaoB2 = new Bloco("B2) Flyweigth em construção.");

		Questao q6 = new Questao("Q6 - Onde conheceu o Decorator?");
		Questao q7 = new Questao("Q7 - Decorator e seu amigo :)?");

		blocoQuestaoB2.adicionar(q6);
		blocoQuestaoB.adicionar(blocoQuestaoB2);
		blocoQuestaoB.adicionar(q7);
		
		Bloco blocoRaiz = new Bloco("inicio - Banco de Questões");
		blocoRaiz.adicionar(blocoQuestaoA);
		blocoRaiz.adicionar(blocoQuestaoB);

		System.out.println("_________________________Itens compostos");
		blocoRaiz.exibir();

	}
}
