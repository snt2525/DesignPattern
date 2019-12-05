package memento;

import java.util.Stack;

public class Caretaker {
	private Stack<Memento> save;
	
	Caretaker(){
		this.save = new Stack<>();
	}
	
	public void putData(Memento memento){
		save.push(memento);
	}
	
	public Memento popData(){
		return save.pop();
	}
	
}
