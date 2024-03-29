package days11;

import java.util.Arrays;

/**
 * @author 조연화
 * @date 2024. 1. 15. 오후 3:43:59
 * @subject [예상문제 3번] - selection2() 출제
 * @content	
 */
public class Ex10 {

	public static void main(String[] args) {
		// 정렬 ( Sort ) - 일정한 순서로 다시 배열하는 것.
		//	오름차순 정렬
		//	 예) 숫자 0 1 2 3 4 5
		//			a b c d e f
		// 			가 나 다 라 마 
		
		//	내림차순 정렬
		//	 예) 숫자 5 4 3 2 1
		//			f e d c b a
		//			마 라 다 나 가
		
		// 정렬방법
		// 1) 버블정렬 ( bubble sort ) - 시험 3번
		
		int [] m = {3, 5, 2, 4, 1};
		System.out.println( Arrays.toString(m) );
		//bubbleSort(m);
		//System.out.println( Arrays.toString(m) );
		
		// 2) 선택정렬		// *시험
		selectionSort2(m);
		System.out.println( Arrays.toString(m) );
		
		// 3) 삽입정렬
		// 4) 병합정렬
		
		

	}// main

	private static void selectionSort2(int[] m) {
		// 0번째랑 뒤에 최소값이랑 바꾸기
		// 0
		// [3] 5 2 4 1
		for (int i = 0; i <= m.length-1; i++) { // 선택된 위치
			int minIndex = i; // j = 2
			for (int j = i+1; j < m.length; j++) {
				if (m[minIndex] > m[j] ) minIndex = j;
			}
			if ( minIndex == i ) continue;
			int temp = m[i];
			m[i] = m[minIndex];
			m[minIndex] = temp;
			
			System.out.println( Arrays.toString(m) );	
		}//for
	}

	private static void selectionSort(int[] m) {
		// 			3,  5,  2,  4,  1
		// 1회전 []   0-1	 0-2 0-3 0-4	[1], 5, 3, 4, 2
		// 2회전 []   1-2	 1-3 1-4		[1], [2], 5, 3, 4
		// 3회전 []   2-3 2-4		 		[1], [2], [3], 5, 4
		// 4회전 []   3-4  				[1], [2], [3], [4], 5
		
		// 1회전 []   0-1	 0-2 0-3 0-4	[1], 5, 3, 4, 2
		// 2회전 []   1-2	 1-3 1-4		[1], [2], 5, 3, 4
		// 3회전 []   2-3 2-4		 		[1], [2], [3], 5, 4
		// 4회전 []   3-4  				[1], [2], [3], [4], 5
			
		for (int i = 0; i <= m.length-1; i++) { // 행 갯수
			for (int j = i+1; j <= 4; j++) {
				System.out.printf("%d-%d ", i, j);
				if (m[i] > m[j]) {
					System.out.print(" *** ");
					int temp = m[i];
					m[i] = m[j];
					m[j] = temp;
				}
				System.out.println( Arrays.toString(m) );
			}
			System.out.println();
		}//for i
		
			}
		
	

	// 오름차순 정렬	a > b
	private static void bubbleSort(int[] m) {
		//	3, 5, 2, 4, 1
		// 0-1 1-2 2-3 3-4 [1회전] 자리 바꿈
		// 3, 2, 4, 1, [5]
		// 0-1 1-2 2-3 3-4 [2회전]
		// 2, 3, 1, [4], [5]
		// 0-1 1-2 2-3 3-4 [3회전]
		// 2, 1, [3], [4], [5]
		// 0-1 1-2 2-3 3-4 [4회전]
		// 1, [2], [3], [4], [5]
		
		// ****	i=1	j=1,2,3,4
		// ***	i=2 j=1,2,3
		// **	i=3 j=1,2
		// *	i=4 j=1
		// 별 찍기와 같은 문제
		
		for (int i = 1; i <= 4; i++) { // 행 갯수
			for (int j = 1; j <= 5-i; j++) {
				System.out.printf("%d-%d ", j-1, j);
				if (m[j-1] > m[j]) {
					System.out.print(" *** ");
					int temp = m[j-1];
					m[j-1] = m[j];
					m[j] = temp;
				}
				System.out.println( Arrays.toString(m) );
			}
			System.out.println();
		}//for i
		
		
	}

}// class
