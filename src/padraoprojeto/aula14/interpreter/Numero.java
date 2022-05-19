package padraoprojeto.aula14.interpreter;

public class Numero implements Operador {
	private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    @Override
    public int interpretar() {
        return this.numero;
    }
}