package in.dsa.zloop.pttrn;

import java.io.InputStream;
import java.util.Scanner;

public class StarPattern{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter Size :-");
		//int n = sc.nextInt();
	
		/* Loop 1..............................
		// *****
		// *****
		// *****
		// *****
		// *****
		
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<5; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
        
	
	
		/* Loop 2..............................
		// *
		// **
		// ***
		// ****
		// *****
		
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		/* Loop 3..............................
		// *****
		// ****
		// ***
		// **
		// *
		
		for(int i = 5; i>0; i--)
		{
			for(int j = 0; j<i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		/* Loop 4..............................
		    // *
		   // **
		  // ***
		 // ****
		// *****
		
		for(int i = 0; i<5; i++)
		{
			for(int j = 4; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int j = 0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/* Loop 5..............................
		// *****
		// ****
		// ***
		// **
		// *
 		
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 5; j>i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		/* Loop 6..............................
		// **********
		// ****  ****
 		// ***    ***
 		// **      **
 		 //*        *
		
		
		for(int i = 0; i<5; i++)
		{
			for(int j = 5; j>i; j--)
			{
				System.out.print("*");
			}
			for(int j = 0; j<i; j++)
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 5; j>i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/* Loop 7..............................
		// *        *
		// **      **
 		// ***    ***
 		// ****  ****
 		// **********
		
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<=i; j++)
			{
				System.out.print("*");
			}
			for(int j = 4; j>i; j--)
			{
				System.out.print(" ");
			}
			
			for(int j = 4; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int j = 0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
	
		
		
		/* Loop 8..............................
		// **********
		// ****  ****
		// ***    ***
		// **      **     
		// *        *
		// **      **
 		// ***    ***
 		// ****  ****
 		// **********
 		 
		
		for(int i = 0; i<5; i++)
		{
			for(int j = 5; j>i; j--)
			{
				System.out.print("*");
			}
			for(int j = 0; j<i; j++)
			{
				System.out.print(" ");
			}
			
			for(int j = 0; j<i; j++)
			{
				System.out.print(" ");
			}
			for(int j = 5; j>i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
        
		for(int i = 0; i<5; i++)
		{
			for(int j = 0; j<=i; j++)
			{
				System.out.print("*");
			}
			for(int j = 4; j>i; j--)
			{
				System.out.print(" ");
			}
			
			for(int j = 4; j>i; j--)
			{
				System.out.print(" ");
			}
			for(int j = 0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		
		
		/* Loop 9..............................
		// *        *
		// **      **
		// ***    ***
		// ****  ****     
		// **********
		// ****  ****
 		// ***    ***
 		// **      **
 		// *        *
 		
		for(int i = 0; i<5; i++)
 		{
 			for(int j = 0; j<=i; j++)
 			{
 				System.out.print("*");
 			}
 			for(int j = 4; j>i; j--)
 			{
 				System.out.print(" ");
 			}
 			for(int j = 4; j>i; j--)
 			{
 				System.out.print(" ");
 			}
 			
 			for(int j = 0; j<=i; j++)
 			{
 				System.out.print("*");
 			}
 			System.out.println();
 		}
 		
 		for(int i = 0; i<4; i++)
 		{
 			for(int j = 4; j>i; j--)
 			{
 				System.out.print("*");
 			}
 			for(int j = 0; j<=i; j++)
 			{
 				System.out.print(" ");
 			}
 			for(int j = 0; j<=i; j++)
 			{
 				System.out.print(" ");
 			}
 			for(int j = 4; j>i; j--)
 			{
 				System.out.print("*");
 			}
 			System.out.println();
 		}
	    
		
		
		
		/* Loop 10..............................
		        //**********
		       //  ********
		      //    ******
		     //      ****
		    //        **
		     
		    for(int i = 0; i<5; i++){
		    	
		    	for(int  j = 0; j<i; j++){
		    		System.out.print(" ");
		    	}
		    	for(int j = 10; j>2*i; j--){
		    		System.out.print("*");
		    	}
		    	
		    	System.out.println();
		    }
		
		     
		   */
		   
		   
		
