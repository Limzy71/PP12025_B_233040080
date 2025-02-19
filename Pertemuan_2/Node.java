package Pertemuan_2;

public class Node {
		private int nilai;
		private Node next;
		
		//inisialisasi Node 
		public Node(int nilai) {
			this.nilai = nilai;
		}
		
		//Getter dan Setter
		public int getNilai() {
			return nilai;
		}
		
		public Node getNext () {
			return next;
		}

		public void setNext (Node next) {
			this.next = next;
		}
		
	}