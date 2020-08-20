package programacao2.aula06.swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class AplicacaoSwing implements ActionListener {
	public static void main(String[] args) {
		new AplicacaoSwing().processar();
	}

	private static String labelPrefix = "Numero de cliques de botao: ";
	private int numClicks = 0;
	final JLabel label = new JLabel(labelPrefix + "0 ");

	// Especifica o look and feel para usar. Valores validos:
	// null (usa o padrao), "Metal", "System", "Motif", "GTK+"
	final static String LOOKANDFEEL = "System";

	public Component createComponents() {
		JButton button = new JButton("Eu sou um botao Swing!");
		JToggleButton buttonT = new JToggleButton("Eu sou um botao Swing!");
		button.setMnemonic(KeyEvent.VK_I);
		button.addActionListener(this);
		this.label.setLabelFor(button);

		/*
		 * Um facil caminho para colocar um espaco entre o container top-level que
		 * contem e para colocar JPanel contido tem uma borda vazia (empty).
		 */
		JPanel pane = new JPanel(new GridLayout(0, 1));
		pane.add(buttonT);
		pane.add(button);
		pane.add(this.label);
		pane.setBorder(BorderFactory.createEmptyBorder(30, // top
				30, // left
				10, // bottom
				30) // right
		);

		return pane;
	}

	private void processar() {
		criaExibeGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		this.numClicks++;
		this.label.setText(labelPrefix + this.numClicks);
	}

	private static void initLookAndFeel() {
		String lookAndFeel = null;

		if (!LOOKANDFEEL.isEmpty()) {
			if (LOOKANDFEEL.equals("Metal")) {
				lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
			} else if (LOOKANDFEEL.equals("System")) {
				lookAndFeel = UIManager.getSystemLookAndFeelClassName();
			} else if (LOOKANDFEEL.equals("Motif")) {
				lookAndFeel = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
			} else if (LOOKANDFEEL.equals("GTK+")) { // novo a partir da versao
														// 1.4.2
				lookAndFeel = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
			} else {
				System.err.println("Valor inesperado de especifico LOOKANDFEEL: " + LOOKANDFEEL);
				lookAndFeel = UIManager.getCrossPlatformLookAndFeelClassName();
			}

			try {
				UIManager.setLookAndFeel(lookAndFeel);
			} catch (ClassNotFoundException e) {
				System.err.println("Nao pode encontrar classe especifica para o look and feel:" + lookAndFeel);
				System.err.println("Voce incluiu a biblioteca L&F library no class path?");
				System.err.println("Usa o padrao look and feel.");
			} catch (UnsupportedLookAndFeelException e) {
				System.err
						.println("Nao pode ser especificado um look and feel (" + lookAndFeel + ") nesta plataforma.");
				System.err.println("Uso do padrao look and feel.");
			} catch (Exception e) {
				System.err.println("Nao pode obter especifico look and feel (" + lookAndFeel + "), por alguma razao .");
				System.err.println("Uso do padrao look and feel.");
				e.printStackTrace();
			}
		}
	}

	/**
	 * Cria um GUI e o exibe. Para thread safety, este metodo podera invocar para
	 * uma thread de disparo de evento(event-dispatching thread).
	 */
	private static void criaExibeGUI() {
		// Inicializa o look and feel.
		initLookAndFeel();

		// Faz com se tenha janelas com decoracoes agradaveis.
		JFrame.setDefaultLookAndFeelDecorated(true);

		// Cria e organiza janela.
		JFrame frame = new JFrame("AplicacaoSwing");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		AplicacaoSwing app = new AplicacaoSwing();
		Component contents = app.createComponents();
		frame.getContentPane().add(contents, BorderLayout.CENTER);

		// Exibe a janela.
		frame.pack();
		frame.setVisible(true);
	}

}
