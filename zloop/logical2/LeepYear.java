package in.dsa.zloop.logical2;

public class LeepYear {

	public static void main(String[] args) {

	    int year = 1900;
	    boolean leap = false;

	    // if the year is divided by 4, if the year is century if year is divided by 400
	    if ( (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) ) 
	    	leap = true;
	    
	    else
	      leap = false;

	    
	    if (leap)
	      System.out.println(year + " is a leap year.");
	    else
	      System.out.println(year + " is not a leap year.");
	  
	}
	
}
