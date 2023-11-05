package ch15;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

// GUI
//1. 처리할 이벤트 종류 결정 
//2. 이벤트에 적합한 이벤트 리스너 인터페이스 사용하여 클래스 작성 
class JRadioButton1 extends JFrame implements ActionListener {
	// 이벤트 처리를 위해 속성으로 지정
	JLabel jl;
	
	JCheckBox[] jr = new JCheckBox[5];
	String[] hobby = {"걷기", "등산", "골프", "스킨스쿠버", "패러글라이딩"};
	
	JRadioButton[] jc = new JRadioButton[5];
	String[] age = {"20대", "30대", "40대", "50대", "60대"};
	// 생성자
	public JRadioButton1() {
		jl = new JLabel();
		JLabel jl1 = new JLabel("당신의 취미는?");
		JLabel jl2 = new JLabel("당신의 나이는?");
		
		JPanel hobbypanel = new JPanel();
		JPanel agepanel = new JPanel();
		
		// 나이를 나타내는 체크박스 버튼을 그룹으로 설정
		ButtonGroup gb = new ButtonGroup();
		
		for(int i = 0; i < 5; i++) {
			// 취미를 나타내는 체크박스 객체를 배열로 생성
			jr[i] = new JCheckBox(hobby[i]);
			// 나이를 나타내는 라디오 버튼 객체를 배열로 생성
			jc[i] = new JRadioButton(age[i]);
			// 판넬에 취미와 나이 추가
			hobbypanel.add(jr[i]);
			agepanel.add(jc[i]);
			
			// 라디오 버튼을 그룹에 추가
			gb.add(jc[i]);
			// 3. 이벤트 받아들일 체크박스에 리스너 등록
			jr[i].addActionListener(this);
			jc[i].addActionListener(this);
		}
		
		// 컨테이너 생성
		Container ct = getContentPane();
		
		// 배치관리자 설정
		ct.setLayout(new GridLayout(3, 1));
		
		// 판넬 1 생성
		JPanel jp1 = new JPanel();
		jp1.add(jl1);
		jp1.add(hobbypanel);
		
		// 판넬 2 생성
		JPanel jp2 = new JPanel();
		jp2.add(jl2);
		jp2.add(agepanel);
		
		// 판넬 3 생성
		JPanel jp3 = new JPanel();
		jp3.add(jl);
		
		// 컨테이너에 판넬 추가
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);
		
		// 화면에 보여주기
		setTitle("JRadioButton Test1");
		setSize(380, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	// 4. 리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성
	@Override
	public void actionPerformed(ActionEvent e) {
		String s = "당신의 취미 : ";
		for(int i = 0; i < 5; i++) {
			if(jr[i].isSelected()==true)
				s = s + hobby[i] + " ";
		}
		s = s + "| 당신의 나이 : ";
		jl.setText(s + e.getActionCommand());
	}
}

// 메인
public class JRadioButtonTest1 {
	public static void main(String[] args) {
		new JRadioButton1();
	}
}