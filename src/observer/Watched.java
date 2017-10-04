package observer;

/**
 * 被观察接口
 */
public interface Watched {
	public void addWatcher(Watcher wathcer);

	public void removeWatcher(Watcher wathcer);

	public void notifyWatchers(String str);

}
