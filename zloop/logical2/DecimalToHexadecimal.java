package in.dsa.zloop.logical2;

public class DecimalToHexadecimal{

public static String hexadecimal(int dec){
 int rem;  
 String hexnum="";   
 char hexchar[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};  

 while(dec>0)  
     {  
       rem=dec%16;   
       hexnum = hexchar[rem]+hexnum;   
       
dec=dec/16;  
}  
    return hexnum;  
}

public static void main(String[] args){

System.out.println(DecimalToHexadecimal.hexadecimal(4));
System.out.println(DecimalToHexadecimal.hexadecimal(17));
System.out.println(DecimalToHexadecimal.hexadecimal(289));
;
}
}