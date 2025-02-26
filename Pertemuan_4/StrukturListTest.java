package Pertemuan_4;

public class StrukturListTest {
	public static void main(String[] args) {
		StrukturList List = new StrukturList();
		
		List.addTail(2.1);
		List.addTail(5.5);
		List.addMid(4.5, 2);
		List.addMid(1.1, 2);
		List.addHead(3.4);
		
		System.out.println("Element: ");
		List.displayElement();
		
	}
}