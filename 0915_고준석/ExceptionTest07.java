package ch13;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
 * 나이를 입력받아 출력하시오.
 * 입력받은 나이가 정수가 아닌 경우 예외처리 하시오.
 */
public class ExceptionTest07 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("나이를 입력 : ");
		int age = 0;
		try {
			age = stdIn.nextInt();
			System.out.println("나이는 " + age + "세 입니다.");
		} catch (InputMismatchException e) {
			System.out.println("나이는 정수로 입력해 주세요.");
		}	
	}
}
