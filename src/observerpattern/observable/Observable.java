package observerpattern.observable;

import observerpattern.observers.Observer;

public interface Observable {
	void notifyObservers();

	void register(Observer observer);

	void unRegister(Observer observer);
}
