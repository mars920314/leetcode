package memento;

import java.util.HashMap;

public class Storage {
	private HashMap<String, Memento> memMap = new HashMap<String, Memento>();
	public Memento getMemento(String index){
		return memMap.get(index);
	}
	public void setMemento(String index, Memento memento){
		this.memMap.put(index, memento);
	}
}
