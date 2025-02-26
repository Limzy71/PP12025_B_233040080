package Pertemuan_4;

public class Node {

	private double data;
	private Node next;
	
	//	Inilisasi atribute node
	public Node(double data) {
		this.data = data;
		this.next = null;
	}
	
	//	Setter & Getter
	public double getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext (Node next) {
		this.next = next;
	}
	
}
