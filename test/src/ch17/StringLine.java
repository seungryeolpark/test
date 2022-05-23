package ch17;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;
// JApplet은 Applet의 확장판으로 1995년에 처음 소개 되었다.
// 애플릿뷰어나 웹브라우저와 함께 쓰였으며 게임 및 다양한 그래픽을 구사할 수 있다.
// 현재는 HTML5등 웹이 진화되면서 거의 활용되지 않는다.
// 라이프사이클을 가지고 있다. init()-start()-stop()-destroy()
// init()은 필수처리하고, 나머지는 필요에 따라 (페이지 이동, 강제 종료...)때 간혹 쓰임

public class StringLine extends JApplet {
	// Applet을 초기화하는 코드
	@Override
	public void init() {
		// 배경색상 설정
		getContentPane().setBackground(new Color(255, 255, 255));
		// Applet의 화면 사이즈
		setSize(300, 300);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		// 선그리기 drawLine(x1, y1, x2, y2)
		g.drawLine(250, 50, 30, 160);
		g.setColor(Color.red);
		g.drawString("Red String", 10, 50);
		g.setColor(Color.green);
		g.drawString("Green string", 10, 80);
		g.setColor(Color.blue);
		g.drawString("Blue String", 10, 110);
	}

}
