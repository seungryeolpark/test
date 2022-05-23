package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PannelExam extends JFrame {
	public PannelExam() {
		// 패널생성
		JPanel p = new JPanel();
		// 패널의 배경색상 설정
		p.setBackground(Color.red);
		
		JButton button1 = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		JButton button3 = new JButton("버튼3");
		JButton button4 = new JButton("버튼4");
		JButton button5 = new JButton("버튼5");
		JButton button6 = new JButton("버튼6");
		
		p.add(button1);
		p.add(button6);
		
		// 프레임의 North영역에 패널을 추가
		add(p, BorderLayout.NORTH);
		// 프레임의 Center에 button2가 배치(Center는 생략 가능)
		add(button2);
		add(button3, "South");
		add(button4, "West");
		add(button5, "East");
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new PannelExam();
	}

}
