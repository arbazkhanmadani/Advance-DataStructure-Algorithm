package in.dsa.array.tricky;

public class ContainerWithMostWater{

	public static void main(String[] args) {
		
		int maxW = maxWater(new int[]{1,8,6,2,5,4,8,3,7});
		System.out.println(maxW);
	}


	public static int maxWater(int[] a){
		
		int i = 0;
		int j = a.length-1;
		int maxArea = 0;
		
		//1,8,6,2,5,4,8,3,7
		while(i<j){
			
			int width = j-i;
			int minHeigth = Math.min(a[i], a[j]);
			
			int currentArea = width*minHeigth;
			
			maxArea = Math.max(maxArea, currentArea);
			
			if(a[i]<a[j]) i++;
			else j--;
		}
		
		return maxArea;
	}
}
