package commandexample;

import java.util.Iterator;
import java.util.List;

public class MuteAllComand implements Command {

	List<ConsumerElectronics> cunsumerElectronics;
	
	public MuteAllComand(List<ConsumerElectronics> cunsumerElectronics) {
		super();
		this.cunsumerElectronics = cunsumerElectronics;
	}

	
	@Override
	public void execute() {
		for (Iterator iterator = cunsumerElectronics.iterator(); iterator.hasNext();) {
			ConsumerElectronics cunsumerElectronics = (ConsumerElectronics) iterator.next();
			cunsumerElectronics.mute();
		}

	}

}
