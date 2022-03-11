package padraoprojeto.aula04.decorator.cachaca;

public class Refrigerante extends CoquetelDecorator {

	public Refrigerante(Coquetel umCoquetel) {
		super(umCoquetel);
		nome = "Refrigerante";
		preco = 1.0;
	}

}
