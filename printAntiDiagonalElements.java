import java.util.*;
public class Main {
  public static void main(String[] args) {
    int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
    ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
    int N=arr.length;
    int M=arr[0].length

    // for a square matrix
    if(N==M) {
      int row=0, col=M-1;
      while(row<N) {
        System.out.print(arr[row][col]+" ");
        row++;
        col--;
      }
    }
    // for a non-square matrix
    else {
      int row = 0;
      for(int col=0; col<M; col++) {
        ArrayList<Integer> anti = new ArrayList<>();
        int c=col, r=row;
        while(r<N && c>=0) {
          anti.add(arr[r][c]);
          System.out.print(arr[r][c]+" ");
          r++; c--;
        }
        System.out.println();
        ans.add(anti);
      }
      
      int col=M-1;
      for(int i=1; i<N; i++) {
        ArrayList<Integer> anti = new ArrayList<>();
        int r=i, c=col;
        while(r<N && c>=0) {
          anti.add(arr[r][c]);
          System.out.print(arr[r][c]+" ");
          r++; c--;
        }
        ans.add(anti);
        System.out.println();
      }
    }
    System.out.println();
    System.out.println(ans.get(4).size());
  }
}
