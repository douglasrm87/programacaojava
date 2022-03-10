package padraoprojeto.aula04.bridge.janela;
public class JanelaAviso extends JanelaAbstrata {
    public JanelaAviso(JanelaImplementada j) {
        super(j);
    }
    @Override
    public void desenhar() {
        desenharJanela("Janela de Aviso");
        desenharBotao("Ok");
    }
}
