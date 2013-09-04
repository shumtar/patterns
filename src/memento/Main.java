package memento;

public class Main {
	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Originator originator = new Originator();
		originator.setStriingState("state1");
		originator.setStriingState("state2");
		caretaker.addMemento(originator.saveToMomento());
		originator.setStriingState("state3");
		caretaker.addMemento(originator.saveToMomento());
		originator.setStriingState("state4");

		System.out.println(caretaker.getMemento(1).getSavedState());
	}
}
