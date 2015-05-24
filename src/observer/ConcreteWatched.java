package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteWatched implements Watched {

	private List<Watcher> list = new ArrayList<Watcher>();

	@Override
	public void addWatcher(Watcher wathcer) {
		list.add(wathcer);
	}

	@Override
	public void removeWatcher(Watcher wathcer) {
		list.remove(wathcer);
	}

	@Override
	public void notifyWatchers(String str) {
		for (Watcher watcher : list) {
			watcher.update(str);
		}
	}

}
