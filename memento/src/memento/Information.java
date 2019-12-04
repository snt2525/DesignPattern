package memento;

public class Information {
	String data1;
	String data2;
	Information(String data1, String data2){
		this.data1 = data1;
		this.data2 = data2;
	}
	Memento save(){
		return new Memento(this.data1, this.data2);
	}
	void restore(Memento memento){
		this.data1 = memento.data1;
		this.data2 = memento.data2;
	}
	public String getData1() {
		return data1;
	}
	public void setData1(String data1) {
		this.data1 = data1;
	}
	public String getData2() {
		return data2;
	}
	public void setData2(String data2) {
		this.data2 = data2;
	}
}
