package ch17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame {
	// Exit만 메뉴아이템으로 별도 생성
	private JMenuItem mie = new JMenuItem("Exit");
	
	public MenuEx() {
		super("Menu 예제");
		createMenu();
		setSize(300, 200);
		setVisible(true);
	}

	void createMenu() {
		// 메뉴바 생성
		JMenuBar mb = new JMenuBar();
		// 메뉴 생성
		JMenu jm = new JMenu("File");
		// 메뉴에 메뉴아이템 부착
		jm.add(new JMenuItem("Open"));
		jm.add(new JMenuItem("Save"));
		jm.add(new JMenuItem("Print"));
		// 메뉴에 분리선 추가
		jm.addSeparator();
		jm.add(mie);
		// 메뉴바에 메뉴 부착
		mb.add(jm);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));		
		// 프레임에 메뉴바를 붙임(메뉴바는 프레임에만 붙일 수 있다.)
		setJMenuBar(mb);
		// Exit 메뉴아이템을 클릭하면 프로그램 종료하는 이벤트 처리
		mie.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}
	
	public static void main(String[] args) {
		new MenuEx();
	}
}
