package in.dsa.zloop.logical2;

public class PowFunctionImplementation {

	public static void main(String[] args) {
       
		double x1 = 2.00000;
        int n1 = 10;
        System.out.println(myPow(x1, n1)); // Output: 1024.00000
        
        double x2 = 2.10000;
        int n2 = 3;
        System.out.println(myPow(x2, n2)); // Output: 9.26100
        
        double x3 = 2.00000;
        int n3 = -2;
        System.out.println(myPow(x3, n3)); // Output: 0.25000
    }

	public static double myPow(double x, int n) {
      
		if (n == 0) 
            return 1.0;
        
        
        double half = myPow(x, n / 2);
        
        if (n % 2 == 0) {
            return half * half;
        } else if (n > 0) {
            return half * half * x;
        } else {
            return half * half / x;
        }
    }
}
