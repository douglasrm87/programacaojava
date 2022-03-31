package padraoprojeto.aula09.mediator.swing;
import javax.swing.*;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new MedEditor();

        mediator.registerComponent(new CompTitle());
        mediator.registerComponent(new CompTextBox());
        mediator.registerComponent(new CompAddButton());
        mediator.registerComponent(new CompDeleteButton());
        mediator.registerComponent(new CompSaveButton());
        mediator.registerComponent(new CompListaItens(new DefaultListModel()));
        mediator.registerComponent(new CompFilter());

        mediator.createGUI();
    }
}