package mediatorpatternexample;

public class Colegue2 extends Colegue {
	
	public static final String COLEGUENAME =ConstantDataManager.COLEGUE2;

	public Colegue2(Mediator m) {
		super(COLEGUENAME, m);
	}

	@Override
	public void myNotify(String s) {
		System.out.println(s);
	}
}
