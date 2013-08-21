package commandexample;

public class Button {
	Command c;

	public Button(Command c) {
		super();
		this.c = c;
	}

	public void push(){
		c.execute();
	}
}
