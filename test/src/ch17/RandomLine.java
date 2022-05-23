package ch17;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JApplet;

public class RandomLine extends JApplet {
	private Random random;
	
	@Override
	public void init() {
		setSize(300, 300);
		random = new Random();
	}
	
	@Override
	public void print(Graphics g) {
		super.print(g);
		for (int i=0; i<100; i++) {
			// 0~255
			int red = random.nextInt(256);
			int green = random.nextInt(256);
			int blue = random.nextInt(256);
			// 색상표현방식 : 1) Color.상수, 2) Color(r,g,b)
			// 컬러값을 rgb패턴으로 다양한 색을 출력
			g.setColor(new Color(red, green, blue));
			
			// 0~299
			int x1 = random.nextInt(300); 
			int y1 = random.nextInt(300);
			int x2 = random.nextInt(300);
			int y2 = random.nextInt(300);
			g.drawLine(x1, y1, x2, y2);
			
		}
	}

}
