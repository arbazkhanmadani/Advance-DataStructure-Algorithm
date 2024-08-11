package in.dsa.array.simple;

public class PartitionArrayEqualToSum {

	public static void main(String[] args){
		
		//{5,3,2}=10 and {6,3,1}=10
		boolean isExists = partitionArrayEqualToSum(new int[]{5,3,2,6,3,1});
		System.out.println(isExists);
		
	}
	
	
	public static boolean partitionArrayEqualToSum(int[]a){
	
		int prefixSum = 0;
		int suffixSum = 0;
		int totalSum = 0;
		
		for(int i =0; i<a.length;i++)
			totalSum +=a[i];
		
		for(int i =0; i<a.length;i++){
			
			prefixSum = prefixSum+a[i];
			suffixSum = totalSum - prefixSum;
			
			if(prefixSum==suffixSum) return true;
		}
		
		return false;
	}

}
