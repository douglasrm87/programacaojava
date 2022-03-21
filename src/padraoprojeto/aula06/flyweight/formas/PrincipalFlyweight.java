package padraoprojeto.aula06.flyweight.formas;

public class PrincipalFlyweight {
	private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };

	public static void main(String[] args) {
		// loop de 20 vezes porem Criará 5 objetos

		for (int i = 0; i < 20; ++i) {
			Circulo circle = (Circulo) FormaGeometricaFactory.getCircle(getRandomColor());
			circle.setX(getRandomX());
			circle.setY(getRandomY());
			circle.setRadius(100);
			circle.draw();
		}
		System.out.println("Objetos de Circulo Criados:" + Circulo.qdadeObjetosCirculo);
	}

	private static String getRandomColor() {
		return colors[(int) (Math.random() * colors.length)];
	}

	private static int getRandomX() {
		return (int) (Math.random() * 100);
	}

	private static int getRandomY() {
		return (int) (Math.random() * 100);
	}
}
