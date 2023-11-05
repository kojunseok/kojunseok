package ch15;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// 1. 처리할 이벤트 종류 결정 - 버튼
// 2. 이벤트에 적합한 이벤트 리스너 인터페이스 사용하여 클래스 작성 - ActionListener 
class GUI1 extends JFrame implements ActionListener{
	// 속성으로 텍스트 에어리와 텍스트 필드를 선언
	private JTextArea contents;
	private JTextField f_name;
	
	// 생성자
	public GUI1() {
		/*
		 * JButton jb = new JButton("파일로 저장"); JTextField jtf = new JTextField(20);
		 * JTextArea jta = new JTextArea(10,20);
		 * 
		 * Container ct = getContentPane(); ct.setLayout(new FlowLayout());
		 * 
		 * JPanel jp = new JPanel();
		 * 
		 * ct.add(jta); jp.add(jtf); jp.add(jb); ct.add(jp);
		 */
		
		// 여러줄 텍스트 객체 생성 - 글 내용 출력
		contents = new JTextArea("파일의 내용을 입력하세요.", 10, 20);
		// 한줄 텍스트 객체 생성 - 파일 저장명 입력
		f_name = new JTextField("파일 이름을 입력하세요.", 20);
		// 버튼 객체 생성 - 저장 버튼
		JButton jb = new JButton("파일로 생성");
		
		// 컨테이너 생성
		Container ct = getContentPane(); 
		// 배치 관리자 생성
		ct.setLayout(new FlowLayout());
		// 판넬 생성 
		JPanel pl = new JPanel();
		
		// 판넬에 텍스트 필드 추가
		pl.add(f_name);
		// 판넬에 버튼 추가
		pl.add(jb);
		// 컨테이너에 텍스트 에어리어 추가
		ct.add(contents);
		// 컨테이너에 판넬 추가
		ct.add(pl);
		
		// 3. 이벤트 받아들일 버튼에 리스너 등록
		jb.addActionListener(this);
		
		
		// 화면에 출력
		setTitle("GUI Test1");
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	// 4. 리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성
	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			// 입출력을 위한 예외처리
			// 파일 이름으로 출력 객체 생성
			String s = f_name.getText();
			FileOutputStream fos = new FileOutputStream(s);
			DataOutputStream dos = new DataOutputStream(fos);
			
			// 텍스트 에어리어의 내용을 파일로 출력
			dos.writeUTF(contents.getText());
			// 파일 닫기
			fos.close();
			System.out.println(s + "파일이 생성되었습니다.");
		}
		catch (Exception e){
			
		}
	}
}

public class GUITest1 {
	public static void main(String[] args) {
		new GUI1();
	}
}