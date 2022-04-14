package padraoprojeto.aula09.mediator.swing;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

/**
 * Concrete mediator. All chaotic communications between concrete components
 * have been extracted to the mediator. Now components only talk with the
 * mediator, which knows who has to handle a request.
 */
public class MedEditor implements Mediator {
    private CompTitle title;
    private CompTextBox textBox;
    private CompAddButton add;
    private CompDeleteButton del;
    private CompSaveButton save;
    private CompListaItens list;
    private CompFilter filter;

    private JLabel titleLabel = new JLabel("CompTitle:");
    private JLabel textLabel = new JLabel("Text:");
    private JLabel label = new JLabel("Add or select existing note to proceed...");
  
    /**
     * Here the registration of components by the mediator.
     */
    @Override
    public void registerComponent(Component component) {
        component.setMediator(this);
        switch (component.getName()) {
            case "CompAddButton":
                this.add = (CompAddButton)component;
                break;
            case "DelButton":
            	this.del = (CompDeleteButton)component;
                break;
            case "CompFilter":
            	this.filter = (CompFilter)component;
                break;
            case "CompListaItens":
            	this.list = (CompListaItens)component;
                this.list.addListSelectionListener(listSelectionEvent -> {
                    Note note = (Note)list.getSelectedValue();
                    if (note != null) {
                        getInfoFromList(note);
                    } else {
                        clear();
                    }
                });
                break;
            case "CompSaveButton":
            	this.save = (CompSaveButton)component;
                break;
            case "CompTextBox":
            	this.textBox = (CompTextBox)component;
                break;
            case "CompTitle":
            	this. title = (CompTitle)component;
                break;
        }
    }

    /**
     * Various methods to handle requests from particular components.
     */
    @Override
    public void addNewNote(Note note) {
    	this.title.setText("");
    	this.textBox.setText("");
    	this.list.addElement(note);
    }

    @Override
    public void deleteNote() {
    	this.list.deleteElement();
    }

    @Override
    public void getInfoFromList(Note note) {
    	this. title.setText(note.getName().replace('*', ' '));
    	this.textBox.setText(note.getText());
    }

    @Override
    public void saveChanges() {
        try {
            Note note = (Note) this.list.getSelectedValue();
            note.setName(this.title.getText());
            note.setText(this.textBox.getText());
            this.list.repaint();
        } catch (NullPointerException ignored) {}
    }

    @Override
    public void markNote() {
        try {
            Note note = this.list.getCurrentElement();
            String name = note.getName();
            if (!name.endsWith("*")) {
                note.setName(note.getName() + "*");
            }
            this.list.repaint();
        } catch (NullPointerException ignored) {}
    }

    @Override
    public void clear() {
    	this. title.setText("");
    	this.textBox.setText("");
    }

    @Override
    public void sendToFilter(ListModel listModel) {
    	this.filter.setList(listModel);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void setElementsList(ListModel list) {
        this.list.setModel(list);
        this.list.repaint();
    }

    @Override
    public void hideElements(boolean flag) {
    	this. titleLabel.setVisible(!flag);
    	this. textLabel.setVisible(!flag);
    	this.title.setVisible(!flag);
    	this.textBox.setVisible(!flag);
    	this.save.setVisible(!flag);
    	this. label.setVisible(flag);
    }

    @Override
    public void createGUI() {
        JFrame notes = new JFrame("Notes");
        notes.setSize(960, 600);
        notes.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel left = new JPanel();
        left.setBorder(new LineBorder(Color.BLACK));
        left.setSize(320, 600);
        left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
        JPanel filterPanel = new JPanel();
        filterPanel.add(new JLabel("CompFilter:"));
        this.filter.setColumns(20);
        filterPanel.add(filter);
        filterPanel.setPreferredSize(new Dimension(280, 40));
        JPanel listPanel = new JPanel();
        this.list.setFixedCellWidth(260);
        listPanel.setSize(320, 470);
        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setPreferredSize(new Dimension(275, 410));
        listPanel.add(scrollPane);
        JPanel buttonPanel = new JPanel();
        this.add.setPreferredSize(new Dimension(85, 25));
        buttonPanel.add(this.add);
        this.del.setPreferredSize(new Dimension(85, 25));
        buttonPanel.add(this.del);
        buttonPanel.setLayout(new FlowLayout());
        left.add(filterPanel);
        left.add(listPanel);
        left.add(buttonPanel);
        JPanel right = new JPanel();
        right.setLayout(null);
        right.setSize(640, 600);
        right.setLocation(320, 0);
        right.setBorder(new LineBorder(Color.BLACK));
        this.titleLabel.setBounds(20, 4, 50, 20);
        this.title.setBounds(60, 5, 555, 20);
        this.textLabel.setBounds(20, 4, 50, 130);
        this.textBox.setBorder(new LineBorder(Color.DARK_GRAY));
        this.textBox.setBounds(20, 80, 595, 410);
        this.save.setBounds(270, 535, 80, 25);
        this.label.setFont(new Font("Verdana", Font.PLAIN, 22));
        this.label.setBounds(100, 240, 500, 100);
        right.add(this.label);
        right.add(this.titleLabel);
        right.add(this.title);
        right.add(this.textLabel);
        right.add(this.textBox);
        right.add(this.save);
        notes.setLayout(null);
        notes.getContentPane().add(left);
        notes.getContentPane().add(right);
        notes.setResizable(false);
        notes.setLocationRelativeTo(null);
        notes.setVisible(true);
    }
}