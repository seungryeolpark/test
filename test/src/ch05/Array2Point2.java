package ch05;

public class Array2Point2 {
	public static void main(String[] args) {
		int[][] score = {
				{80, 90, 100}, 
				{70, 60, 95},
				{88, 77, 66},
				{99, 89, 95},
				{100, 60, 50}};
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		for (int i=0; i<score.length; i++) {
			int sum = 0;
			float avg = 0.0f;
			
			System.out.printf("%d\t", i+1);
			for (int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				System.out.printf("%d\t", score[i][j]);
			} // inner for
			avg = sum/(float)score[i].length;
			System.out.printf("%d\t%.1f\n", sum, avg);
		} // outer for
	}

}
