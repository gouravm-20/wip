// To be continued -- Solution incomplete
import java.util.*;
public class Main {

    public static ArrayList<Integer> checkPalindromeOdd(String A, int i) {
        int n = A.length();        
        ArrayList<Integer> ans = new ArrayList<>();
        int s=i, e=i;
        while((s>=0 && e<n) && (A.charAt(s)==A.charAt(e))) {
            s--; e++;
        }
        ans.add(s+1); ans.add(e-s-1);
        return ans;
    }

    public static ArrayList<Integer> checkPalindromeEven(String A, int i) {
        int n = A.length();
        ArrayList<Integer> ans = new ArrayList<>();
        int s=i, e=i+1;
        while((s>=0 && e<n) && (A.charAt(s)==A.charAt(e))) {
            s--; e++;
        }
        ans.add(s+1); ans.add(e-s-1);
        return ans;      
    }

    public static void main(String args[]) {
        String A = "madame"; //"adacbcdfdcbctggtc";
        int len = 0; int start = 0;
        ArrayList<ArrayList<Integer>> arrOdd = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> arrEven = new ArrayList<ArrayList<Integer>>();
        for(int s=0; s<A.length(); s++) {
          
          ArrayList<Integer> lenOdd = checkPalindromeOdd(A, s);
          ArrayList<Integer> lenEven = checkPalindromeEven(A, s);
          arrOdd.add(lenOdd); arrEven.add(lenEven);
          // len = Math.max(len, Math.max(lenEven, lenOdd));
        }

        for(ArrayList<Integer> a:arrOdd) {
          System.out.print(a+" ");
        }

        System.out.println();

        for(ArrayList<Integer> a:arrEven) {
          System.out.print(a+" ");
        }      
    }
}
