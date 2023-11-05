package ch15;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// GUI 클래스
class JButton2 extends JFrame implements ActionListener {
	JTextField input;
	public JButton2() {
		input = new JTextField(10);
		// 이미지 아이콘 객체 생성
		ImageIcon apple = new ImageIcon("image/apple.jpg");
		ImageIcon banana = new ImageIcon("image/banana.jpg");
		ImageIcon persimmom = new ImageIcon("image/persimmom.jpg");
		ImageIcon pear = new ImageIcon("image/pear.jpg");
		ImageIcon grape = new ImageIcon("image/grape.jpg");
		
		// 버튼 객체 생성
		JButton app = new JButton("사과", apple);
		JButton ban = new JButton("바나나", banana);
		JButton per = new JButton("감", persimmom);
		JButton pea = new JButton("배", pear);
		JButton gra = new JButton("포도", grape);
		
				
		// 컨테이너 생성
		Container ct = getContentPane();
		// FloyLayout 배치 관리자 생성
		ct.setLayout(new GridLayout(3, 2));
		// 컨테이너에 버튼 추가
		ct.add(app);
		ct.add(ban);
		ct.add(per);
		ct.add(pea);
		ct.add(gra);
		ct.add(input);
		
		// 컴포넌트에 리스너 등록
		app.addActionListener(this); // 버튼 객체에 리스너 등록
		ban.addActionListener(this);
		per.addActionListener(this);
		pea.addActionListener(this);
		gra.addActionListener(this);
		// 화면에 보이기 
		setTitle("JButton Test2");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		input.setText(e.getActionCommand());
	}
	
}

// 메인 클래스
public class JButtonTest2 {
	public static void main(String[] args) {
		new JButton2();
	}
}