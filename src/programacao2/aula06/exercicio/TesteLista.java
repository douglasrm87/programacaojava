package programacao2.aula06.exercicio;

import java.util.ArrayList;
import java.util.List;

public class TesteLista {
	public static void main(String[] args) {
		List<Integer> listaInt = new ArrayList<>();
		listaInt.add(1);
		listaInt.add(20);

		System.out.println("listaInt.get(0)" + listaInt.get(0));
		System.out.println("listaInt.get(1)" + listaInt.get(1));

		List<String> strlista = new ArrayList<>();
		strlista.add("Douglas");
		strlista.add("Rocha");
		strlista.add("Mendes");
		for (int i = 0; i < strlista.size(); i++) {
			System.out.println("Elemento: " + strlista.get(i));
		}
		Carro car;
		car = new Carro(250.00, "Ford Fiesta", 6, false, true, 4, 5, false);
		List<Carro> listaCarros = new ArrayList<>();
		listaCarros.add(car);

		car = new Carro(650.00, "Jeep", 6, false, true, 4, 5, true);
		listaCarros.add(car);
		for (int i = 0; i < listaCarros.size(); i++) {
			System.out.println("Carros:" + listaCarros.get(i));
		}

		for (int i = 0; i < listaCarros.size(); i++) {
			System.out.println("Marca Carros :" + listaCarros.get(i).getModelo());
		}
		for (Carro carro : listaCarros) {
			System.out.println("Marca Carros :" + carro.getModelo());

		}
		
		
		
		
		

	}

}
