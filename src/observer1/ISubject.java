package observer1;

interface ISubject {
	void register(Observer o);

	void unregister(Observer o);

	void notifyObservers();
}