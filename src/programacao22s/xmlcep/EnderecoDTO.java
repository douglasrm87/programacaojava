package programacao22s.xmlcep;

//http://cep.republicavirtual.com.br/web_cep.php?cep=17514520&formato=xml
//http://cep.republicavirtual.com.br/web_cep.php?cep=80050350&formato=txt
public class EnderecoDTO {
	private int resultado;// transient
	private String mensagem;// transient
	private String resultado_txt;// transient
	private String uf;
	private String cidade;
	private String bairro;
	private String tipo_logradouro;
	private String logradouro;
	private String numero;
	private String cep;
	private String telefone;
	private String complemento;// transiente

	public String getCep() {
		return this.cep;
	}

	public EnderecoDTO() {

	}

	public EnderecoDTO(String telefone) {
		this.telefone = telefone;
	}

	public String getMensagem() {
		return this.mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public int getResultado() {
		return this.resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public String getResultado_txt() {
		return this.resultado_txt;
	}

	public void setResultado_txt(String resultado_txt) {
		this.resultado_txt = resultado_txt;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getTipo_logradouro() {
		return this.tipo_logradouro;
	}

	public void setTipo_logradouro(String tipo_logradouro) {
		this.tipo_logradouro = tipo_logradouro;
	}

	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return this.cep + " " + this.tipo_logradouro + " " + this.logradouro + ", " + this.numero + " " + this.bairro
				+ " " + this.cidade + "-" + this.uf;
	}

	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
