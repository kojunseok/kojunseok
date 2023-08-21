import java.util.Scanner;
class Odd {
    public int od = 0;
    public Odd(int x) {
        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                od += i;
            }
        }
    }
}

class OddEven extends Odd {
    public int ode = 0;
    public OddEven(int x) {
        super(x);
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                ode += i;
            }
        }
    }
}

class OddEvenTest extends OddEven {
    public OddEvenTest(int x) {
        super(x);
    }

    public void show() {
    	System.out.println("짝수의 합 : " + ode);
        System.out.println("홀수의 합 : " + od);
    }
}

public class test1 {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        System.out.print("숫자를 입력하세요 : ");
        int num = stdin.nextInt();
        OddEvenTest oet = new OddEvenTest(num);
        oet.show();
    }
}