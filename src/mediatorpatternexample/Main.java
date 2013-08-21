package mediatorpatternexample;

public class Main {
	public static void main(String[] args) {
		Mediator mediator = new MediatorImpl1();
		Colegue colegue1 = new Colegue1(mediator);
		colegue1.setMsg("mesage1");
		Colegue colegue2 = new Colegue1(mediator);
		colegue2.setMsg("mesage2");
		mediator.setColegue1(colegue1);
		mediator.setColegue2(colegue2);
		colegue1.send("myMessage");
		
		
	}
}
