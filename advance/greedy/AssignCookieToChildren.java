package in.dsa.advance.greedy;
import java.util.Arrays;

/**
 
 To solve the problem of maximizing the number of content children given their greed factors and available cookies, follow these steps:

Approach
Sort the Greed Factors and Cookie Sizes:

Sort the array of greed factors g in ascending order. This allows you to start with the least demanding child.
Sort the array of cookie sizes s in ascending order. This allows you to use the smallest sufficient cookie for each child.
Use Two-Pointer Technique:

Use two pointers to traverse the sorted arrays: one for the children (i) and one for the cookies (j).
Try to satisfy each child starting from the least demanding to the most demanding using the smallest available cookie that meets their greed factor.
Greedy Matching:

For each child, find the smallest cookie that satisfies their greed factor. Once a cookie is used, move to the next cookie.
Move to the next child only after finding a suitable cookie for the current child.
Example
Given g = [1, 2, 3] and s = [1, 1]:

Sort g to get [1, 2, 3] and s to get [1, 1].
Start with the smallest child (greed factor 1) and try to satisfy them with the smallest cookie (size 1).
After satisfying the child, use the next cookie for the next child.
Since you only have two cookies but three children, only the child with greed factor 1 can be satisfied.
 

Explanation
Sorting:

Arrays.sort(g) sorts the greed factors of the children.
Arrays.sort(s) sorts the sizes of the cookies.
Two Pointers:

childIndex keeps track of the current child.
cookieIndex keeps track of the current cookie.
The while loop continues as long as there are children and cookies to process.
Greedy Matching:

If the current cookie can satisfy the current child (s[cookieIndex] >= g[childIndex]), move to the next child.
Always move to the next cookie (cookieIndex++).
Result:

childIndex will be the count of satisfied children since it tracks how many children have been matched with cookies.
This solution efficiently finds the maximum number of content children by leveraging sorting and the two-pointer technique, 
ensuring that each child gets the smallest possible cookie that satisfies their greed factor.

*/

public class AssignCookieToChildren{
	
	public static void main(String[] args){
        
        int[] g1 = {1, 2, 3};
        int[] s1 = {1, 1};
        System.out.println(findContentChildren(g1, s1)); // Output: 1
        
        int[] g2 = {1, 2};
        int[] s2 = {1, 2, 3};
        System.out.println(findContentChildren(g2, s2)); // Output: 2
    }
	
	
	public static int findContentChildren(int[] g, int[] s){
	        
		 // Sort the greed factors and cookie sizes
	     Arrays.sort(g);
	     Arrays.sort(s);

	     int childIndex = 0;
	     int cookieIndex = 0;

	     //Iterate through the children and cookies
	     while(childIndex < g.length && cookieIndex < s.length){
	    	 
	            //If the current cookie can satisfy the current child
	            if(s[cookieIndex] >= g[childIndex]) 
	               childIndex++; // Move to the next child
	            
	       cookieIndex++; // Move to the next cookie
	     }

	       
	     // The number of satisfied children
	     return childIndex;  
	}
	
}
