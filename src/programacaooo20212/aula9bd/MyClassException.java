package programacaooo20212.aula9bd;

public class MyClassException extends Exception {
	private String mensagem = " ";
	private String classe = " ";
	private String pacote = " ";
	private String metodo = " ";
	private int codigo = 0;

	
	public String getMetodo() {
		return metodo;
	}

	public void setMetodo(String metodo) {
		this.metodo = metodo;
	}

	public MyClassException() {
		super();
	}

	public MyClassException(String p_str) {
		super(p_str);
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getPacote() {
		return pacote;
	}

	public void setPacote(String pacote) {
		this.pacote = pacote;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
 
	
	/* Criar os metodos de acesso. */
}