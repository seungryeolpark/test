package ch17;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class FrameColor extends JFrame {
	public FrameColor() throws InterruptedException {
		// 프레임을 화면에 표시
		setVisible(true);

		// 프레임에 컨텐츠를 추가하는 작업
		Container c = getContentPane();
		for (int i = 0; i <= 255; i++) {
			// 프레임의 사이즈(w,h)
			setSize(i * 2, i);
			// 프레임의 좌표(x,y)
			setLocation(i * 2, i);
			// 배경색상 설정 (r,g,b)
			c.setBackground(new Color(i, 0, 0));
			Thread.sleep(10);
		}

		for (int i = 0; i <= 255; i++) {
			// 프레임의 사이즈(w,h)
			setSize(i * 2, i);
			// 프레임의 좌표(x,y)
			setLocation(i * 2, i);
			// 배경색상 설정 (r,g,b)
			c.setBackground(new Color(255, i, 0));
			Thread.sleep(10);
		}
		// 윈도우 닫기 동작 옵션
		// EXIT_ON_CLOSE : 프로그램까지 종료
		// HIDE_ON_CLOSE : 숨김처리
		// DISPOSE_ON_CLOSE : 현재창만 닫음
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}// end FrameColor()
	
	public static void main(String[] args) throws InterruptedException {
		// 인스턴스 생성
		new FrameColor();
	}

}
