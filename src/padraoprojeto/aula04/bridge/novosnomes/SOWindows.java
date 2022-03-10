package padraoprojeto.aula04.bridge.novosnomes;
public class SOWindows implements SOInterface {	 
    @Override
    public void desenharJanela(String titulo) {
        System.out.println(titulo + " - Janela Windows");
    }
    @Override
    public void desenharBotao(String titulo) {
        System.out.println(titulo + " - Botão Windows");
    }
}
