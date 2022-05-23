package ch17;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CardEx extends JFrame {
	CardLayout card;
	Container con;
	
	public CardEx() {
		super("CardLayout 예제");
		card = new CardLayout();
		// 프레임의 컨텐츠 추가 처리
		con = getContentPane();
		// 기본레이아웃을 카드레이아웃으로 변경
		setLayout(card);
		
		JPanel[] pan = new JPanel[5];
		Color[] color = {Color.red,Color.yellow,Color.green,Color.blue,
				Color.cyan};
		
		for (int i=0; i<pan.length; i++) {
			pan[i] = new JPanel();
			pan[i].setBackground(color[i]);
			// add("이름", 컴퍼넌트)
			add("card"+i, pan[i]);
			// 패널에 마우스 이벤트 추가
			pan[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					// 다음 화면으로 이동
					card.next(con);
					// 이전화면으로 이동
//					card.previous(con);
				}
			});
			setSize(300, 300);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}// end CardEx()
	
	public static void main(String[] args) {
		new CardEx();
	}
}
