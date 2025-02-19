package Pertemuan_3;

public class Node {
	private int data;
	private Node next;
	
	//	Inilisasi atribute node
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	//	Setter & Getter
	public int getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public void setNext (Node next) {
		this.next = next;
	}
	
}
