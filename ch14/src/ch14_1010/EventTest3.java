package ch14_1010;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 독립된 이벤트 처리 클래스를 이용한 이벤트 처리
 */
// 이벤트 처리 클래스
// 1. 처리할 이벤트 종류 결정 - ActionEvent
// 2. 이벤트에 적합한 이벤트 리스너 인터페이스 사용하여 클래스 작성 - ActionListener
class EventClass implements ActionListener{
	JLabel jl;
	
	// 생성자를 통해 JLabel 객체 공유
	public EventClass(JLabel jl) {
		this.jl = jl;
	}
	
	// 4. 리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성
	@Override
	public void actionPerformed(ActionEvent e) {
		jl.setText(e.getActionCommand());
	}
}
// GUI 클래스 - 버튼 2개와 레이블 1개
class Event3 extends JFrame {
	// JLabel 객체를 속성으로 등록
	JLabel jl;
	public Event3() {
	// 컨테이너 생성
	Container ct = getContentPane();
			
	// 배치 관리자 설정 FlowLayout
	ct.setLayout(new FlowLayout());
			
	// JButton 객체를 속성으로 2개 등록
	JButton jb1, jb2;
		
	jb1 = new JButton("안녕하세요.");
	jb2 = new JButton("행복한 하루입니다.");
	
	// JLabel 객체 생성
    jl = new JLabel(); // 레이블 생성
    
	// 컨테이너에 버튼과 레이블 등록
	ct.add(jb1);
	ct.add(jb2);
	ct.add(jl);
	
	// 3. 이벤트를 받아들일 컴포넌트에 리스너 등록
	jb1.addActionListener(new EventClass(jl));
	jb2.addActionListener(new EventClass(jl));
	
	setTitle("이벤트 테스트3");
	setSize(300, 200);
	// 윈도우 창 종료시 프로세스 닫기
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	// 화면에 출력
	setVisible(true);
	}
}
// 메인 클래스
public class EventTest3 {
	public static void main(String[] args) {
		new Event3();
	}

}
