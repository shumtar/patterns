package commandexample;

public class OnCommand implements Command {

	ConsumerElectronics cunsumerElectronics;
	
	public OnCommand(ConsumerElectronics cunsumerElectronics) {
		super();
		this.cunsumerElectronics = cunsumerElectronics;
	}

	@Override
	public void execute() {
		cunsumerElectronics.on();
	}

}
