package padraoprojeto.aula14.interpreter.sobrecarga;

public class TrabalhoGrupo implements Faculdade {
	private Aluno esquerda;
    private Aluno direita;

    public TrabalhoGrupo(Aluno esquerda, Aluno direita) {
        this.esquerda = esquerda;
        this.direita = direita;
        
    }

    @Override
    public double interpretar() {
        return (this.esquerda.interpretar() + this.direita.interpretar())/2;
    }
}