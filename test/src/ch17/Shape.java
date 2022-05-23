package ch17;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;

public class Shape extends JApplet {
	@Override
	public void init() {
		setSize(300, 300);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2 = (Graphics2D) g;
		// 선굵기 조절
		g2.setStroke(new BasicStroke(5));
		// 선그리기
		g.drawLine(10, 10, 200, 10);
		// 색상
		g.setColor(Color.YELLOW);
		g2.setStroke(new BasicStroke(1));
		// 사각형
		g.drawRect(120, 40, 90, 55);
		g.setColor(Color.cyan);
		g.fillRect(120, 140, 90, 55);
		g.setColor(Color.red);
		// fillRoundRect(x, y, width, height, 가로라운드길이, 세로라운드길이)
		g.fillRoundRect(120, 240, 90, 55, 30, 30);
		g.setColor(Color.blue);
		// 타원
		g.drawOval(0, 40, 90, 55);
		g.setColor(Color.pink);
		g.fillOval(0, 140, 90, 55);
		int[] x = {10,30,50,40,20};
		int[] y = {257,240,257,280,280};
		// fillPolygon(x배열,y배열,꼭지점의 수)
		// 다각형 그리기
		g.fillPolygon(x, y, x.length);
	}

}
