package jogogenius;

import javax.swing.JToggleButton;

public class ComputadorDTO {
	private JToggleButton botaoPressionado = new JToggleButton();
	private int idBotao;
	public JToggleButton getBotaoPressionado() {
		return this.botaoPressionado;
	}
	public void setBotaoPressionado(JToggleButton botaoPressionado) {
		this.botaoPressionado = botaoPressionado;
	}
	public int getIdBotao() {
		return this.idBotao;
	}
	public void setIdBotao(int idBotao) {
		this.idBotao = idBotao;
	}
	 
	
	
}
