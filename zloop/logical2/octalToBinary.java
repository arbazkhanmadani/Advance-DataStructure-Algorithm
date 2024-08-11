package in.dsa.zloop.logical2;

public class octalToBinary{

// function to convert octal number to its binary equivalent value 
public static int octalToBinary(int octalValue){

// declaring all variable to store the intermediate results
int i = 0;
int decimalValue = 0;
int binaryValue = 0;

	// converting octal number into its decimal equivalent
	while (octalValue != 0) {
	          decimalValue+= (octalValue % 10) * Math.pow(8, i);
	 
                   ++i;
	octalValue /= 10;
	}

	i = 1;

	// converting generated decimal number to its binary equivalent
	while (decimalValue != 0) {
	           binaryValue += (decimalValue % 2) * i;
	
                     decimalValue /= 2;
	   i =i* 10;
	}

//returning the final result
return binaryValue;
}


public static void main(String[] args){

System.out.println("Octal to Binary Conversion\n");

	// octal number which is to be converted
	int octalNumber = 315;
	System.out.println("Octal number: " + octalNumber);
                  int result = octalToBinary(octalNumber);
	System.out.println("Binary equivalent value is: "+ result);
}}
