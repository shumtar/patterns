package observerpattern.main;

import observerpattern.observable.synoptic.SynopticSource;
import observerpattern.observers.termometers.AnalogTermometer;
import observerpattern.observers.termometers.DigitalTermometer;

public class Main {
	public static void main(String[] args) {
		SynopticSource synopticSource = new SynopticSource();
		DigitalTermometer digitalTermometer = new DigitalTermometer();
		DigitalTermometer digitalTermometer2 = new DigitalTermometer();
		AnalogTermometer analogTermometer = new AnalogTermometer();
		synopticSource.register(digitalTermometer);
		synopticSource.register(digitalTermometer2);
		synopticSource.register(analogTermometer);
		synopticSource.changeTemperature(1);
	}
}
