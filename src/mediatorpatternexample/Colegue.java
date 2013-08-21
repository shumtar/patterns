package mediatorpatternexample;

public abstract class Colegue {
	String msg;
	String colegueName;
	public void setMsg(String msg) {
		this.msg = msg;
	}
	Mediator m;

	public String getColegueName() {
		return colegueName;
	}

	public void setColegueName(String colegueName) {
		this.colegueName = colegueName;
	}

	public Colegue(String colegueName,Mediator m) {
		super();
		this.m = m;
		this.colegueName=colegueName;
	}
	
	public void send(String msg){
		m.send(msg, this);
	}
	
	abstract public void myNotify(String s);
	
}
