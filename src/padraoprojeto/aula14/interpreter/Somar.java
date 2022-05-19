package padraoprojeto.aula14.interpreter;

public class Somar implements Operador {
	private Operador esquerda;
    private Operador direita;

    public Somar(Operador esquerda, Operador direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public int interpretar() {
        return this.esquerda.interpretar() + this.direita.interpretar();
    }
}