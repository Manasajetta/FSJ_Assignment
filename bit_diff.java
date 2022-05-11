/*You are given two numbers A and B. The task is to count the number of bits needed to be flipped to convert A to B.

Example 1:

Input: A = 10, B = 20
Output: 4
Explanation:
A  = 01010
B  = 10100
As we can see, the bits of A that need 
to be flipped are 01010. If we flip 
these bits, we get 10100, which is B.*/

// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;


 // } Driver Code Ends
//User function Template for Java

class Solution{
    
    // Function to find number of bits needed to be flipped to convert A to B
    public static int countBitsFlip(int a, int b){
        
        // Your code here
       // int a=25,b=20;
		String as="",bs="";
        int aq=0,ar=0,bq=0,br=0;
        while(a!=0){
            aq=a&1;
            as=aq+as;
            a=a>>1;
        }
        while(b!=0){
            bq=b&1;
            bs=bq+bs;
            b=b>>1;
        }
        // System.out.println(as);
        // System.out.println(bs);
        if(as.length()>bs.length()){
            while(as.length()-bs.length()!=0){
                bs="0"+bs;
            }
        }
        else{
                while(bs.length()-as.length()!=0){
                as="0"+as;
            }
            }
            int c=0;
        for(int i=0;i<as.length();i++){
            if(as.charAt(i)==bs.charAt(i))
               continue;
            else
               c++;
        }
        return c;
    }
    
    
}


// { Driver Code Starts.

// Driver class
class bit_diff {
    
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//testcases
		int m, n;
		long ans = 0; // initialise ans to 0
		while(t-->0) {
		    
		    //input m and n
		    m = sc.nextInt();
		    n = sc.nextInt();
		    Solution obj = new Solution();
		    System.out.println(obj.countBitsFlip(m, n));
		}
	}
}

  // } Driver Code Ends