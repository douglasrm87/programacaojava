package programacao22s.thread01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TempoBRAS {
	private static final int _5000 = 8000;
	List<BaseContratos> listabase = new ArrayList<BaseContratos>();

	public static void main(String[] args) {
		new TempoBRAS().processar();
	}

	private void processar() {
		carregarBase();
		System.out.println("1 - Identificar BRAS.");
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite seu contrato");
		int contrato = leia.nextInt();
		String ret = validarLogin(contrato);
		System.out.println("Bras Logado: " + ret);

		leia.close();
	}

	private void carregarBase() {

		BaseContratos b = new BaseContratos(12345, 1);
		this.listabase.add(b);

		b = new BaseContratos(656565, 1);
		this.listabase.add(b);

		b = new BaseContratos(444222, 1);
		this.listabase.add(b);

		b = new BaseContratos(111222, 2);
		this.listabase.add(b);

		b = new BaseContratos(567890, 2);
		this.listabase.add(b);

		b = new BaseContratos(111111, 3);
		this.listabase.add(b);

		b = new BaseContratos(000111, 3);
		this.listabase.add(b);

		b = new BaseContratos(5656, 4);
		this.listabase.add(b);

		b = new BaseContratos(6565, 4);
		this.listabase.add(b);

		b = new BaseContratos(5353, 5);
		this.listabase.add(b);

		b = new BaseContratos(5555, 5);
		this.listabase.add(b);

		b = new BaseContratos(6666, 6);
		this.listabase.add(b);

		b = new BaseContratos(666667, 6);
		this.listabase.add(b);

		b = new BaseContratos(7777, 7);
		this.listabase.add(b);

		b = new BaseContratos(77778, 7);
		this.listabase.add(b);

		b = new BaseContratos(8888, 8);
		this.listabase.add(b);

		b = new BaseContratos(88889, 8);
		this.listabase.add(b);
	}

	private String validarLogin(int contrato) {
		int idBras = 0;
		for (int i = 0; i < this.listabase.size(); i++) {
			if (this.listabase.get(i).getContrato() == contrato) {
				idBras = this.listabase.get(i).getCdBras();
				break;
			}
		}
		if (validarBras01(idBras)) {
			return "primeiro BRAS";
		} else if (validarBras02(idBras)) {
			return "segundo BRAS";
		} else if (validarBras03(idBras)) {
			return "terceiro BRAS";
		} else if (validarBras04(idBras)) {
			return "quarto BRAS";
		} else if (validarBras05(idBras)) {
			return "quinto BRAS";
		} else if (validarBras06(idBras)) {
			return "sextto BRAS";
		} else if (validarBras07(idBras)) {
			return "setimo BRAS";
		} else if (validarBras08(idBras)) {
			return "oitavo BRAS";
		} else {
			return "usuário não logado";
		}

	}

	// equipamento 01
	private boolean validarBras01(int idBras) {
		System.out.println("Entrei no BRAS1");
		try {
			Thread.sleep(_5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("saindo do BRAS1");
		switch (idBras) {
		case 1:
			return true;
		}
		return false;
	}

	// equipamento 02
	private boolean validarBras02(int idBras) {
		System.out.println("Entrei no BRAS2");
		try {
			Thread.sleep(_5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("saindo do BRAS2");
		switch (idBras) {
		case 2:
			return true;
		}
		return false;
	}

	// equipamento 03
	private boolean validarBras03(int idBras) {
		System.out.println("Entrei no BRAS3");
		try {
			Thread.sleep(_5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("saindo do BRAS3");
		switch (idBras) {
		case 3:
			return true;
		}
		return false;
	}

	// equipamento 04
	private boolean validarBras04(int idBras) {
		System.out.println("Entrei no BRAS4");
		try {
			Thread.sleep(_5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("saindo do BRAS4");
		switch (idBras) {
		case 4:
			return true;
		}
		return false;
	}

	// equipamento 04
	private boolean validarBras05(int idBras) {
		System.out.println("Entrei no BRAS5");
		try {
			Thread.sleep(_5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("saindo do BRAS5");
		switch (idBras) {
		case 5:
			return true;
		}
		return false;
	}

	// equipamento 04
	private boolean validarBras06(int idBras) {
		System.out.println("Entrei no BRAS6");
		try {
			Thread.sleep(_5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("saindo do BRAS6");
		switch (idBras) {
		case 6:
			return true;
		}
		return false;
	}

	// equipamento 07
	private boolean validarBras07(int idBras) {
		System.out.println("Entrei no BRAS7");
		try {
			Thread.sleep(_5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("saindo do BRAS7");
		switch (idBras) {
		case 7:
			return true;
		}
		return false;
	}

	// equipamento 08
	private boolean validarBras08(int idBras) {
		System.out.println("Entrei no BRAS8");
		try {
			Thread.sleep(_5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("saindo do BRAS8");
		switch (idBras) {
		case 8:
			return true;
		}
		return false;
	}
}
