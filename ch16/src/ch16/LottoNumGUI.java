package ch16;

import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;

// GUI 클래스
class Lotto extends JFrame implements ActionListener{
	private JLabel lotto_num = new JLabel();;
	// 생성자
	public Lotto() {
		JButton lotto = new JButton("로또 번호 자동 생성");
		
		// 컨테이너 생성
		Container ct = getContentPane();
		// 배치관리자 설정
		ct.setLayout(new FlowLayout());
		// 컨테이너에 버튼과 라벨 추가
		ct.add(lotto);
		ct.add(lotto_num);
		
		// 이벤트 리스너 등록
		lotto.addActionListener(this);
		
		// 화면 출력
		setTitle("Lotto Number Generate");
		setSize(300, 250);
		setVisible(true);
		
	}
	// 버튼을 누르면 발생하는 이벤트
	@Override
	public void actionPerformed(ActionEvent e) {
		// Random() 클래스로 객체 생성
		Random rnd_num = new Random();
		// 로또 번호를 저장할 배열 생성
		int[] lotto_number = new int[6]; 
		// 같은 번호가 있는지 확인을 위해 변수 생성
		int temp;
		int i = 0;
		
		a : while(i < 6) {
			// 랜덤 번호 생성
			temp = rnd_num.nextInt(45)+1;
			// 배열에 저장된 값과 temp에 저장된 값을 비교하여 같으면 다시 랜덤수 발생
			for(int j = 0; j <= i; j++) {
				if(temp == lotto_number[j]) {
					continue a;
				}
			}
			// temp 값 배열에 저장
			lotto_number[i] = temp;
			i++;
		}
		// Arrays.toString은 배열을 문자열 표현으로 변환하는데 사용하는 메서드
		lotto_num.setText("이번 주 로또 당첨 번호 : " + Arrays.toString(lotto_number));
		
	}
}
// 메인클래스
public class LottoNumGUI {
	public static void main(String[] args) {
		new Lotto();
	}
}