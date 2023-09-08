/*
 * 작성일 : 2023년 9월 8일
 * 작성자 : 컴퓨터소프트웨어공학부 202095007 고준석
 * 설명 : 추상클래스 - 동물의 울음소리를 출력하자.
 */
// 추상 클래스 - 동물
abstract class myAnimal{
	// 추상 메소드 : 동물의 소리를 반환하는 메소드
	
	// 추상 메서드는 추상 클래스나 인터페이스에서 선언되지만 실제 메서드 구현이 없는 메서드이기 떄문에 오류가 남
//	abstract String sound() {
//		
//	}
	abstract String sound();
	
	// 일반 메소드 : 동물의 기본 정보를 출력하는 메소드
	void displayInfo() {
		System.out.println("동물의 울음소리 입니다.");
	}
}

// 고양이 클래스 - 추상 클래스 상속
class myCat extends myAnimal{
	@Override
	String sound() {
		// 재정의
		return "야옹~~";
	}

	@Override
	void displayInfo() {
		// TODO Auto-generated method stub
		System.out.println("고양이 울음소리 입니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		myAnimal cat = new myCat();
		cat.displayInfo();
		System.out.println(cat.sound());;
	}

}
