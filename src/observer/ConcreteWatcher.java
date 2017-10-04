package observer;

/**
 * 具体观察者
 */
public class ConcreteWatcher implements Watcher {

	@Override
	public void update(String str) {
		System.out.println(str);
	}
}
