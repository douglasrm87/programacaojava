package padraoprojeto.aula09.mediator.swing;

/**
 * Concrete components don't talk with each other. They have only one
 * communication channel–sending requests to the mediator.
 */
public class Note {
	private String name;
	private String text;

	public Note() {
		name = "New note";
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getName() {
		return name;
	}

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return name;
	}
}