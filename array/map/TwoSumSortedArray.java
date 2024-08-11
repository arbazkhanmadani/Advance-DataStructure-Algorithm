package in.dsa.array.map;


public class TwoSumSortedArray {

	public static void main(String[] args) {

		for(int e : twoSumSorted(new int[]{1,2,3,4,5,6,7,8},9) ){
			System.out.println(e);
		}
	}

	public static int[] twoSumSorted(int[] numbers, int target) {
		
		if (numbers == null || numbers.length == 0)
			return null;
		
		
		int i = 0, j = numbers.length - 1;
		while (i < j) {
			
			int x = numbers[i] + numbers[j];
			if(x<target){
				++i;
			}
			else if(x>target){
				j--;
			}
			else{
				return new int[] { i, j};
			}
		}
		
		return null;
	}

	

}
