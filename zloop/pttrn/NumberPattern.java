package in.dsa.zloop.pttrn;


public class NumberPattern {

	public static void main(String[] args) {

		//18,19,41,42,43.44.45,29,51,52 remaining...............
		
		/*
		// Question 2s............................
		// 11111
		// 00000
		// 11111
		// 00000
		// 11111
		for(int i = 0; i<5; i++){
			for(int j = 0; j<5; j++){
				if(i%2==0){
					System.out.print("1");
				}
				else if(i%2!=0){
					System.out.print("0");
				}
			}
			System.out.println();
		}
		
		
		
		// Question 3s............................
		// 0 1 0 1 0
		// 0 1 0 1 0
		// 0 1 0 1 0
		// 0 1 0 1 0
		// 0 1 0 1 0
         for(int i = 0; i<5; i++){
        	 for(int j = 1; j<=5; j++){
        		 if(j%2!=0)
        			System.out.print("0 "); 
        		 else
        			System.out.print("1 "); 
        	 }
        	 System.out.println();
         }
		
		
		// Question 4s............................
		// 1 1 1 1 1
		// 1 0 0 0 1
		// 1 0 0 0 1
		// 1 0 0 0 1
		// 1 1 1 1 1
		for(int i = 0; i<5; i++){
			for(int j = 0; j<5; j++){
				if(i==0 || i==4){
					System.out.print("1 ");
				}
				else if(i>0 && i<4){
					if(j==0 || j==4)
						System.out.print("1 ");
					else
						System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
		
		
		// Question 5s............................
		// 1 1 1 1 1
		// 1 1 1 1 1
		// 1 1 0 1 1
		// 1 1 1 1 1
		// 1 1 1 1 1
        for(int  i = 0; i<5; i++){
        	for(int j = 0; j<5; j++){
        		
        		if(i>=0 && i<=4 && i!=2)
        			System.out.print("1 ");
        		else{
        			
        			if(j>=0 && j<=4 && j!=2)
        				System.out.print("1 ");
        			else
        				System.out.print("0 ");
        		}
        	}
        	System.out.println();
        }
        
        
        
	    // Question 6s............................
		// 1 0 1 0 1
		// 0 1 0 1 0
		// 1 0 1 0 1
		// 0 1 0 1 0
		// 1 0 1 0 1
		for(int i = 1; i<=5; i++){
			for(int j = 1; j<=5; j++){
				if(i%2!=0){
					
					if(j%2!=0){
						System.out.print("1 ");
					}
					if(j%2==0){
						System.out.print("0 ");
					}
					
				}
				else if(i%2==0){
					
					if(j%2!=0){
						System.out.print("0 ");
					}
					if(j%2==0){
						System.out.print("1 ");
					}
					
				}
			}
			System.out.println();
		}
		
		
		// Question 7s............................
		// 1 1 0 1 1
		// 1 1 0 1 1
		// 0 0 0 0 0
		// 1 1 0 1 1
		// 1 1 0 1 1
        for(int  i = 0; i<5; i++ ){
        	for(int  j = 0; j<5; j++){
        		
        		if(i>=0 && i<5 && i!=2){
        			
        			if(j>=0 && j<5 && j!=2)
        				System.out.print("1 ");
        			else if(j==2)
        				System.out.print("0 ");
        		}
        		if(i==2){
        			System.out.print("0 ");
        		}
        	}
        	System.out.println();
        }
		
		
		
		// Question 8s............................
		// 1 0 0 0 1
		// 0 1 0 1 0
		// 0 0 1 0 0
		// 0 1 0 1 0
		// 1 0 0 0 1
		for(int i = 0; i<5; i++){
			for(int  j = 0; j<5; j++){
				
				if(i==0 || i==4){
					if(j==0 || j==4)
						System.out.print("1 ");
					else
						System.out.print("0 ");
			    }
				else if(i==1 || i==3){
					if(j%2==0){
						System.out.print("0 ");
					}
					else
						System.out.print("1 ");
			   }
			   else if(i==2){
					if(j==2){
						System.out.print("1 ");
					}
					else
						System.out.print("0 ");
			   }
			}
			System.out.println();	 
	   }
	   
		
		
		// Question 9s............................
		// 0 1 1 1 0
		// 1 0 0 0 1
		// 1 0 0 0 1
		// 1 0 0 0 1
		// 0 1 1 1 0
		for(int i = 0; i<5; i++){
			for(int j = 0; j<5; j++){
				
				if(i==0 || i==4){
					if(j==0 || j==4)
						System.out.print("0 ");
					else
						System.out.print("1 ");
				}
				if(i>0 && i<4){
					if(j==0 || j==4)
						System.out.print("1 ");
					else
						System.out.print("0 ");
				}
			}
			System.out.println();
		}
		
		
		
		// Question 10s............................
		// 1 1 1 1 1
		// 2 2 2 2 2
		// 3 3 3 3 3
		// 4 4 4 4 4
		// 5 5 5 5 5
		
		int num = 1;
		for(int  i = 0; i<5; i++){
			for(int  j = 0; j<5; j++){
				System.out.print(num+" ");
			}
			num++;
			System.out.println();
		}
		
		
		
		// Question 11s............................
		// 1 2 3 4 5
		// 1 2 3 4 5
		// 1 2 3 4 5
	    // 1 2 3 4 5
		// 1 2 3 4 5
		
		for(int  i = 0; i<5; i++){
			int num = 1;
			for(int j = 0; j<5; j++){
				System.out.print(num+++" ");
			}
			System.out.println();
		}
		
		
		
		// Question 12s............................
		// 1 2 3 4 5
		// 2 3 4 5 6
		// 3 4 5 6 7
		// 4 5 6 7 8
		// 5 6 7 8 9
		
		int num1 = 1;
		int num2 = 1;
		for(int  i = 0; i<5; i++){
			for(int j = 0; j<5; j++){
				System.out.print(num1++ +" ");
			}
			num2++;
			num1=num2;
			System.out.println();
		}
		
		
		
		// Question 13s............................
		//  1  2  3  4  5
		//  6  7  8  9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25
		
		int num3 = 1;
		for(int  i = 0; i<5; i++){
			for(int j = 0; j<5; j++){
				//This if-else condition is for-> cos once digit
				//dosent have spaces, to give extra space
				//{  1 2 3 4 5  ->   1   2   3   4   5 } 
				if(i==0 || i==1)
					System.out.print(num3++ +"  ");
				else
					System.out.print(num3++ +" ");
			}
			System.out.println();
		}
		
		
		// Question 14s............................
		//	5 5 5 5 5
		//	5 4 4 4 4
		//	5 4 3 3 3
		//	5 4 3 2 2
		//	5 4 3 2 1
		
		for(int i = 5; i>0; i--){
			for(int j = 5; j>=i; j-- ){
				System.out.print(j+" ");
			}
			for(int k = 1; k<i; k++){
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
		
		//***TRICKY
		// Question 15s............................
		// 1 2 3 4 5
		// 2 3 4 5 5
		// 3 4 5 5 5
		// 4 5 5 5 5
		// 5 5 5 5 5
		
		for(int i = 1; i<=5; i++){
			
			//TRICK
			int num3 = i;
			for(int j = 5; j>=i; j--){
				System.out.print( num3+++" ");
			}
			for(int j = 1; j<i; j++){
				System.out.print("5 ");
			}
			System.out.println();
		}
		
		
		//***TRICKY
		// Question 16s............................
		// 1 2 3 4 5
		// 2 3 4 5 1
		// 3 4 5 2 1
		// 4 5 3 2 1
		// 5 4 3 2 1
		for(int i = 1; i<=5; i++){
			
			//TRICK 1
			int num1 = i;
			for(int j = 5; j>=i; j--){
				System.out.print( num1++ +" ");
			}
			
			int num2 = 1;
			//TRICK 2
			num2= i;
			for(int k = 1; k<i; k++){
			
				System.out.print(--num2 +" ");
			}
			System.out.println();
		}
		
		
		
		//***TRICKY
		// Question 17s............................
		// 1 2 3 4 5
		// 2 1 2 3 4
		// 3 2 1 2 3
		// 4 3 2 1 2
		// 5 4 3 2 1		
		for(int  i = 1; i<=5; i++){
			
			//TRICK 1
			int num = i;
			for(int j = 0; j<i; j++){
				System.out.print(num--+" ");
			}
			
			//TRICK 2
			int num1 = i;
			for(int k = 5; k>i; k--){
				System.out.print(++num1 +" ");
			}
			
			System.out.println();
		}
		
		
		
		// Question 20s............................
		// 1
		// 2 2
		// 3 3 3
		// 4 4 4 4
		// 5 5 5 5 5
        
        for(int i = 1; i<=5; i++){
        	for(int j = 1; j<=i; j++){
        		System.out.print(i+" ");
        	}
        	System.out.println();
        }
		
		
		// Question 21s............................
		// 5 5 5 5 5
		// 4 4 4 4
		// 3 3 3
		// 2 2
		// 1
		
		for(int i = 5; i>0; i--){
        	for(int j = 1; j<=i; j++){
        		System.out.print(i+" ");
        	}
        	System.out.println();
        }
        
        
        // Question 22s............................
		// 1 1 1 1 1
		// 2 2 2 2
		// 3 3 3
		// 4 4
		// 5
		
		for(int i = 1; i<=5; i++){
        	for(int j = 5; j>=i; j--){
        		System.out.print(i+" ");
        	}
        	System.out.println();
        }
		
		
		// Question 23s............................
		// 5
		// 4 4
		// 3 3 3
		// 2 2 2 2
		// 1 1 1 1 1
		
		for(int i = 5; i>0; i--){
        	for(int j = 5; j>=i; j--){
        		System.out.print(i+" ");
        	}
        	System.out.println();
        }
				
		
		// Question 24s............................
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5
		
		for(int i = 1; i<=5; i++){
        	for(int j = 1; j<=i; j++){
        		System.out.print(j+" ");
        	}
        	System.out.println();
        }
		
		
		
		// Question 25s............................
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1
    
		for(int i = 1; i<=5; i++){
			int num = 1;
        	for(int j = 5; j>=i; j--){
        		System.out.print(num++ +" ");
        	}
        	System.out.println();
        }
		
		
		//***TRICKY
		// Question 26s............................
		// 1
		// 2 1
		// 3 2 1
		// 4 3 2 1
		// 5 4 3 2 1
		
		for(int i = 1; i<=5; i++){
			
			//TRICK
			int num = i;
    		for(int j = 1; j<=i; j++){
				System.out.print(num-- +" ");
        	}
        	System.out.println();
        }
		
		
		
		
		//***TRICKY
		// Question 27s............................
		// 5 4 3 2 1
		// 4 3 2 1
		// 3 2 1
		// 2 1
		// 1

        for(int i = 5; i>=0; i--){
			
			//TRICK
			int num = i;
    		for(int j = 1; j<=i; j++){
				System.out.print(num-- +" ");
        	}
        	System.out.println();
        }
	
		
		
		// Question 28s............................
		// 5
		// 5 4
		// 5 4 3
		// 5 4 3 2
		// 5 4 3 2 1
		
		for(int i = 5; i>0; i--){
			
			for(int j = 5; j>=i; j--){
				System.out.print(j+" ");
        	}
        	System.out.println();
        }
		
		
		
		
		//*** HALF TRICKY
	    // Question 29s............................
		// 5 4 3 2 1
		// 5 4 3 2
		// 5 4 3
		// 5 4
		// 5
		for(int i = 1; i<=5; i++){
			for(int  j = 5; j>=i; j--){
				System.out.print(j+" ");
			}
			System.out.println();
	    }
		
		
		
		//***TRICKY
		// Question 30s............................
		// 5
		// 4 5
		// 3 4 5
		// 2 3 4 5
		// 1 2 3 4 5
		
		for(int i = 5; i>0 ;i--){
			
			//TRICK
			int num = i; 
			for(int j = 5;j>=i; j--){
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
		
		
		
		//***TRICKY
	    // Question 31s............................
		// 1 2 3 4 5
		// 2 3 4 5
		// 3 4 5
		// 4 5
		// 5

		for(int  i = 1; i<=5; i++){
			//Trick
			int  num  = i;
			for(int  j = 5 ; j>=i; j--){
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
		
		
		
		
		//***TRICKY
	    // Question 32s............................
		// 1
		// 2 3
		// 3 4 5
		// 4 5 6 7
		// 5 6 7 8 9
		
		for(int i = 1; i<=5; i++){
			//TRICK
		    int num = i;
			for(int j = 1; j<=i; j++){
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
		
		
		
		//***TRICKY
	    // Question 33s............................
		// 5 6 7 8 9
		// 4 5 6 7
		// 3 4 5
		// 2 3
		// 1
		
		for(int i = 5; i>=0; i--){
			
			//TRICK
		    int num = i;
			for(int j = 1; j<=i; j++){
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
		
		
		
		//***TRICKY
	    // Question 34s............................
		// 1 3 5 7 9
		// 3 5 7 9
		// 5 7 9
		// 7 9
		// 9
		for(int i = 1; i<10; i++){ 
			
			//TRICK
			int num = i;
			if(i%2!=0){
				for(int  j = 10; j>=i; j--){
					
					if(j%2!=0){
						System.out.print(num +" ");
					
						//TRICK
						num = num+2;
					}
				}
			}
			//for removing spaces.............
			else
				continue;
			
			System.out.println();
		}
		
		
		
		
		// Question 35s............................
		// 1
		// 1 0
		// 1 0 1
		// 1 0 1 0
		// 1 0 1 0 1
		
		for(int i = 1; i<=5; i++){ 
			for(int j = 1; j<=i; j++){ 
				if(j%2!=0){
					System.out.print("1 ");
				}
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
        
		
		
		
		// Question 36s............................
		// 1
		// 0 0
		// 1 1 1
		// 0 0 0 0
		// 1 1 1 1 1
		
		for(int i = 1; i<=5; i++){ 
			for(int j = 1; j<=i; j++){ 
				if(i%2!=0){
					System.out.print("1 ");
				}
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
		
		
		
		
		// Question 37s............................
		// 1
		// 0 1
		// 0 1 0
		// 1 0 1 0
		// 1 0 1 0 1
		for(int i = 1; i<=5; i++){
			
			if(i>=1 && i<4 && i!=1){
				for(int j = 1; j<=i; j++){ 
					if(j%2!=0){
						System.out.print("0 ");
					}
					else
						System.out.print("1 ");
			    }
				System.out.println();
			}
			else if(i>=4 && i<=5 || i==1){
				for(int j = 1; j<=i; j++){ 
					if(j%2!=0){
						System.out.print("1 ");
					}
					else
						System.out.print("0 ");
			    }
				System.out.println();
			}
		}
		
		
		
		
		// Question 38s............................
		// 1
		// 1 1
		// 1 0 1
		// 1 0 0 1
		// 1 1 1 1 1
		
		for(int i = 1; i<=5; i++){
			
			if(i==1 || i==2 || i==5){
				for(int j = 1; j<=i; j++){ 
						System.out.print("1 ");
				}
				System.out.println();
			}
			else if(i==3 || i==4){
				for(int j = 1; j<=i; j++){ 
					if(j==1 || j==i){
						System.out.print("1 ");
					}
					else
						System.out.print("0 ");
			    }
				System.out.println();
			}
		}
		
		
		
		
		// Question 39s............................
		// 1
		// 1 2 3
		// 1 2 3 4 5
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6 7 8 9

		for(int i = 1; i<=10; i++){
			if(i%2!=0){
				for(int j = 1; j<=i; j++ ){
					System.out.print(j+" ");
				}
				System.out.println();
			}
		}
		
		
		
		
		
		//TRICKY
		// Question 40s............................
		// 1
		// 2 4
		// 1 3 5
		// 2 4 6 8
		// 1 3 5 7 9
		
		for(int i = 1; i<=5; i++){
			
			if(i==1 || i==3 || i==5){
				int num = 1;
				for(int j = 1; j<=i; j++ ){
					System.out.print(num+" ");
				
				num = num+2;
				}
				System.out.println();
			}
			else if(i==2 || i==4){
				int num = 2;
				for(int j = 1; j<=i; j++ ){
					System.out.print(num+" ");
				
				num = num+2;
				}
				System.out.println();
			}
		}
		
		
		
		
		
		
	    
		
	
		
		
		//***TRICKY
		// Question 46s............................
		// 1
		// 2 1
		// 1 2 3
		// 4 3 2 1
		// 1 2 3 4 5
    
		for(int i = 1; i<=5; i++){
			
			if(i%2!=0){
				for(int j = 1; j<=i; j++){
					System.out.print(j+" ");
				}
			}
			else{
				//TRICK
				int num = i;
				for(int j = 1; j<=i; j++){
					System.out.print(num-- +" ");
				}
			}
			System.out.println();
		}
		
		
		
		
		
		// Question 47s............................
		// 1
		// 23
		// 4567
		// 89123456
		// 7891234567891234
		
		
		int num = 1;
		for(int i = 1; i<=5; i++){
			int num1 = i;
			
			if(i%2==0){
				for(int j = 1; j<=num; j++){
					if(num1<=9)
						System.out.print(num1++);
					else{
						num1 = 1;
						System.out.print(num1++);
					}
				}
			}
			num = num*2;
			System.out.println();
		}
		
		
		
		
		
		
		//***TRICKY
		// Question 48s............................
		// 1                 1
		// 1 2 			   2 1
		// 1 2 3 		 3 2 1
		// 1 2 3 4 	   4 3 2 1
		// 1 2 3 4 5 5 4 3 2 1

		for(int i = 1; i<=5; i++){
			
			//TRICK
			int num = i;
			for(int j = 1; j<=i; j++){
				System.out.print(j+" ");
			}
			for(int k = 9; k>2*i-1; k--){
				System.out.print("  ");
			}
			for(int l = 1; l<=i; l++){
				System.out.print(num-- +" ");
			}
			System.out.println();
		}
		
		
		



		//***MOST TRICKY
		// Question 51s............................
		// 1
		// 3 2
		// 4 5 6
		// 10 9 8 7
		// 11 12 13 14 15

		int inc  = 2;
		int num = 1;
		int num1 = 0;
	    for(int i = 1; i<=5; i++){
 			
			if(i%2!=0){
 				for(int j = 1; j<=i; j++){
 					System.out.print(num++ +" ");
 				}
 				//TREAK
 				num = num+inc;
 	 			inc = inc+2;
 	 		}
			else if(i%2==0){
				//TREAK
				num1 = num;
 				for(int j = 1; j<=i; j++){
 					System.out.print(--num1 +" ");
 				}
 			}
 			System.out.println();
 		}
		





		
		
		//***TRICKY
		// Question 52s............................
		// 1
		// 2 2
		// 3 3 3
		// 2 2 2 2
		// 1 1 1 1 1
		for(int i = 1; i<=5; i++){
			
			//TRICK
			int num = i;
			if(i>0 && i<4){
				for(int j = 1; j<=i; j++){
					System.out.print(num+" ");
				}
			}
			else{
				//TRICK -> in 1st itr - 6-4=2 &  int 2nd itr - 6-5=1.
			    num = 6-i;
			    for(int j = 1; j<=i; j++){
					System.out.print(num+" ");
				}
			}
			System.out.println();
		}		
		
		
        
        //***TRICK
		// Question 53s............................
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1

		for(int i = 1; i<=5; i++){
			
			//TRICK
			int num = 1;
			for(int j = 5; j>=i; j--){
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
					
		
	
		
		//***TRICK
		// Question 54s............................
		// 1 2 3 4 5
		// 2 3 4 5
		// 3 4 5
		// 4 5
		// 5
		
		for(int i = 1; i<=5; i++){
			
			//TRICK
			int num = i;
			for(int j = 5; j>=i; j--){
				System.out.print(num++ +" ");
			}
			System.out.println();
		}
		
		
		
		//***TRICKY
		// Question 55s............................
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1
		
		//TRICK
		int inc = 0;
		int num = 0;
		for(int i = 1; i<10; i++){
			
			if(i<6){
				for(int j = 1; j<=i; j++){
					System.out.print(j +" ");
				}
			}
			else{
				//TRICK
				num = i-(inc+2);
				for(int j = 1; j<=num; j++){
					System.out.print(j +" ");
				}
				inc = inc+2;
				
			}
			System.out.println();
		}
		
		
		
		
		// Question 56s............................
		// 1
		// 1 2 3
		// 1 2 3 4 5
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5 6 7 8 9
		// 1 2 3 4 5 6 7
		// 1 2 3 4 5
		// 1 2 3
		// 1

		for(int i = 1; i<10; i++){
					
			if(i%2!=0){
				for(int j = 1; j<=i; j++){
					System.out.print(j +" ");
				}
			}
			else
				continue;
			System.out.println();
		}
		for(int i = 8; i>=0; i--){
			
			if(i%2!=0){
				for(int j = 1; j<=i; j++){
					System.out.print(j +" ");
				}
			}
			else
				continue;
			System.out.println();
		}		
				
		

		
		// Question 50s............................
		// 1
		// 2 4
		// 7 11 16
		// 22 29 37 46
		// 56 67 79 92 106
		
		int count =0;
		for(int i = 1; i<=5; i++){
			
			for(int j = 1; j<=i; j++){
				count++;
			}
		}
		int num = count-1;
		for(int i = 1; i<=5; i++){
			
			for(int j = 1; j<=i; j++){
				
			}
			System.out.println();
		}
		
		*/
		
		
		
		
		
		
		
		// Question 41s............................
	    // 1
		// 1 3 1
		// 1 3 5 3 1
		// 1 3 5 7 5 3 1
		// 1 3 5 7 9 7 5 3 1
        
		int num1 = 0;
		for(int i = 10; i>0; i--){
			
			int num = 1;
			if(i%2!=0){
				num1 = i;
				for(int j = 10; j>=i; j--){
					if(j%2!=0){
						System.out.print(num+" ");
					num = num+2;
					}
				}
				for(int k = i; k>=1; k--){
					if(k%2!=0 && i!=1){
						System.out.print(num1+" ");
						num1 = num1-2;
					}
				}
				System.out.println();
			}
			else
				continue;
			
		}
		
		
		
	}
}
