package ch12;

public class WrapTest1 {

	public static void main(String[] args) {
		Integer i = Integer.valueOf(1) + Integer.valueOf(2);
		switch(i) {
		case 3:
			System.out.print("three");
			break;
		default:
			System.out.println("other");
			break;
		}
	}

}
