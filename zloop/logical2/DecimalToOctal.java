package in.dsa.zloop.logical2;

public class DecimalToOctal{

public static void octal(int dec){
int arr[]=new int[1000];
int i = 0;
int rem=0;
while(dec>0){
           arr[i]=dec%8;
                  
dec=dec/8;
i++;
}
for(int j =i-1; j>=0; j--){
      System.out.print(arr[j]);
 }
}

public static void main(String[] args){

DecimalToOctal.octal(1465);
}
}