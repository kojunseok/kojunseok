import java.util.Scanner;

public class test9 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int tot = 0; // 선택한 수량에 따른 금액
		int total = 0; // 총 금액
		System.out.println("-------메뉴 선택-------");
		while(true) {
			int num = 0; // 음료 개수
			
			final int ju = 1500, cof = 3000; // 가격은 변동 x
			
			System.out.print("번호 입력 -> (1) 음료[1500] (2) 커피[3000] (3) 계산[종료] : ");
			int menu = stdin.nextInt(); // 번호로 메뉴 선택
			if (menu == 3) { // 3일 경우 주문을 그만 받고 계산
				System.out.println(total + "원 계산을 도와드리겠습니다.");
				break;
			}
			else if(menu >= 1 && menu <= 2) { // menu가 1보다 크거나 같고 2보다는 작거나 같을 경우
				if(menu == 1) {
					System.out.print("음료를 선택하셨습니다. 수량을 입력해주세요 : "); // 음료 수량
					num = stdin.nextInt();
					tot = ju*num;
					total += tot;
				}
				else{
					System.out.print("커피를 선택하셨습니다. 수량을 입력해주세요 : ");
					num = stdin.nextInt();
					tot = cof*num;
					total += tot;
				}
			}
			
			else {
				System.out.println("다시 입력해 주세요.");
			}
			System.out.println(num + "개를 선택하셨습니다. 총 " + total + "원 입니다.");
		}
		
		int money = 0; // 고객이 넣는 금액
		int to = 0; // 거스름돈
		while(true) {
			System.out.print("돈을 넣어주세요 : ");
			money = stdin.nextInt();
			if(money < total) {
				System.out.println("주문 금액 보다 적습니다. 다시 넣어주세요");
			}
			else {
				to = money - total;
				System.out.println("거스름돈 " + to +"원 입니다.");
				break;
			}
			
		}
				
	}
}