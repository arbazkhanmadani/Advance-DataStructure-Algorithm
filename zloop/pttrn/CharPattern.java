package in.dsa.zloop.pttrn;
import static java.lang.System.out;

public class CharPattern {


    public static void main(String[] args) {
           
    	/*
        
              // AAAAA
             //  AAAAA
            //   AAAAA
           //    AAAAA
          //     AAAAA
          
          for (int i = 0; i < 5; i++)
          {
          for (int j = 0; j < 5; j++) {
          char ch = 'A';
          out.print(ch);
          }
          out.println();
          }
         
          
          
          
              //A
             // AB
            //  ABC
           //   ABCD
          //    ABCDE
          
          for (int i = 0; i < 5; i++) {
          char ch1 = 'A';
          for (int j = 0; j <= i; j++) {
          
          out.print(ch1++);
          }
          out.println();
          }
         
         
         
      	     // ABCDE
		    //  ABCD
		   //   ABC
		  //    AB
		 //     A
		   
		 for(int i = 0; i<5; i++) {
            char ch = 'A';
            for (int j = 5; j>i; j--) {
                out.print(ch++);
            }
            out.println();
         }
         
         
         
         
         
         
       	    //  	A
   	       //      ABC
          //	  ABCDE
 	     //	     ABCDEFG
        //	    ABCDEFGHI
        
        for(int i = 0; i<5; i++ ) 
    	{	
    		char ch='A';
		   	for(int j = 4; j>i; j--)
    		{
    			out.print(" ");
    		}
    		for(int j = 0; j<=i; j++)
    		{
    			out.print(ch++);
    		}
    		for(int j = 1; j<=i; j++)
    		{
    			out.print(ch++);
    		}
    		out.println();
    	} 
    	
    	
    	
    	
    		 //	AB
    	    // ABCD
    	   // ABCDEF
    	  // ABCDEFGH
    	 //	ABCDEFGHIJ
    	for(int i = 0; i<5; i++)
    	{
    		char ch = 'A';
    		for(int j = 4; j>i; j-- )
    		{
    			out.print(" ");
    		}
    		
    		for(int j = 0; j<=i; j++ )
    		{
    			out.print(ch++);
    		}
    		
    		for(int j = 0; j<=i; j++ )
    		{
    			out.print(ch++);
    		}
    		out.println();
    	}
    	
    	
    	
            //	A A
           //  BB BB
          //  CCC CCC
         //	 DDDD DDDD
        //	EEEEE EEEEE
    	char ch1 = 'A';
		for(int i = 0; i<5; i++)
    	{	
    		for(int j = 4; j>i; j-- )
    		{   
    			out.print(" ");
    		}
    		for(int j = 0; j<=i; j++ )
    		{
    			out.print(ch1);
    		}
    		out.print(" ");
    		for(int j = 0; j<=i; j++ )
    		{
    			out.print(ch1);
    		}
    		ch1++;
        	out.println();
    	}
    	
    	
    	
    	
    	    // AAAAA
    	   //    A  
    	  //     A  
    	 //      A  
    	//     AAAAA
    	for(int i = 0; i<=5; i++)
    	{	
    		//Inner Loop
    		char ch = 'A';
    	    for(int j = 0; j<5; j++ )
    		{ 
    			if(i==0 || i==5) 
    				out.print(ch);
    	    }
    		
    		//Outer loop
    		if(i>0 && i<4)
    		{
    			out.println();
    			out.print("  "+ ch+"  ");
    		}
    		if(i==4)
    			out.println();
			    
	   }
	   
    	
    	
    	
    	    // A
    	   //  BC
    	  //   DEF
    	 //    GHIJ
    	//     KLMNO
    	
    	char ch = 'A';
		for(int i = 0; i<5; i++)
    	{   
    		for(int j = 0; j<=i; j++)
    		{
    			out.print(ch++);
    		}
    		out.println();
    	}
		
    	
    	
    	      //   A
    	     //   AAA
    	    //   AAAAA
    	   //   AAAAAAA
    	  //     AAAAA
    	 //       AAA
        //	       A

    	
    	for(int i =1; i<5; i++)
    	{
    		for(int j = 4; j>i; j--)
    		{
    			out.print(" ");
    		}
    		for(int j = 1; j<=2*i-1; j++)
    		{
    			out.print("A");
    		}
    		out.println();
        }
    	for(int i =1; i<5; i++)
    	{
    		for(int j = 1; j<=i; j++)
    		{
    			out.print(" ");
    		}
    		for(int j = 5; j>=2*i-1; j--)
    		{
    			out.print("A");
    		}
    		out.println();
    	
    	}
    	
    	
    	*/
    	
    	
    	
   }
}
