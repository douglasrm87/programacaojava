package padraoprojeto.aula04.bridge.livraria;
public class FormatoXML implements LivrariaInterface {	 
    @Override
    public void obterDados(String titulo) {
        System.out.println(titulo + " - Formato XML");
    }
}
