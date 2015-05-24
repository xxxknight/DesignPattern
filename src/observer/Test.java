package observer;

public class Test {

	public static void main(String[] args) {
		Watched girl = new ConcreteWatched();

		Watcher w1 = new ConcreteWatcher();
		Watcher w2 = new ConcreteWatcher();
		Watcher w3 = new ConcreteWatcher();

		girl.addWatcher(w1);
		girl.addWatcher(w2);
		girl.addWatcher(w3);

		girl.notifyWatchers("hehe");

		girl.removeWatcher(w2);

		girl.notifyWatchers("buhao");

	}
}
