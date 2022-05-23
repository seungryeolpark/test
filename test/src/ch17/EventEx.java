package ch17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 이벤트의 처리 3대 요소 : 1.이벤트소스, 2.이벤트클래스, 3.이벤트리스너

public class EventEx extends Frame implements WindowListener {
	public EventEx() {
		/**
		 * 프레임에 이벤트리스너를 추가 (new ...)해서 하지 않고 
		 * implements WindowListener를 상속받아 쓰면 (this)로도 사용 가능
		 **/
		addWindowListener(this);
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventEx();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub

	}

}
