package commandexample;

public class Television implements ConsumerElectronics {

	@Override
	public void on() {
		System.out.println("television on");
	}

	@Override
	public void mute() {
		System.out.println("television off");
	}


}
