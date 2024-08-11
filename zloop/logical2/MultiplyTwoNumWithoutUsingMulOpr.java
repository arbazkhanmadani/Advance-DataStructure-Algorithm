package in.dsa.zloop.logical2;

import java.util.Scanner;


public class MultiplyTwoNumWithoutUsingMulOpr{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2st number");
		int b = sc.nextInt();


		int pro =0;
		for(int i =0; i<b; i++){
			pro =pro+a;
		}

		System.out.println("the product of given number is : "+pro);
	}
}