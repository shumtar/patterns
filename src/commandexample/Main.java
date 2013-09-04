package commandexample;

public class Main {

	public static void main(String[] args) {
		
		ConsumerElectronics consumerElectronicsTelevision = new Television();
		Command c=new OnCommand(consumerElectronicsTelevision);
		Button b = new Button(c);
		b.push();
	}
}
