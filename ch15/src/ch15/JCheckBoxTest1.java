package ch15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

// GUI
//1. 처리할 이벤트 종류 결정 
//2. 이벤트에 적합한 이벤트 리스너 인터페이스 사용하여 클래스 작성 - ItemListener 
class JCheckBox1 extends JFrame implements ItemListener {
	// 이벤트 처리를 위해 속성으로 객체 지정
	JTextField jtf;
	// 생성자
	public JCheckBox1() {
		// 텍스트 필드
		jtf = new JTextField(10);
		
		// 체크박스 생성
		JCheckBox jcb1 = new JCheckBox("JSP");
		JCheckBox jcb2 = new JCheckBox("PHP");
		JCheckBox jcb3 = new JCheckBox("ASP");
		JCheckBox jcb4 = new JCheckBox("Servlet");
		
		// 컨테이너 생성
		Container ct = getContentPane();
		
		// 배치관리자 설정
		ct.setLayout(new FlowLayout());
		
		// 컨테이너에 체크박스와 텍스트 필드 추가
		ct.add(jcb1);
		ct.add(jcb2);
		ct.add(jcb3);
		ct.add(jcb4);
		ct.add(jtf);
		
		// 3. 이벤트 받아들일 체크박스에 리스너 등록
		jcb1.addItemListener(this);
		jcb2.addItemListener(this);
		jcb3.addItemListener(this);
		jcb4.addItemListener(this);
		
		// 화면에 보여주기
		setTitle("JCheckBox Test1");
		setSize(250, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	// 4. 리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성
	@Override
	public void itemStateChanged(ItemEvent ie) {
		jtf.setText(((JCheckBox)ie.getItem()).getText());
	}
}
// 메인
public class JCheckBoxTest1 {
	public static void main(String[] args) {
		new JCheckBox1();
	}
}