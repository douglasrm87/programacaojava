package programacaooo20212.prova;

public class Bicicleta {
	private String cpfCliente;
	private String modeloBicicleta; 
	private String idBicicleta;
	private boolean emprestada;
	 
	
	@Override
	public String toString() {
		return "Bicicleta [cpfCliente=" + cpfCliente + ", modeloBicicleta=" + modeloBicicleta + ", idBicicleta="
				+ idBicicleta + ", emprestada=" + emprestada + "]";
	}
	public String getCpfCliente() {
		return cpfCliente;
	}
	public void setCpfCliente(String cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	public String getModeloBicicleta() {
		return modeloBicicleta;
	}
	public void setModeloBicicleta(String modeloBicicleta) {
		this.modeloBicicleta = modeloBicicleta;
	}
	public String getIdBicicleta() {
		return idBicicleta;
	}
	public void setIdBicicleta(String idBicicleta) {
		this.idBicicleta = idBicicleta;
	}
	public boolean isEmprestada() {
		return emprestada;
	}
	public void setEmprestada(boolean emprestada) {
		this.emprestada = emprestada;
	}
	public Bicicleta(String cpfCliente, String modeloBicicleta, String idBicicleta, boolean emprestada) {
		super();
		this.cpfCliente = cpfCliente;
		this.modeloBicicleta = modeloBicicleta;
		this.idBicicleta = idBicicleta;
		this.emprestada = emprestada;
	}
	
	
	
	
}
