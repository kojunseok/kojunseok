package b_package;
import a_package.test1;
// import a_package.*; -> a_package의 모든 클래스 사용
public class test2 {

	public static void main(String[] args) {
		test1 t1 = new test1();
		System.out.println(t1.sum(10, 20));
	}

}