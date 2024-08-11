package in.dsa.array.simple;

public class MergeTwoSortedArray {

public static void main(String[] args){
		
		int a[] = {1,2,3,4,5};
		int b[] = {1,6,7,8,9,10};
		
		int[] merged = merge(a,b);
		for(int e: merged)System.out.println(e);
	}
	
	
	public static int[] merge(int[]a, int[]b){
	
		int i=0,j=0,k=0;
		int merge[] = new int[a.length+b.length];
		
		while(i<a.length-1 && j<b.length){
			if(a[i]<=b[i])
				merge[k++] = a[i++];
			else
				merge[k++] = b[j++];			
		}
		
		//For Remaining elements......
		while(i<a.length)
				merge[k++] = a[i++];
		
		while(j<b.length){
			//For Duplicacy
			if(merge[j]!=b[j])
				merge[k++] = b[j];
			j++;
		}
	
		
		return merge;
	}

}
