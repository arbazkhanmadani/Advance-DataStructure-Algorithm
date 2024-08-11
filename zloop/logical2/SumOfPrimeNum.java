package in.dsa.zloop.logical2;


public class SumOfPrimeNum{

public static void primeSum(int a){
int sum = 0;
for(int n=1; n<=a; n++){
     for(int i = 2; i<=n-1; i++){
            if(n%i==0){
            sum=sum+1;
}
}
}
System.out.println(sum);
}


public static void main(String[] args){

primeSum(100);


}}