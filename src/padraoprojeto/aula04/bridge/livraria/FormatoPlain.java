package padraoprojeto.aula04.bridge.livraria;
public class FormatoPlain implements LivrariaInterface {
    @Override
    public void obterDados(String titulo) {
        System.out.println(titulo + " - Formato texto plano");
    }
}
