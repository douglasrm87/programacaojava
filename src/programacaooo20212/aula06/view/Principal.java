package programacaooo20212.aula06.view;

import programacaooo20212.aula06.model.Analista;
import programacaooo20212.aula06.model.Diretor;
import programacaooo20212.aula06.model.Funcionario;
import programacaooo20212.aula06.model.Gerente;

public class Principal {
	public static void main(String[] args) {
		Diretor d = new Diretor();
		d.aumentarSalario(10);
		Gerente g = new Gerente();
		g.aumentarSalario(10);
		Analista a = new Analista();
		a.aumentarSalario(20);
		gerarAumento (10,d);
		gerarAumento (10,g);
		gerarAumento (10,a);
		
		Funcionario fVet [] = new Funcionario [6];
		fVet [0] = new Diretor (10);
		fVet [1] = new Diretor (20);
		fVet [2] = new Analista (10);
		fVet [0] = new Analista (40);
		fVet [0] = new Gerente (10);
		fVet [0] = new Gerente  (60);
		for (int i = 0; i < fVet.length; i++) {
			gerarAumentoIntelig(fVet[i]);
		}
		
	}
	private static void gerarAumentoIntelig (Funcionario f) {
		// poli -> muitos
		// morfos -> formas Tomada de decisão para onde vou e feita em tempo de execução - late bindig.
//		f.setSalario(10);
		f.aumentarSalario(f.getSalario());
	}

	// vamos dizer que seja pedido, melhore o codigo acima, o torne para Orientado a Objetos.
	private static void gerarAumento (double param, Funcionario f) {
		// poli -> muitos
		// morfos -> formas Tomada de decisão para onde vou e feita em tempo de execução - late bindig.
		f.aumentarSalario(param);
	}

}
