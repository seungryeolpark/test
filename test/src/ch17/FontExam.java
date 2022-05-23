package ch17;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JApplet;

public class FontExam extends JApplet {
	private Font font;
	// 글꼴관련 정보를 제공하는 클래스
	private FontMetrics fm;
	private int x, y;
	private String message;
	// 특정 영역의 사각형과 폭과 높이값을 관리할 수 있도록 도와주는 클래스
	private Dimension dim;
	
	@Override
	public void init() {
		message = "그래픽 테스트";
		// Font("폰트", 옵션, 사이즈);
		font = new Font("굴림", Font.ITALIC, 30);
		// 폰트의 가로, 세로 사이즈를 가져옴
		fm = getFontMetrics(font);
		setSize(250, 250);
		// 화면 크기 계산해서 Dimesion에 저장
		dim = getSize();
		// 화면 가로사이즈
		System.out.println(dim.width);
		// 화면 세로사이즈
		System.out.println(dim.height);
		
		// 문자열의 가로 세로 길이를 계산해서 화면의 중앙에 위치
		// 폰트의 가로길이 값
		x = (dim.width/2) - (fm.stringWidth(message)/2);
		// 폰트의 세로길이 값
		y = (dim.height/2) - (fm.getDescent()/2);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setFont(font);
		g.drawString(message, x, y);
	}

}
