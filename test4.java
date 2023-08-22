import java.util.Scanner;

class Fac{ // 두 개의 수 사이의 모든 합
	public int num = 0; // 총합
	public int Fact(int x, int y) {
		if(x > y) { // 처음 입력 받은 값이 클 경우
			for(int i = y; i <= x; i++) { // 두번째 값 부터 첫번째 값 까지 1씩 증가하여 모두 더함
				num += i;
			}
		}
		else { // 처음 입력 받은 값이 작을 경우
			for(int i = x; i <= y; i++) { // 첫번째 값 부터 두번째 값 까지 1씩 증가하여 모두 더함
				num += i;
			}
		}
		return num;
	}
}


class Fac1{ // 홀 수의 합
	public int num = 0;
	public int Fac1(int x, int y) {
		if(x > y) { // 첫 값이 클 경우
			for(int i = y; i <= x; i++) {
				if(i % 2 != 0) {
					num += i;
				}
			}
		}
		else { // 다음 값이 클 경우
			for(int i = x; i <= y; i++) {
				if(i % 2 != 0) {
					num += i;
				}
			}
		}
		return num;
	}
}

class Fac2{
	public int num = 0;
	public int Fac2(int x, int y) {
		if(x > y) { // 첫 값이 클 경우
			for(int i = y; i <= x; i++) {
				if(i % 2 == 0) {
					num += i;
				}
			}
		}
		else { // 다음 값이 클 경우
			for(int i = x; i <= y; i++) {
				if(i % 2 == 0) {
					num += i;
				}
			}
		}
		return num;
	}
}
public class test4 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		System.out.print("두 수 입력 : ");
		int num1 = stdin.nextInt();
		int num2 = stdin.nextInt();
		Fac fac = new Fac();
		Fac1 fac1 = new Fac1();
		Fac2 fac2 = new Fac2();
		
		System.out.printf("%d 와 %d 사이의 모든 합은 %d 입니다.\n",num1, num2 ,fac.Fact(num1, num2));
		System.out.printf("%d 와 %d 사이의 홀수의 합은 %d 입니다.\n",num1, num2 ,fac1.Fac1(num1, num2));
		System.out.printf("%d 와 %d 사이의 짝수의 합은 %d 입니다.\n",num1, num2 ,fac2.Fac2(num1, num2));
	}

}
