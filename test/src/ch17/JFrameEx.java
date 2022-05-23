package ch17;

import javax.swing.JFrame;

public class JFrameEx extends JFrame {
	public JFrameEx() {
		// 제목처리
		super("JFrame 예제");
		
		setSize(300, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameEx();
	}

}
