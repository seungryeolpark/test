package ch06;

public class StudentPoint {
	public static void main(String[] args) {
		int id[] = {1001, 1002, 1003};
		String name[] = {"홍길동", "이몽룡", "이순신"};
		int score[][] = {
				{80, 90, 83},
				{90, 70, 66},
				{100, 80, 87}};
		print(id, name, score);
	}
	
	public static void print(int[] id, String[] name, int[][] score) {
		System.out.println("전체학생수 : "+id.length+"명");
		System.out.println("----------------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------");
		
		String temp = "";
		for (int i=0; i<id.length; i++) {
			int tot = getTot(score[i]);
			double avg = getAvg(tot, id.length);
			temp += id[i]+"\t"+name[i]+"\t"+printScore(score[i])+
					tot+"\t"+String.format("%.1f", avg)+"\n";
		}
		System.out.print(temp);
		System.out.println("----------------------------------------------------");
	}
	
	public static String printScore(int[] score) {
		String temp = "";
		for (int i=0; i<score.length; i++) {
			temp += score[i]+"\t";
		}
		return temp;
	}
	
	public static int getTot(int[] score) {
		int result = 0;
		for (int i=0; i<score.length; i++) {
			result += score[i];
		}
		return result;
	}
	
	public static double getAvg(int tot, int length) {
		return tot/(double) length;
	}
}
