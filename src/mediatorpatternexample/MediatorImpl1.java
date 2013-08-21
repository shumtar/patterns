package mediatorpatternexample;

public class MediatorImpl1 extends Mediator {
	@Override
	public void send(String msg, Colegue colegue) {
		Colegue colegueForInteraction=null;
		switch (colegue.getColegueName()) {
		case ConstantDataManager.COLEGUE1:
			colegueForInteraction=colegue2;
			break;

		default:
			colegueForInteraction=colegue1;
			break;
		}
		
		if(colegueForInteraction!=null){
			colegueForInteraction.myNotify(msg);
		}
	}
}
