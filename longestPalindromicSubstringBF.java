@ -1,43 +0,0 @@
/*
Problem Statement:
Given a string A, calculate the length of the longest palindromic substring.
-- This code solves the problem using the Brute force method
-- Time Complexity: 
      for 1 substring - O(N)
      for N^2 substrings (worst case) - O(N^2)
-- Space complexity - O(1)      
*/
import java.util.*;

public class Main {
  public static boolean checkPalindrome(String A, int i, int j) {
    int s=i, e=j;
    int n=A.length();
    while(s<e) {
      if(A.charAt(s)==A.charAt(e)) {
        s++;
        e--;
      }
      else return false; 
    }
    return true;
  }

  public static void main(String[] args) {
    String A = "anamadamspc";
    int len = 0;
    int[] arr = new int[2];

    // need to define the starting and ending point of the substring
    for(int s=0; s<A.length(); s++) {
      //set the ending point
      for(int e=s; e<A.length(); e++) {
        // for the substring with start=s and end=e check if the substring is checkPalindrome
        if(checkPalindrome(A, s, e)==true) {
          len = Math.max(len, e-s+1);
        }
      }
    }
    System.out.println(len);
  }
}