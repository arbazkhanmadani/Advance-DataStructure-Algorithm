package in.dsa.zloop.logical2;

import java.lang.Math;
public class OctalToDecimal{

public int octal(int octal){
int rem = 0;
int decimal = 0;
int i =0;
while(true){
if(octal==0){
    break;
}
 else{
      rem =octal%10;
      decimal = decimal+(int)Math.pow(8, i)*rem;
      octal = octal/10;    
i++;
}
}
  return decimal;
}

public static void main(String[] args){
OctalToDecimal od = new OctalToDecimal();

int result = od.octal(106);
System.out.println(result);


}}