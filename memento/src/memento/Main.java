package memento;

public class Main {

	public static void main(String[] args) {
		Caretaker caretaker = new Caretaker();
		Information information = new Information("a", "b");
		
		caretaker.putData(information.save());
		
		System.out.println(information.getData1());
		System.out.println(information.getData2());
		
		information.setData1("a1");
		information.setData2("b1");
		
		System.out.println(information.getData1());
		System.out.println(information.getData2());
		
		Memento getSavedData = caretaker.popData();
		information.restore(getSavedData);

		System.out.println(information.getData1());
		System.out.println(information.getData2());

	}

}
