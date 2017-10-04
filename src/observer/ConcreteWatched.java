package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体被观察者/可观察者
 */
public class ConcreteWatched implements Watched {

	private List<Watcher> list = new ArrayList<>();

	@Override
	public void addWatcher(Watcher watcher) {
		list.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		list.remove(watcher);
	}

	@Override
	public void notifyWatchers(String str) {
		for (Watcher watcher : list) {
			watcher.update(str);
		}
	}

}
