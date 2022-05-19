package padraoprojeto.aula14.interpreter.sobrecarga;

public class Aluno implements Faculdade {
	private double notaTrabalho;
    
    public Aluno(double notaTrabalho ) {
        this.notaTrabalho = notaTrabalho;
         
    }

    @Override
    public double interpretar() {
        return this.notaTrabalho;
    }
}