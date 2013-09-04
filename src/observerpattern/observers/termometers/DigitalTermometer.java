package observerpattern.observers.termometers;

import observerpattern.observable.Observable;
import observerpattern.observable.synoptic.SynopticSource;
import observerpattern.observers.Observer;

public class DigitalTermometer implements Termometer, Observer {

	private int temperature;

	@Override
	public void refreshData(Observable observable) {
		SynopticSource synopticSource=(SynopticSource) observable;
		temperature = synopticSource.getTemperature();
		System.out.println("digital termometer temperature changed. Temperature is="+temperature);
	}

	@Override
	public int viewTemperature() {
		return temperature;
	}
}
