package in.dsa.array.simple;



public class SecondLargestElement {

	public static void main(String[] args) {


		int second_large_elm = largestElement(new int[]{2,4,1,4,4,4,7});
			
		System.out.println(second_large_elm);
		
		}
		
		public static int largestElement(int arr[]){
			
			int second;
			int first = second = Integer.MIN_VALUE;
			System.out.println(first);
			
			//2,1,4,7
			for(int i = 0; i<arr.length; i++){
				
				//Checking largest.....
				if(arr[i]>first){
					second = first;
					first = arr[i];
				}
				//Checking second largest.....
				else if(arr[i]>second && arr[i]!=first){
					second = arr[i];
				}
			}
	
			return second;
		}

	}

