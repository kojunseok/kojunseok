package ch16;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// GUI 클래스
class MyTime extends JFrame implements ActionListener {
	// 이벤트 처리를 위해 속성으로 객체 지정
	private JTextField jtf;
	private JTextArea jta1;
	private JTextArea jta2;
	JLabel jl = new JLabel("당신의 생일을 공백으로 구분하여 입력(예2020 01 01) ");
	// 생성자
	public MyTime() {
		// JButton 생성
		JButton jb1 = new JButton("현재");
		JButton jb2 = new JButton("100살");
		// JTextField, JTextArea 설정
		jtf = new JTextField(10);
		jta1 = new JTextArea(4, 30);
		jta2 = new JTextArea(3, 30);
		
		// 텍스트 에어리어는 수정 불가 설정
		jta1.setEditable(false);
		jta2.setEditable(false);
		
		// 컨테이너 생성
		Container ct = getContentPane();
		
		// 컨테이너 배치관리자 설정
		ct.setLayout(new FlowLayout());
		
		// 판넬1 생성
		JPanel pl1 = new JPanel();
		// 판넬1 배치 관리자 설정
		pl1.setLayout(new FlowLayout());
		// 판넬1에 JLabel, JTextField추가
		pl1.add(jl);
		pl1.add(jtf);
		
		// 판넬2 생성
		JPanel pl2 = new JPanel();
		// 판넬2 배치 관리자 설정
		pl2.setLayout(new FlowLayout());
		// 판넬2에 JButton, JTextArea추가
		pl2.add(jb1);
		pl2.add(jta1);
		
		// 판넬3 생성
		JPanel pl3 = new JPanel();
		// 판넬3 배치 관리자 설정
		pl3.setLayout(new FlowLayout());
		// 판넬1에 JButton, JTextArea추가
		pl3.add(jb2);
		pl3.add(jta2);
		
		// 컨테이너에 판넬1, 2, 3추가
		ct.add(pl1);
		ct.add(pl2);
		ct.add(pl3);
		
		// 컴포넌트에 이벤트 리스너 등록
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		// 화면에 보여주기
		setTitle("JTextField, JTextArea Test1");
		setSize(450, 250);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// birth에 JTextField의 값을 넣는다.
		String birth = jtf.getText();
		// 문자열만 지정하여 객체 생성
		StringTokenizer st1 = new StringTokenizer(birth);
		
		// 공백을 기준으로 분리하여 int형으로 저장
		int year = Integer.parseInt(st1.nextToken());
		int month = Integer.parseInt(st1.nextToken());
		int day = Integer.parseInt(st1.nextToken());
		
		// 날짜 관련 클래스
		LocalDate my_birth = LocalDate.of(year, month, day); // 사용자의 생년/월/일
		LocalDate current = LocalDate.now(); // 오늘의 날짜
		LocalDate hundred = my_birth.plusYears(100); // 사용자의 생년/월/일에 100년을 더함
		
		if(e.getActionCommand() == "현재") {
			// 메소드를 이용하여 객체의 요소를 조합하여 출력
			String s1 = my_birth.getYear() + "년 ";
			s1 += my_birth.getMonthValue() + "월 ";
			s1 += my_birth.getDayOfMonth() + "일 ";
			// 메소드를 이용하여 객체의 요소를 조합하여 출력
			String s2 = current.getYear() + "년 ";
			s2 += current.getMonthValue() + "월 ";
			s2 += current.getDayOfMonth() + "일 ";
			
			// JTextArea에 추가
			jta1.setText("당신의 생일 : " + s1
					+ "\n오늘 날짜는 :  " + s2
					// 두 객체 사이의 값을 구하는 until()메소드 사용
					// 나의 생일.until(비교 객체, 일, 년)
					+ "\n생일부터 오늘까지의 일 : " +  my_birth.until(current, ChronoUnit.DAYS) 
					+ "\n생일부터 오늘까지의 년 : " + my_birth.until(current, ChronoUnit.YEARS) );
		}
		else if(e.getActionCommand() == "100살"){
			// 메소드를 이용하여 객체의 요소를 조합하여 출력
			String s3 = hundred.getYear() + "년 ";
			s3 += hundred.getMonthValue() + "월 ";
			s3 += hundred.getDayOfMonth() + "일 ";
			
			// JTextArea에 추가
			jta2.setText("당신이 100이 되는 날은 : " + s3
					// 두 객체 사이의 값을 구하는 until()메소드 사용
					// 나의 생일.until(비교 객체, 일, 년)
					+ "\n100살까지 남은 주(week)수 : " + my_birth.until(hundred, ChronoUnit.WEEKS)
					+ "\n100살까지 남은 일 수 : " + my_birth.until(hundred, ChronoUnit.DAYS));
		}
	}
}


// 메인 클래스
public class TimeTestGUI {

	public static void main(String[] args) {
		new MyTime();
	}

}
