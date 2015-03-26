package strategy2;

import java.util.List;

public class Environment {
	private SortInterface sortInterface;

	public Environment() {

	}

	public Environment(SortInterface sortInterface) {
		this.sortInterface = sortInterface;
	}

	public SortInterface getSortInterface() {
		return sortInterface;
	}

	public void setSortInterface(SortInterface sortInterface) {
		this.sortInterface = sortInterface;
	}

	public void sort(List<Person> list) {
		this.sortInterface.sort(list);
	}

}
