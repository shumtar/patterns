package observerpattern.observable.synoptic;

import java.util.HashSet;

import observerpattern.observable.Observable;
import observerpattern.observers.Observer;

public class SynopticSource implements Observable {
	
	private int temperature=0;
	
	public void changeTemperature(int value) {
		if(value!=0){
			temperature+=value;
		}
		notifyObservers();
	}
	
	public int getTemperature() {
		return temperature;
	}
	
	private HashSet<Observer> observers;

	public SynopticSource() {
		observers = new HashSet<Observer>();
	}
	
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.refreshData(this);
		}
	}

	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void unRegister(Observer observer) {
		observers.remove(observer);
	}
}
