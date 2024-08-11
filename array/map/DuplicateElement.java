package in.dsa.array.map;

public class DuplicateElement {

	public static void main(String[] args) {

		duplicateElements(new int[]{1,2,3,3,3,3,5,3,4,2,6,4,3,2,2,2});
		
	}
	
	public static void duplicateElements(int []arr){
		
		int count = 0;
		for(int i = 0; i<arr.length; i++){
			
			for(int j = 0; j<i; j++){
				
				if(arr[i]==arr[j]){
					count++;
					System.out.println(arr[i]+" "+count);
					
				}
			}	
			
			count = 0;
		}
	}

}



/**
=>1.Remove Duplicates from Sorted Array 
   if(nums.length == 0) return 0;
        
   int k = 1; // Pointer for the position of the next unique element
        
   for (int i = 1; i < nums.length; i++) {
       if (nums[i] != nums[i - 1]) {
           nums[k++] = nums[i];
       }
   }
   return k;
   
=> 2.Only for twice repeated elements.
 		int result = 0;
        for (int num : a)
            result ^= num;
        return result;
 */
