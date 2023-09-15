package ch13;

// import java.util.*; -> 하나씩 지정 안해줄 경우
import java.util.InputMismatchException; // ctrl + shift + o
import java.util.Scanner;
/*
 * 2개의 정수를 입력 받아 나눗셈을 하는 프로그램
 */
public class ExceptionTest03 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력 : ");
		int num1 = Integer.parseInt(stdIn.next());
		System.out.print("두 번째 수 입력 : ");
		int num2 = stdIn.nextInt();
		
		try {
			System.out.println(num1 / num2);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("0으로 나눌 수 없습니다.");
			// System.out.println("해당 예외 : " + e); -> 오류를 정확히 알기 위해
			// e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("첫 번째 수는 숫자만 입력하시오.");
		} catch (InputMismatchException e) {
			System.out.println("두 번째 수는 숫자만 입력하시오.");
		} catch(Exception e) {
			System.out.println("예외가 발생했습니다.");
		} finally { // 생략 가능
			System.out.println("프로그램 종료.");
		}
		
	}
}