package in.dsa.zloop.logical2;

public class NumberConversion{

	public static void main(String[] args){

//Binary to Other Numbers...........
String octal1 = Integer.toOctalString(100);
System.out.println("Binary to Octal : " + octal1);

String hex1 = Integer.toHexString(12);
System.out.println("Binary to HexaDecimal : " + hex1);

String binary1 = "01011011";
int Dec = Integer.parseInt(binary1, 2);
System.out.println("Binary to Decimal : " + Dec);


//Decimal to Other Numbers...........
System.out.println();
System.out.println("Decimal to other Numbers");
int decimal1 = 20;
System.out.println(Integer.toBinaryString(decimal1));

int decimal2 = 20;
System.out.println(Integer.toOctalString(decimal2)); 

int decimal3 = 20;
String Hex2 = Integer.toHexString(decimal3);
System.out.println(Hex2);


//Octal to Other Numbers..............
String octalString1="121";   
int decimal4 = Integer.parseInt(octalString1); 
System.out.println("Octal to Decimal : "+decimal4);

int octalString2 = 121;   
String binary2 = Integer.toBinaryString(octalString2); 
System.out.println("Octal to Binary : "+binary2);

int octalString3 = 121;   
String Hex3 = Integer.toHexString(octalString3); 
System.out.println("Octal to Hexadecimal : "+Hex3);

//Hexadecimal to other number.........
/*String hexadecimal1= "12D";  
int decimal5=Integer.parseInt(hexadecimal2,16);  
System.out.println("HexaDecimal to Decimal : "+decimal5); 

String hexadecimal2="12D";  
int bin = toBinaryString(hexadecimal2,16);  
System.out.println("HexaDecimal to Binary : "+bin);

String hexadecimal3="12D";  
int octal2 = toOctalString(hexadecimal3,16);  
System.out.println("HexaDecimal to Octal : "+octal2);
*/}}