/*
checkPalindromOdd will calculate the max length for odd-length substrings.
checkPalindromeEven will calculate the max length for even-length substrings.
In the main function, for the same starting point:
 - Get the length of the odd-length palindromic substring
 - Get the length of the even-length palindromic substring
 - Return the maximum of the above two.
*/

import java.util.*;

public class Main {

    public static int checkPalindromeOdd(String A, int i) {
        int n = A.length();        
        int s=i, e=i;
        while((s>=0 && e<n) && (A.charAt(s)==A.charAt(e))) {
            s--; e++;
        }
        return e-s-1;
    }

    public static int checkPalindromeEven(String A, int i) {
        int n = A.length();
        int s=i, e=i+1;
        while((s>=0 && e<n) && (A.charAt(s)==A.charAt(e))) {
            s--; e++;
        }
        return e-s-1;      
    }

    public static void main(String args[]) {
        String A = "adacbcdfdcbctggtc";
        int len = 0;
        for(int s=0; s<A.length(); s++) {
          int lenOdd = checkPalindromeOdd(A, s);
          int lenEven = checkPalindromeEven(A, s);
          len = Math.max(len, Math.max(lenEven, lenOdd));
        }
        System.out.println(len);        
    }
}
