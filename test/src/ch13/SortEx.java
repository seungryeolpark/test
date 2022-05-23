package ch13;

import java.util.Arrays;
import java.util.Collections;

public class SortEx {
	public static void main(String[] args) {
		Integer arr[] = {3,29,46,15,89,-20};
		System.out.print("배열 데이터 : ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		// 오름차순 정렬
		System.out.print("오름차순 정렬 : ");
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		//내림차순 정렬
		System.out.print("내림차순 정렬 : ");
		Arrays.sort(arr, Collections.reverseOrder());
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}
}
