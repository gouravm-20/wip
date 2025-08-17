public class Solution {
    public int[][] diagonal(int[][] A) {
        int N=A.length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int[][] result = new int[2*N-1][N];
        int row = 0;
        for(int col=0; col<N; col++) {
            ArrayList<Integer> anti = new ArrayList<>();
            int r=row, c=col;
            while(r<N && c>=0) {
                anti.add(A[r][c]);
                r++; c--;
            }
            ans.add(anti);
        }

        int col = N-1;
        for(int r=1; r<N; r++) {
            int a=r, c=col;
            ArrayList<Integer> anti = new ArrayList<>();
            while(a<N && c>=0) {
                anti.add(A[a][c]);
                a++; c--;
            }
            ans.add(anti);
        }

        for(int i=0; i<2*N-1; i++) {
            for(int j=0; j<ans.get(i).size(); j++) {
                result[i][j] = ans.get(i).get(j);
            }
        }
        return result;
    }
}

/*
public class Main {
  public static void printAntiDiagonal(int i, int j, int[][] A) {
    int r=i, c=j;
    int N = A.length;
    int M = A[0].length;
    while(r<N && c>=0) {
      System.out.print(A[r][c]);
      r++; c--;
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
    int N = arr.length, M = arr[0].length;
    
    // consider row = 0 as the starting point and print all the anti-diagonal elements
    int r=0;
    for(int c=0; c<M; c++) {
      int row = r, col = c;
      while(row<N && col>=0) {
        System.out.print(arr[row][col]+" ");
        row++; col--;
      }
      System.out.println();
    }

    int c=M-1;
    for(int a=1; a<N; a++) {
      int row = a, col = c;
      while(row<N && col>=0) {
        System.out.print(arr[row][col]+" ");
        row++; col--;
      }
      System.out.println();
    }
    */
  }
}
