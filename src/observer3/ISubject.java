package observer3;

interface ISubject {
	void register(IObserver o);

	void unregister(IObserver o);

	void notifyObservers(int i);
}