package padraoprojeto.aula04.bridge.novosnomes;
public class JanelaDialogo extends JanelaAbstrata {
    public JanelaDialogo(SOInterface j) {
        super(j);
    }
    @Override
    public void desenhar() {
        desenharJanela("Janela de Diálogo");
        desenharBotao("Botão Sim");
        desenharBotao("Botão Não");
        desenharBotao("Botão Cancelar");
    }
}
