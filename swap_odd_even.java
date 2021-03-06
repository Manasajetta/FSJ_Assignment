/*Given an unsigned integer N. The task is to swap all odd bits with even bits. For example, if the given number is 23 (00010111), it should be converted to 43(00101011). Here, every even position bit is swapped with adjacent bit on the right side(even position bits are highlighted in the binary representation of 23), and every odd position bit is swapped with an adjacent on the left side.

Example 1:

Input: N = 23
Output: 43
Explanation: 
Binary representation of the given number 
is 00010111 after swapping 
00101011 = 43 in decimal.*/

// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


class Solution
{
   public static int swapBits(int n) 
   {
    // Your code
    char temp;
    String s = Integer.toBinaryString(n)+"";
    if(s.length()%2 != 0)
    {
        s = 0 + s;
    }
    char arr[] = s.toCharArray();
    int k=arr.length/2;
    for(int i=0;i<k;i++){
        temp = arr[2*i];
        arr[2*i] = arr[(i*2)+1];
        arr[(2*i)+1] = temp;
    }
    s="";
    for(char c : arr){
        s+=c;
    }
    n = Integer.parseInt(s,2); 
    return n;
}
    
}
