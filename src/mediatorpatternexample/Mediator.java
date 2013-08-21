package mediatorpatternexample;

public abstract class Mediator {

	protected Colegue colegue1;
	protected Colegue colegue2;

	public Mediator() {
		super();
	}

	public Colegue getColegue1() {
		return colegue1;
	}

	public void setColegue1(Colegue colegue1) {
		this.colegue1 = colegue1;
	}

	public Colegue getColegue2() {
		return colegue2;
	}

	public void setColegue2(Colegue colegue2) {
		this.colegue2 = colegue2;
	}
	
	public abstract void send(String msg, Colegue colegue);

}