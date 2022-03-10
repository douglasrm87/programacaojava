package padraoprojeto.aula04.bridge.janela;
public class JanelaWindows implements JanelaImplementada {	 
    @Override
    public void desenharJanela(String titulo) {
        System.out.println(titulo + " - Janela Windows");
    }
    @Override
    public void desenharBotao(String titulo) {
        System.out.println(titulo + " - Botão Windows");
    }
}
