package ch15;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//GUI 클래스
class JCombobox extends JFrame implements ItemListener {
	// 이미지 표시될 영역
	JLabel fruitLabel;
	// 생성자
	public JCombobox(){
		// 콤보 박스 객체 생성
		JComboBox<String> fruitCombo = new JComboBox<String>();
		// 이미지 표시 영역 객체 생성
		fruitLabel = new JLabel();
		
		// 과일 배열 생성
		String fruitList[] = {"persimmom", "pear", "grape", "cherry", "banana", "apple"};
		
		// 컨테이너 생성
		Container ct = getContentPane();
		// 배치관리자 FlowLayout
		ct.setLayout(new FlowLayout());		
		
		// 콤보박스에 과일 리스트 추가
		for(int i = 0; i < fruitList.length; i++) {
			fruitCombo.addItem(fruitList[i]);
		}
		// 컨테이너에 콤보박스, 레이블 추가
		ct.add(fruitCombo);
		ct.add(fruitLabel);
		
		// 콤보박스에 이벤트 리스너 등록
		fruitCombo.addItemListener(this);
		
		// 화면에 보여주기
		setTitle("JComboBox Test1");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		String fruit = (String)e.getItem();
		fruitLabel.setIcon(new ImageIcon("image/" + fruit + ".jpg"));
	}
}

// 메인 클래스
public class JComboBoxTest1 {
	public static void main(String[] args) {
		new JCombobox();
	}
}