package ch17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaEx extends JFrame {
	private JTextField tf = new JTextField(20);
	// 6행 20열의 입력창 생성
	private JTextArea ta = new JTextArea(6, 20);
	
	public TextAreaEx() {
		super("TextArea 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(new JLabel("입력 후 <Enter> 키를 입력하세요"));
		con.add(tf);
		// 스크롤이 되는 패널에 textarea를 추가
		con.add(new JScrollPane(ta));
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				// 텍스트필드의 문자열을 textarea영역으로 옮김
				ta.append(t.getText()+"\n");
				// 현재 텍스트필드에 입력된 내용을 지움
				t.setText("");
			}
		});
		
		setSize(250, 200);
		setVisible(true);
	}// end TextAreaEx()
	
	public static void main(String[] args) {
		new TextAreaEx();
	}
}
