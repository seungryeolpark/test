package ch17;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridExam extends JFrame {
	public GridExam() {
		super("GrideLayout 예제");
		setLayout(new GridLayout(2, 3));
		
		for (int i=1; i<=6; i++) {
			JButton button = new JButton("button"+i);
			// 프레임에 버튼 추가
			add(button);
		}
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GridExam();
	}

}