		/* Loop 11..............................
	         // **
		    // ****
		   // ******
		  // ********
		 // **********
		 
		 for(int i = 1; i<=5; i++){
			 
			 for(int j = 5; j>i; j--){
				 System.out.print(" ");
			 }v
			 //for of * printing "2*i-1" condition
			 for(int j = 0; j<2*i; j++){
				 System.out.print("*");
			 }
		 	 System.out.println();
		 }
		 
		/*
		 
		 /* Loop 12..............................
	     // ********
		 //  ******
		 //   ****
		 //    **
		 //    **
		 //   ****
		 //  ******
		 // ********
		 
		 
		 /* Loop 12..............................
	     //     **
		 //    ****
		 //   ******
		 //  ********
		 // **********
		 // **********
		 //  ********
		 //   ******
		 //    ****
		 //     **
		  //These both Example are similar to 11thQ we hafta use 6loop here.
		     
	
		
		  //Loop 13..............................
	        //  * * * * *
		   //   * 		*
		  //    * 		*	
		 //     * 		*
		//      * * * * *
		
	     for(int i = 0; i<5; i++){
	    	 for(int j = 0; j<5; j++){
	    		 if(i==0 || i==4){
	    			 System.out.print("* ");
	    	     }
	    	 }
	    	 	if(i>0 && i<4)
	    	 	{   
	    	 		System.out.println();
	   	      	 	System.out.print("*       *");
	    	 	}
	    	 	if(i==3){
	    	 	 System.out.println();
	    	 	 
	    	 	}
	    	 }
	     
	     
	    //Loop 13..............................
	      	//   * * * * *
	     	//   * *   * *
	     	//   *   *   *
	     	//   * *   * *
	     	//   * * * * *

	     for(int i = 0; i<5; i++){
	    	 for(int j = 0; j<5; j++){
	    		 if(i==0 || i==4){
	    			 System.out.print("* ");
	    		 }
	    	 }
	    	 if(i==1 || i==3){
	    		 System.out.println();
	    	 	 System.out.print("* *   * *");
	    		 System.out.println();
		     }
	    	 if(i==2){
	    		 System.out.print("*   *   *");
	    	 }
	    	 
	     }
	        
	
		
		//Loop 14..............................
	      //      * * * * *
		  //     * * * * *
		  //    * * * * *
		  //   * * * * *
		  //  * * * * *
	      
		
		   for(int i =0; i<5; i++){
			   for(int j = 4; j>i; j--){
				   System.out.print(" ");
			   }
			   for(int j = 0; j<5; j++){
				   System.out.print("* ");
			   }
			   System.out.println();
		   }
		   
		
		//Loop 15..............................
		    
		 // * * * * *
		 //	*		*
		 //	* 		*
		 // * 		*
		// 	* * * * *
		 	for(int  i = 0; i<5; i++){
			String space ="";
		    for(int j = 4; j>i; j--){
	    		System.out.print(" ");
	    		space = space+" ";
	    	}
	    	for(int j = 0; j<5; j++){
	    		if(i==0 || i==4){
	    		System.out.print("* ");
	    		}
		    }
	    	if(i>0 && i<4){
	    		System.out.println();
	    		System.out.print(space+"*       *");
	    	}
	    	if(i==3){
	    		System.out.println();
			}
			
	    }
		//Question No. 5 and 6 of Sheet Loop2 is Similar to 14 and 15,
		//hafta run loop SACES condition in increasing ng order. 
		
		
		
		//Loop 16..............................
	    for(int i = 0; i<5; i++){
	    	String space ="";
    		for(int j = 1; j<=2*i-1; j++){
	    		space = space+" ";
	    	}
    		for(int j = 0; j<=i; j++){
    			
    			if(i==2 || i==3){
    				System.out.print("*"+space+"*");
    				break;
        	    }
    			else{
    				System.out.print("* ");
        	    }
    		}
    	    System.out.println();
    		
	    }
	    //Question no 11,13,15 are of Loop2 Sheet is similar to Q16
	   
	   
	    
		//Loop 17..............................
     //         *		
	//	      *   *
	//	    *       *
	//	  *           *
	//	* * * * * * * * *

	
		String s = "   ";		
		for(int i =1 ; i<=5; i++ ){
            for(int j = 5; j>i; j--){
				System.out.print("  ");
			}
			if(i>=3){
            	for(int j = 1; j<=4; j++){
            		s = s+" ";
            	}
            }
			for(int k = 1; k<2*i; k++){
				if(i==1 || i==5){
					System.out.print("* ");
					}
			}
			if(i>1 && i<5){
				System.out.print("*"+s+"*");
			}
			System.out.println();
		}
		
		
		//          *
		//        * *
		//      * * *
		//    * * * *
		//  * * * * *
		//    * * * *
		//      * * *
		//        * *
		//          *
	    for(int i = 0; i<10; i++){
			
	    	if(i<5){
	    		for(int j = 4; j>i; j--){
	    			System.out.print("  ");
	    		}
	    		for(int k = 0; k<=i; k++){
	    			System.out.print("* ");
	    		}
	    		System.out.println();
	    	}
	    	else if(i>5 && i<10){
	    		for(int j = 6; j<=i; j++){
					System.out.print("  ");
				}
				for(int k = 10; k>i; k--){
					System.out.print("* ");
				}
				System.out.println();
	    	}
	    	
		}
	    
	    
	    
		      //   * 
	         //   * * 
	        //   * * * 
	       //	* * * * 
	      //   * * * * * 
	     //     * * * * 
	    //       * * * 
	    //        * *
		//         *
		//Sequancial Pattern......................... 
	    for(int i = 0; i<10; i++){
			
	    	if(i<5){
	    		for(int j = 4; j>i; j--){
	    			System.out.print(" ");
	    		}
	    		for(int k = 0; k<=i; k++){
	    			System.out.print("* ");
	    		}
	    		System.out.println();
	    	}
	    	else if(i>5 && i<10){
	    		for(int j = 6; j<=i; j++){
					System.out.print(" ");
				}
				for(int k = 10; k>i; k--){
					System.out.print("* ");
				}
				System.out.println();
	    	}
	    	
		}
	    
	
		
	    
	    //Odd Pattern.........................
	    //		        *
	    //		      * * *
	    //		    * * * * *
	    //		  * * * * * * *
	    //		* * * * * * * * *
	    //		  * * * * * * *
	    //		    * * * * *
	    //		      * * *
	    //		        *
	    
		int inc = 0;
	    for(int i = 1; i<=10; i++){
	    	
	    	if(i<=5){
	    		for(int j = 4; j>=i; j--){
	    			System.out.print("  ");
	    		}
	    		for(int k = 1; k<=2*i-1; k++){
	    			System.out.print("* ");
	    		}
	    		System.out.println();
	    	}
	    	else if(i>5 && i<10){
	    		for(int j = 5; j<i; j++){
	    			System.out.print("  ");
	    		}
	    		for(int k = 1 ; k<=7-inc; k++){
	    			System.out.print("* ");
	    		}
	    		//condition for decreasing star printing.......... 
	    		inc = inc+2;
	    		System.out.println();
		   }
	    }
	    
		
		
		
		
		//  * * * * * * * * * * 
		//  * * * *     * * * * 
		//  * * *         * * * 
		//  * *             * * 
		//  *                 * 
		//  *                 * 
		//  * *             * * 
		//  * * *         * * * 
		//  * * * *     * * * * 
		//  * * * * * * * * * * 
		int inc = 0;
		int m = 1;
		
		for(int  i = 0; i<=10; i++){
			
			if(i<5){
				for(int j = 5; j>i; j--){
					System.out.print("* ");
				}
				for(int j = 1; j<=2*i; j++){
					System.out.print("  ");
				}
				for(int k = 5; k>i; k--){
					System.out.print("* ");
				}
				System.out.println();
		    }
			else if(i>5 && i<=10){
				for(int j = 5; j<i; j++){
					System.out.print("* ");
				}
				//Spaces are multiple of 4 so we apply this condition.........
				for(int j = 16-inc; j>0; j--){
					System.out.print(" ");
				}
				for(int k = 0; k<m; k++){
					System.out.print("* ");
				}
				
				//Increment in multiple of 4.......................
				inc = inc + 4;
				m++;
				System.out.println();
			
			}
		}
		
		
		
		
		
			// * * * * *
			//    * * * *
			//       * * *
			//          * *
			//             *
			//          * *
			//       * * *
			//    * * * *
			// * * * * *

            for(int i = 0;i<5; i++ ){
            	for(int j = 0; j<i; j++){
            		System.out.print("   ");
            	}
            	for(int k = 5; k>i; k--){
            		System.out.print("* ");
            	}
            	System.out.println();
            }
            for(int i = 0;i<4; i++ ){
            	for(int j = 3; j>i; j--){
            		System.out.print("   ");
            	}
            	for(int k = 0; k<=i+1; k++){
            		System.out.print("* ");
            	}
            	System.out.println();
            }
            
		
		
		
			//	       * * * * *
			//	     * * * *
			//	   * * *
			//	 * *
			//	*
			//	 * *
			//	   * * *
			//	     * * * *
			//	       * * * * *

		
		
		for(int  i = 0; i<5; i++){
			for(int j = 5; j>i+1; j--){
				System.out.print("  ");
			}
			for(int  k = 5; k>i; k--){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int  i = 0; i<4; i++){
			for(int j = 0; j<=i; j++){
				System.out.print("  ");
			}
			for(int  k = 0; k<=i+1; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
		//         +
		//         +
		//         +
		//         +
		// + + + + + + + + +
		//         +
		//         +
		//         +
		//         +
		for(int i = 0; i<9; i++){
			
			if(i==4){
				for(int j = 9; j>0; j--){
				System.out.print("+ ");
				}
			}
			
			if(i>=0 && i<9 && i!=4){
				System.out.print("        "+"+");
			}
			System.out.println();
			
		}
		
		//	   	 *
		//	   *   *
		//	  * * * *
		//	 *       *
		//  *         *
		
		//for printing spaces in first row.....................
		String space = "      ";
		for(int i = 0; i<5; i++){
			for(int  j = 5; j>i; j--){
				if(i==0){
					System.out.print(space);
					break;
				}
				else{
					System.out.print(" ");
			    }
			}
			//printing left Stars............
			System.out.print("* ");
			
			for(int k = 0; k<2*i; k++){
				
				if(i==2){
					System.out.print("* ");
					
					//For printing only 2 stars * * in 3rd row.......
					if(k==1){
						break;
					}
					
			    }
				else{
					System.out.print(" ");
				}
			}
			//printing right Stars............
			if(i>0){
				System.out.print("*");
			}
			System.out.println();
		}
		
	
		
		//     * * *
		//	 *       *
		//   *       *
		//	 *       *
		//	   * * *
		//	 *       *
		//	 *       *
		//	 *       *
		//	   * * *
        int n = 9;
		for(int i = 0; i<n; i++){
			for(;;){
				if(i==0 || i==n/2 || i==n-1){
					System.out.print("  * * *  ");
					break;
				}
				else{
					System.out.print("*       *");
					break;
				}
			}
			System.out.println();
		}
		
		
		//  *     *
		//   *   *
		//    * *
		//     *
		//    * *
		//   *   *
		//  *     *
		
		for(int i = 0; i<=3; i++){
			for(int j = 0; j<i; j++){
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int k = 5; k>=2*i-1; k--){
				System.out.print(" ");
			}
			System.out.print("*");
			
		System.out.println();
		}
		System.out.println("    *");
		
        for(int i = 0; i<=3; i++){
        	for(int j = 3; j>i; j--){
				System.out.print(" ");
			}
			System.out.print("*");
			
			for(int k = 0; k<=2*i; k++){
				System.out.print(" ");
			}
			System.out.print("*");
			
		System.out.println();
		}
		*/
		
		
		
		
         //       *  *
		//      * *  * *
		//    * * *  * * *
		//  * * * *  * * * *
		//  * * * *  * * * *
		//    * * *  * * *
		//      * *  * *
		//        *  *
		 
	}
}
