package in.dsa.array.tricky;

public class MaximumProductSubarray {

	public static void main(String[] args) {


		int maxPro = maxProductSubarray(new int[]{1,-1,-3,0,7,-8,-2});
		System.out.println(maxPro);
	}

	public static int maxProductSubarray(int[] nums){
		
		if(nums==null || nums.length==0)
			return 0;

		    int n = nums.length;
		    int maxProduct = nums[0];
		    int minProduct = nums[0];
		    int finalProduct = nums[0];

		    for(int i = 1; i<n; i++){
		     
		    	// Swap maxProduct and minProduct when nums[i] is negative.
		    	if(nums[i]<0){
		            int temp = maxProduct;
		            maxProduct = minProduct;
		            minProduct = temp;
		        }

		        //Update maxProduct and minProduct
		        maxProduct = Math.max(nums[i], maxProduct * nums[i]);
		        minProduct = Math.min(nums[i], minProduct * nums[i]);
		        System.out.println("maxProduct : "+maxProduct);
		        System.out.println("minProduct : "+minProduct);
		        
		        //Update result
		        finalProduct = Math.max(finalProduct, maxProduct);
		        System.out.println("finalProduct : "+minProduct);
		        
		    }

		    
		 return finalProduct;  
	}
	
}
