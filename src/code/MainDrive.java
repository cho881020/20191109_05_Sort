package code;

public class MainDrive {

	public static void main(String[] args) {
		
//		순서가 뒤죽박죽인 배열.
		int[] originalNumbers = {8,1,7,2,6,12,11,3};
		int[] originalNumbers2 = {3,9,2,5,6,13,11,8};
		
//		셀렉션 솔트로 정리한 배열
		int[] selectionSortNumbers = new int[originalNumbers.length];
		
//		Bubble Sort로 2번째 배열을 정리.
		
		for (int i=0 ; i < originalNumbers2.length ; i++) {
			
			for (int j=0 ; j < originalNumbers2.length - (i+1) ; j++) {
				
				if (originalNumbers2[j] > originalNumbers2[j+1]) {
					
					int tempNum = originalNumbers2[j];
					originalNumbers2[j] = originalNumbers2[j+1];
					originalNumbers2[j+1] = tempNum;
				}
				
			}
			
		}
		
//		버블소트 정리 결과
		
		for (int num : originalNumbers2) {
			System.out.println(num);
		}
		
		System.out.println("========================");
		
//		어떻게 해야 1~12의 순서로 출력? - Selection Sort 작성.
		
		for (int i=0 ; i < selectionSortNumbers.length ; i++) {
			
			int minNum = 999999;
			int minNumIndex = 0;
			
			for (int j=0 ; j < originalNumbers.length ; j++) {
				if (minNum > originalNumbers[j]) {
					minNum = originalNumbers[j];
					minNumIndex = j;
				}
			}
			
			selectionSortNumbers[i] = minNum;
			originalNumbers[minNumIndex] = 999999;
		}
		
		
//		배열 안의 숫자들을 출력.
		for (int num : selectionSortNumbers) {
			System.out.println(num);
		}
		
	}
	
}
