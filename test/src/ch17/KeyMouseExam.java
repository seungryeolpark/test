package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;

// MouseListener : 마우스이벤트 처리를 위한 인터페이스
// MouseMotionListener : 마우스 이동 이벤트 처리를 위한 인터페이스
// KeyListener : 키보드이벤트 처리를 위한 인터페이스
public class KeyMouseExam extends JApplet implements MouseListener, 
MouseMotionListener, KeyListener {
	// 이미지를 출력할 x,y좌표값
	private int x, y; 
	// 가로, 세로 사이즈
	private int width, height;
	// 이미지 car.gif 사용할 변수
	private Image img; // 이미지 car.gif 사용할 변수
	// 이미지가 처음실행할땐 안보이게.. 불린값으로 false로 처리
	private boolean flag = false;
	
	@Override
	public void init() {
		setSize(300, 300);
		img = Toolkit.getDefaultToolkit()
				.getImage(getClass().getResource("car.gif"));
		// 현재 클래스에 이벤트 기능을 추가
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		// 키를 입력받을 수 있도록 설정
		setFocusable(true);
		// 현재화면에 키 입력을 요청
		requestFocus();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 이미지의 가로, 세로 길이 계산
		width = img.getWidth(null);
		height = img.getHeight(null);
		System.out.println(width+", "+height);
		
		// 마우스 클릭시 true로 설정
		if (flag) {
			// drawImage(이미지, x, y, 이미지관찰자);
			g.drawImage(img, x, y, this);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// 키를 입력하면 호출
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 키가 눌러져있을 때에 호출
		// 키 코드값
		System.out.println(e.getKeyCode());
		// 문자
		System.out.println(e.getKeyChar());
		
		switch (e.getKeyCode()) {
		// 위쪽 키를 눌렀을 때
		case KeyEvent.VK_UP:
			y = Math.max(0, y-5); break;
		case KeyEvent.VK_DOWN:
			y = Math.min(300-height, y+5); break;
		case KeyEvent.VK_LEFT:
			x = Math.max(0, x-5); break;
		case KeyEvent.VK_RIGHT:
			x = Math.min(300-width, x+5); break;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouse drag : x : "+x+", y : "+y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// 마우스 커서가 컴퍼넌트 상에 이동했지만 버튼이 작동하지 않은 경우에 호출
		x = e.getX();
		y = e.getY();
		System.out.println("mouse move : x : "+x+", y : "+y);
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// 컴포넌트상에서 마우스 버튼을 클릭(눌렀다 땔때)했을 때에 호출
		flag = true;
		// 마우스 클릭한 좌표 저장
		x = e.getX();
		y = e.getY();
		// 그래픽 갱신 요청 => paint()가 자동 호출됨
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// 마우스버튼을 누를 때 호출
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// 컴포넌트상에서 mouse button을 떼어 놓아질 때 호출
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// 마우스가 컴퍼넌트에 들어갔을 때에 호출
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// 마우스가 컴퍼넌트에서 나왔을 때에 호출
		
	}

}
