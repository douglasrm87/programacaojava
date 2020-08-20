package programacao2.aula06.exercicio;

import java.util.ArrayList;
import java.util.List;

public class Contrato {
	List<Locomocao> listalocomocao = new ArrayList<>();

	// Metodo para adicionar
	public void adicionarLocomoca(Locomocao loca) {
		this.listalocomocao.add(loca);
	}

	public double calcularItensAlugados() {
		double total = 0.0;
		for (Locomocao locomocao : this.listalocomocao) {
			total += locomocao.getPrecoDiaria() * locomocao.getQdadeDias();
			System.out.println("Item: " + locomocao);
		}
		return total;
	}

}
