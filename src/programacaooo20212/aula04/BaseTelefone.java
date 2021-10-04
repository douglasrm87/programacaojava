package programacaooo20212.aula04;

public class BaseTelefone {
	// atributos da classe
	String[] gravacao = new String[5];
	int indiceGravacao = 0;
	boolean status = false;

	// metodos da classe.
	public void ligarTelefone() {
		this.status = true;
	}

	// Porque este metodo nao recebe nada de parametro?
	// Porque? este metodos apenas atuara com os atributos da propria classe.
	public void desligarTelefone() {
		this.status = false;

	}

	// Sobrecarga de m�todos ou Overload.
	// Termos m�todos com mesmo nome, porem com assinaturas diferentes.

	// Recebe um numero como par�metro
	public void efetuarLigacao(int numero) {
		System.out.println("Ligando para: " + numero);

	}

	// recebe o n�mero e o ddd como par�metro
	public void efetuarLigacao(int numero, int DDD) {

	}

	// recebe o n�mero e o ddd como par�metro
	// 41 9-9261-9070
	public void efetuarLigacao(String numero, int DDD) {
		if (numero.length() > 15) {
			System.out.println("Quantidade de Digitos invalida.");
		}
	}

	private String removerCaracteresTelefone(String telefone) {
		if (telefone != null && telefone.length() > 8) {
			telefone = telefone.replace("-", "");
			telefone = telefone.replace(" ", "");
		}
		return telefone;

	}

	public void gravarConversa(String conversa) {
		/*
		 * Poderemos gravar no m�ximo 5 conversas. 
		 * Caso seja solicitada uma sexta
		 * grava��o sobrepor a primeira e assim por diante. Lembram da Lista Circular?
		 */
		if (this.indiceGravacao < 5) {
			this.gravacao[this.indiceGravacao] = conversa;
			this.indiceGravacao++;
		}
		else {
			this.indiceGravacao = 0;
			this.gravacao[this.indiceGravacao] = conversa;
			this.indiceGravacao++;
		}
	}

	public String obterConversa(int idAudio) {

		return null;
	}

}
