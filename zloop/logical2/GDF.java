package in.dsa.zloop.logical2;

import java.util.Scanner;

public class GDF{

	public static void main(String[] args){
   
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number 1 : ");
        int no1=sc.nextInt(); 
        System.out.println("Enter number 2 : ");
        int no2=sc.nextInt();

        int gdf=0;
        for(int i =1; i<no1 && i<no2; i++){
             if(no1%i==0 && no2%i==0){
               gdf=i;    
             }

        }
        
System.out.println("GDF of two number is : "+gdf);
}}