package ch17;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextFieldEx extends JFrame {
	public TextFieldEx() {
		super("텍스트필드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		
		con.add(new JLabel("이름"));
		// 텍스트필드의 입력길이값 20
		con.add(new JTextField(20));
		con.add(new JLabel("학과"));
		con.add(new JTextField("컴퓨터공학과", 20));
		con.add(new JLabel("주소"));
		con.add(new JTextField("서울시...", 20));
		con.add(new JLabel("비번"));
		// 비밀번호표시 텍스트필드
		con.add(new JPasswordField(20));
		setSize(300, 150);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextFieldEx();
	}

}
