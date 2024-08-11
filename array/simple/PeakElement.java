package in.dsa.array.simple;


public class PeakElement {

	public static void main(String[] args) {

		peakElement(new int[]{1,2,3,4,6,8,7,6,9,2});
	}

	//It is also called Local maxima(2,4,3).......4
	//Local minima(2,1,3)......1
	public static void peakElement(int[] a){
		
		//First Elem is Peak.
		if(a[0]>a[1]){
			System.out.println("First Element is peak "+a[0]);
			return;
		}
		//Last Elem is Peak.
		else if(a[a.length-1]>a[a.length-2]){
			System.out.println("Last Element is peak "+a[a.length-1]);
			return;
		}
		for(int i = 1; i<a.length-1; i++){
			
				if(a[i-1]<a[i] && a[i+1]<a[i]){
					System.out.println("Peak Element is "+a[i]+ " at index "+i);
				}
		}
		
		
		
	}
}
