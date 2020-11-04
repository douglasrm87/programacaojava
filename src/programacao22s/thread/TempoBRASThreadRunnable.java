package programacao22s.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TempoBRASThreadRunnable {
	List<BaseContratos> listabase = new ArrayList<BaseContratos>();

	public static void main(String[] args) {
		new TempoBRASThreadRunnable().processar();
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

		// estas linhas precisam mudar.
		// vamos usar Thrads neste ponto do programa.
		BRASThread1Runnable bThread1 = new BRASThread1Runnable();
		BRASThread2Ruunable bThread2 = new BRASThread2Ruunable();
		BRASThread3 bThread3;
		BRASThread4 bThread4;
		BRASThread5 bThread5;
		BRASThread6 bThread6;
		BRASThread7 bThread7;
		BRASThread8 bThread8;

		Thread bras1 = new Thread(bThread1);
		Thread bras2 = new Thread(bThread2);
		bras1.start(); // vai demorar pelo menos 8 segundos
		bras2.start(); // vai demorar pelo menos 8 segundos
		bThread3 = new BRASThread3(idBras);
		bThread3.start(); // vai demorar pelo menos 8 segundos

		bThread4 = new BRASThread4(idBras);
		bThread4.start(); // vai demorar pelo menos 8 segundos

		bThread5 = new BRASThread5(idBras);
		bThread5.start(); // vai demorar pelo menos 8 segundos

		bThread6 = new BRASThread6(idBras);
		bThread6.start(); // vai demorar pelo menos 8 segundos

		bThread7 = new BRASThread7(idBras);
		bThread7.start(); // vai demorar pelo menos 8 segundos

		bThread8 = new BRASThread8(idBras);
		bThread8.start(); // vai demorar pelo menos 8 segundos

		do {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(bThread1.isFim() + " " + bThread2.isFim() + " " + bThread3.isFim() + " "
					+ bThread4.isFim() + " " + bThread5.isFim() + " " + bThread6.isFim() + " " + bThread7.isFim() + " "
					+ bThread8.isFim());

		} while (!bThread1.isFim() && !bThread2.isFim() && !bThread3.isFim() && !bThread4.isFim() && !bThread5.isFim()
				&& !bThread6.isFim() && !bThread7.isFim() && !bThread8.isFim());

		if (bThread1.isRet()) {
			return "primeiro BRAS";
		} else if (bThread2.isRet()) {
			return "segundo BRAS";
		} else if (bThread3.isRet()) {
			return "terceiro BRAS";
		} else if (bThread4.isRet()) {
			return "quarto BRAS";
		} else if (bThread5.isRet()) {
			return "quinto BRAS";
		} else if (bThread6.isRet()) {
			return "sexto BRAS";
		} else if (bThread7.isRet()) {
			return "seétimop BRAS";
		} else if (bThread8.isRet()) {
			return "oitavo BRAS";
		} else {
			return "usuario não logado";
		}

	}

}
