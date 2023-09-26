package ch13_0926;

import java.io.*;
import java.util.Scanner;
// 이 클래스를 직렬화 할 것임을저장
class PersonInfo implements Serializable {
	String name; // 멤버변수
	String city;
	int age;
	// 생성자.
	public PersonInfo(String name, String city, int age) {
		this.name = name; // 매개변수로 전달받은 값을 멤버 변수에 저장.
		this.city = city;
		this.age = age;
	}
}
public class ObjectWrite01 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner stdin = new Scanner(System.in);
		System.out.print("출력 파일명을 입력하세요 : ");
		String fileName = stdin.next();
		
		String s1 = "***고객정보***";
		
		// 직렬화된 객체를 2개 생성
		PersonInfo p1 = new PersonInfo("고준석", "창원", 23);
		PersonInfo p2 = new PersonInfo("홍길동", "서울", 20);
		
		// 직렬화된 객체를 2진수로 기록할 파일을 저장.
		// 객체를 기록할 수 있는 ObjectOutputStream 객체 생성
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
		
		// 직렬화된 객체를 파일에 2진수로 기록한다.
		oos.writeObject(s1);
		oos.writeObject(p1);
		oos.writeObject(p2);
		
		oos.close();
		System.out.println(fileName + "파일명으로 객체 파일을 생성하였습니다.");
	}
}