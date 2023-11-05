package ch15;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

// 1. 그룹 홀더에 추가할 각각의 홀더 객체를 JPanel 클래스를 이용하여 모두 작성
// 성별 판넬 클래스
class RadioPanel extends JPanel implements ActionListener {
	// 성별을 나타내는 라디오 버튼 그룹 만들기
	ButtonGroup gb = new ButtonGroup();
	// 레이블 생성
	JLabel jl1 = new JLabel("   당신의 성별은? : ");
	JLabel jl2 = new JLabel("");
	
	// 라디오 버튼 생성
	JRadioButton[] jr = new JRadioButton[5];
	String[] gender = {"남자", "여자"};
	
	// 생성자
	public RadioPanel() {
		// 성별을 라디오버튼 객체로 배열 생성
		for(int i = 0; i < 2; i++) {
			jr[i] = new JRadioButton(gender[i]);
			add(jr[i]); // 성별 판넬에 객체 추가
			
			// 버튼 그룹에 추가
			gb.add(jr[i]);
			
			// 리스너 등록
			jr[i].addActionListener(this);
		}
		// 판넬에 jl1, jl2 추가
		add(jl1);
		add(jl2);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// s에 선택된 값 저장
		String s = e.getActionCommand();
		jl2.setText(s); // jl2에 s의 값 출력
	}
}

// 혈액형 판넬 클래스
class ComboPanel extends JPanel implements ItemListener{
	// 레이블 생성
	JLabel jl1 = new JLabel("   당신의 혈액형은? : ");
	JLabel jl2 = new JLabel("");
	// 생성자
	public ComboPanel() {
		// 콤보 박스 객체 생성
		JComboBox<String> jcb = new JComboBox<String>();
		// 콤보 박스에 혈액형 추가
		jcb.addItem("A");
		jcb.addItem("B");
		jcb.addItem("AB");
		jcb.addItem("O");
		// 판넬에 레이블 콤보박스 추가
		add(jl1);
		add(jl2);
		add(jcb);
		// 콤보박스에 이벤트 리스너 등록
		jcb.addItemListener(this);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object s = e.getItem();
		jl2.setText(s.toString());
	}
}

// GUI 클래스
class JTabPane extends JFrame {
	public JTabPane() {
		// 컨테이너 생성
		Container ct = getContentPane();

		// 2.JTabbedPane 클래스를 이용하여 그룹 홀더 객체를 생성
		JTabbedPane jtp = new JTabbedPane();
		
		// 라디오 판넬, 콤보 판넬 객체 생성
		RadioPanel rp = new RadioPanel();
		ComboPanel cp = new ComboPanel();
		
		// 3. 작성된 JPanel 객체를 addTab() 메소드를 이용하여 JTabbedPane 객체에 추가
		jtp.addTab("성별", rp);
		jtp.addTab("혈액형", cp);
		
		// 4. 완성된 그룹 홀더(JTabbedPane)를 프레임에 추가
		ct.add(jtp);
		
		// 화면에 보여주기
		setTitle("JTabbedPane Test1");
		setSize(400, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

// 메인 클래스
public class JTabbedPaneTest1 {
	public static void main(String[] args) {
		new JTabPane();
	}
}