package in.dsa.zloop.logical2;

public class PerfectNumTill100{

public static boolean isPerfectnum(int a){


    int sum = 0;
     for(int i = 1; i<a; i++){
            if(a%i==0){
                 sum = sum+i;
           }
      }
    
    if(sum==a)
       return true;
    else return false;
}
    
    static void perfectnum(int a){

    	for(int i = 1; i<a; i++){
            if(isPerfectnum(i)){
                System.out.println(i);
           }
      }
}
    

public static void main(String[] args){

perfectnum(1000);


}}