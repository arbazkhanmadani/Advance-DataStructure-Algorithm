package in.dsa.array.algos;


public class SortingStringArrayASC{

	public static void main(String[] args) {

		
		String[] sorted_arr = sort(new String[]{"Tabish","Arbaz","Aman","Sarfaraz"});
		
		for(String elm : sorted_arr){
			
			System.out.println(elm);
		}
	}
	
	
	public static String[] sort(String arr[]) {
		
		for(int i = 0; i<arr.length; i++){
			
			for(int j = i+1; j<arr.length; j++){
				
				String temp = "";
				//For Ascending -> ">0"
				if( arr[i].toLowerCase().compareTo(arr[j].toLowerCase()) > 0 ){
					
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}

}
