package in.dsa.zloop.logical2;

public class BinaryToOctal {

// function to convert binary number
// to decimal number
public int binaryToDecimal(long binary)
{

// variable to store the converted
// decimal number
int decimalNumber = 0, i = 0;

	// loop to convert binary to decimal
	while (binary > 0) {

	 // extracting every digit of the binary and multiplying with increasing powers of 2
	decimalNumber += Math.pow(2, i++) * (binary % 10);

	// dividing the number by 10 to remove the last digit
	binary /= 10;
	}

	// returning the converted decimal number
	return decimalNumber;
}

// function to convert decimal number to octal
public int decimalToOctal(long binary){

 // variable to store the octal number
int octalNumber = 0, i = 0;

// variable to store the output returned by the binaryToDecimal()
	
int decimal = binaryToDecimal(binary);

	// loop to convert decimal to octal
	while (decimal != 0) {

	            // extracting the remainder on multiplying by 8 and dividing that with increasing powers of 10
	           
                               octalNumber += (decimal % 8)* ((int)Math.pow(10, i++));

	             // removing the last digit dividing by 8
		decimal /= 8;
	}

	// returning the converted octal number
	return octalNumber;
}

	
public static void main(String[] args){

BinaryToOctal bo = new BinaryToOctal();

// calling and printing the decimalToOctal() function.
System.out.println(bo.decimalToOctal(1001001));

}}
