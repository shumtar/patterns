package mediatorpatternexample;

public class Colegue1 extends Colegue {
	
	public static final String COLEGUENAME = ConstantDataManager.COLEGUE1;

	public Colegue1(Mediator m) {
		super(COLEGUENAME, m);
	}

	@Override
	public void myNotify(String s) {
		System.out.println(s);
	}
}
