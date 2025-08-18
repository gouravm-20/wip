
import java.util.*;
public class Main {
  public static void main(String[] args) {
    int[] arr = {0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0};
    int ans = Integer.MIN_VALUE;

    // Using a while-loop
    for(int i=0; i<arr.length; i++) {
      if(arr[i]==0) {
        int cntLeft=0; int j=i-1;
        while(j>=0 && arr[j]==1) {
          cntLeft++; j--;
        }

        int cntRight=0; int k=i+1;
        while(k<arr.length && arr[k]==1) {
          cntRight++; k++;
        }
        ans = Math.max(ans, cntLeft+cntRight+1);
      }
    }
    System.out.print(ans);

    // Using a for-loop
    for(int i=0; i<arr.length; i++) {
      if(arr[i]==0) {
        int cntLeft = 0;
        for(int j=i-1; j>=0; j--) {
          if(arr[j]==1) {cntLeft++;}
          else break;
        }

        int cntRight = 0;
        for(int k=i+1; k<arr.length; k++) {
          if(arr[k]==1) {cntRight++;}
          else break;
        }
        ans = Math.max(ans, cntLeft+cntRight+1);
      }
    }
    System.out.print(ans);
  }
}
