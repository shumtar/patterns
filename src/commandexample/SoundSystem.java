package commandexample;

public class SoundSystem implements ConsumerElectronics {

	@Override
	public void on() {
		System.out.println("SoundSystem on");
	}

	@Override
	public void mute() {
		System.out.println("SoundSystem off");
	}


}
