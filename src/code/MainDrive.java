package code;

public class MainDrive {

	public static void main(String[] args) {
		
//		순서가 뒤죽박죽인 배열.
		int[] originalNumbers = {8,1,7,2,6,12,11,3};
//		셀렉션 솔트로 정리한 배열
		int[] selectionSortNumbers = new int[originalNumbers.length];
		
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
