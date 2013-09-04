package observerpattern.observers;

import observerpattern.observable.Observable;

public interface Observer {
	void refreshData(Observable observable);
}
