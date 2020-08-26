package programacao22s;

public class FAQ {
	private int idPai;
	private int idItem;
	private String descItem;
	private String conteudoAluno;
	private boolean possuiArquivo = false;
	private String nomeArquivo = "";

	public int getIdPai() {
		return this.idPai;
	}

	public void setIdPai(int idPai) {
		this.idPai = idPai;
	}

	public int getIdItem() {
		return this.idItem;
	}

	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}

	public String getDescItem() {
		return this.descItem;
	}

	public void setDescItem(String descItem) {
		this.descItem = descItem;
	}

	public FAQ(int idPai, int idItem, String descItem) {
		super();
		this.idPai = idPai;
		this.idItem = idItem;
		this.descItem = descItem;
	}

	public FAQ(int idPai, int idItem, String descItem, String conteudoAluno) {
		super();
		this.idPai = idPai;
		this.idItem = idItem;
		this.descItem = descItem;
		this.conteudoAluno = conteudoAluno;
	}

	public String getConteudoAluno() {
		return this.conteudoAluno;
	}

	public void setConteudoAluno(String conteudoAluno) {
		this.conteudoAluno = conteudoAluno;
	}

	public boolean isPossuiArquivo() {
		return this.possuiArquivo;
	}

	public void setPossuiArquivo(boolean possuiArquivo) {
		this.possuiArquivo = possuiArquivo;
	}

	public String getNomeArquivo() {
		return this.nomeArquivo;
	}

	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}

	public FAQ(int idPai, int idItem, String descItem, String conteudoAluno, boolean possuiArquivo,
			String nomeArquivo) {
		super();
		this.idPai = idPai;
		this.idItem = idItem;
		this.descItem = descItem;
		this.conteudoAluno = conteudoAluno;
		this.possuiArquivo = possuiArquivo;
		this.nomeArquivo = nomeArquivo;
	}

	public FAQ() {
	}
}
