package programacaooo20212.aula07.view;

public interface OperadorDouble {
	public Double aplicar(Double a, Double b);
	default public Double resgatar(Double a, Double b){
		return a - b;
	}

}
