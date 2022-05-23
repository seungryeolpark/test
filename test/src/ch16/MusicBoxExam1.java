package ch16;

public class MusicBoxExam1 {
	public static void main(String[] args) {
		MusicBox box = new MusicBox();
		MusicPlayer kim = new MusicPlayer(1, box);
		MusicPlayer lee = new MusicPlayer(2, box);
		MusicPlayer kang = new MusicPlayer(3, box);
//		MusicPlayer jang = new MusicPlayer(3, box);
		
		// run() 메소드 자동 호출
		kim.start();
		lee.start();
		kang.start();
	}

}
