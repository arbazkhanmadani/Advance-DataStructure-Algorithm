package in.dsa.zloop.logical2;

import java.util.Scanner;
public class DaysInYear{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);

System.out.println("Enter the year");
int year = sc.nextInt();

System.out.println("Press 1 for Jan");
System.out.println("Press 2 for Feb");
System.out.println("Press 3 for March");
System.out.println("Press 4 for April");
System.out.println("Press 5 for May");
System.out.println("Press 6 for June");
System.out.println("Press 7 for July");
System.out.println("Press 8 for Aug");
System.out.println("Press 9 for Sept");
System.out.println("Press 10 for Oct");
System.out.println("Press 11 for Nov");
System.out.println("Press 12 for Dec");

System.out.println("Enter the month");
int month = sc.nextInt();

switch(month){

           case 1:
                   System.out.println("Janruary has 31 days and the year is "+year);
break;
          case 2:
                   System.out.println("Fabruary has 28 days and the year is "+year);
break;
          case 3:
                   System.out.println("March has 30 days and the year is "+year);
break;
          case 4:
                   System.out.println("April has 31 days and the year is "+year);
break;
          case 5:
                   System.out.println("May has 30 days and the year is "+year);
break;
          case 6:
                   System.out.println("June has 31 days and the year is "+year);
break;
          case 7:
                   System.out.println("July has 30 days and the year is "+year);
break;
          case 8:
                   System.out.println("August has 31 days and the year is "+year);
break;
          case 9:
                   System.out.println("September has 30 days and the year is "+year);
break;
          case 10:
                   System.out.println("October has 31 days and the year is "+year);
break;
          case 11:
                   System.out.println("November has 30 days and the year is "+year);
break;
          case 12:
                   System.out.println("December has 31 days and the year is "+year);
break;
default :
System.out.println("Invalit Input");
}

}}