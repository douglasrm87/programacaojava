package padraoprojeto.aula06.flyweight.formas;
import java.util.HashMap;
public class FormaGeometricaFactory {
	private static final HashMap<String, FormaGeometrica> circleMap = new HashMap<>();

	public static FormaGeometrica getCircle(String color) {
		// Forma Otimizada para criar objetos. S� cria um novo se n�o existir um j�
		// criado no Mapa da Interface Map
		Circulo circle = (Circulo) circleMap.get(color);
		if (circle == null) {
			Circulo.qdadeObjetosCirculo ++;
			circle = new Circulo(color);
			circleMap.put(color, circle);
			System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}
}
