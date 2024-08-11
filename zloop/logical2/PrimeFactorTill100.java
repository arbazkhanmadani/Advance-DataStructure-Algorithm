package in.dsa.zloop.logical2;

public class PrimeFactorTill100{
    
    
    public static void main(String[] args){
       
    	for(int i =1; i<=100; i++)primeFactor(i);
    }
    
    
    public static void primeFactor(int n){

    	System.out.print(n+" : ");
    	
    	for(int i = 2; i<=n; i++){
        
    		while(n%i==0){
    			System.out.print(i+" ");
    		 n/=i;
    		}
    	}
    	System.out.println();
		
    }
    

}
    

 