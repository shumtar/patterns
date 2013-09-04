package memento;

public class Memento {
	String state;

	public Memento(String saveToState) {
		super();
		this.state = saveToState;
	}

	public String getSavedState() {
		return state;
	}

}
