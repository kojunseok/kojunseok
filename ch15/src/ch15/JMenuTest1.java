package ch15;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;

//GUI 클래스
class JMenu1 extends JFrame implements ActionListener{
	JTextField jtf; // 선택한 메뉴 출력 영역
	// 생성자
	public JMenu1() {
		// 컨테이너 생성
		Container ct = getContentPane();
		// 레이아웃 - BorderLayout
		ct.setLayout(new BorderLayout());
		
		// 1. JMenuBar() 객체 생성
		JMenuBar jmb = new JMenuBar();
		
		// 2. JMenu 객체 생성
		JMenu menu1 = new JMenu("파일");
		JMenu menu2 = new JMenu("편집");
		
		// 3. 서브 메뉴 JMenuItem 객체로 생성
		// 4. 메뉴가 완성될 때까지 2-3번을 반복
		
		  // 메뉴 1번
		JMenuItem jmi = new JMenuItem("새파일");
		jmi.addActionListener(this); // 이벤트 리스너 등록
		menu1.add(jmi); // menu1 메뉴에 추가
		
		jmi = new JMenuItem("저장하기");
		jmi.addActionListener(this);
		menu1.add(jmi);
		
		
		// 메뉴 2번
		JMenuItem jmi2 = new JMenuItem("열기");
		jmi2.addActionListener(this);
		menu2.add(jmi2); // menu2 메뉴에 추가
		
		jmi2 = new JMenuItem("잘라내기");
		jmi2.addActionListener(this);
		menu2.add(jmi2); // menu2 메뉴에 추가
		
		jmi2 = new JMenuItem("복사");
		jmi2.addActionListener(this);
		menu2.add(jmi2); // menu2 메뉴에 추가
		// 3. 서브 메뉴 JCheckBoxMenuItem() 객체 생성
		JCheckBoxMenuItem jcbmi = new JCheckBoxMenuItem("눈금자");
		jcbmi.addActionListener(this);
		menu2.add(jcbmi); // menu2 메뉴에 추가
		// 3. 서브 메뉴 JRadioButtonMenuItem() 객체 생성
		JRadioButtonMenuItem jrbmi = new JRadioButtonMenuItem("수정가능상태");
		jrbmi.addActionListener(this);
		menu2.add(jrbmi); // menu2 메뉴에 추가
		
		// 5. enu1, menu2를 jmb(JMenuBar)에 추가
		jmb.add(menu1);
		jmb.add(menu2);
		
		// 6. setJMenuBar()에 메서드를 이용하여 메뉴바를 프레임에 추가
		setJMenuBar(jmb);
		
		jtf = new JTextField();
		ct.add(jtf, BorderLayout.SOUTH); // TextField 위치 설정
		
		// 화면 출력
		setTitle("JMenu Test1");
		setSize(300, 200);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		jtf.setText(e.getActionCommand());
	}
}

// 메인 클래스
public class JMenuTest1 {
	public static void main(String[] args) {
		new JMenu1();
	}
}