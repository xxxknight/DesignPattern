package observer;

public interface Watched {
	public void addWatcher(Watcher wathcer);

	public void removeWatcher(Watcher wathcer);

	public void notifyWatchers(String str);

}
