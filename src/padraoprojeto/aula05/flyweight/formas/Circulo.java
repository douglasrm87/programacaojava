package padraoprojeto.aula05.flyweight.formas;

public class Circulo implements FormaGeometrica {
	public static int qdadeObjetosCirculo = 0;
	private String color;
	private int x;
	private int y;
	private int radius;

	public Circulo(String color) {
		this.color = color;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
	}
}
