import java.util.Scanner;
class Add{
	public int add(int x, int y) {
		return x + y;
	}
}

public class test3 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("두 수 입력 : ");
		int num1 = stdin.nextInt();
		int num2 = stdin.nextInt();
		Add add = new Add();
		System.out.println("두 수의 합은 " + add.add(num1, num2) + "입니다.");
	}

}
