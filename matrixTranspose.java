import java.util.*;
/*
1. In-place transpose is possible for a  square matrix only
2. For a rectangular matrix, create an empty array or an ArrayList to perform the transpose operation.
*/

// in-place transpose - 2D-Array
public class Main {
  public static void main(String[] args) {
    int[][] A =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    for(int row=0; row<A.length; row++) {
      for(int col=row; col<A[0].length; col++) {
        if(row==col) {continue;}
        int temp = A[row][col];
        A[row][col] = A[col][row];
        A[col][row] = temp;
      }
    }
    
    for(int row=0; row<A.length; row++) {
      for(int col=0; col<A[0].length; col++) {
        System.out.print(A[row][col]+" ");
      }
      System.out.println();
    } 
  }
}

// in-place transpose - 2D-ArrayList
public class Main {
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    A.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
    A.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
    A.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

    for(int row=0; row<A.size(); row++) {
      for(int col=row; col<A.get(0).size(); col++) {
        if(row==col) {continue;}
        int temp = A.get(row).get(col);
        A.get(row).set(col, A.get(col).get(row));
        A.get(col).set(row, temp);
      }
    }
    
    for(int row=0; row<A.size(); row++) {
      for(int col=0; col<A.get(0).size(); col++) {
        System.out.print(A.get(row).get(col)+" ");
      }
      System.out.println();
    } 
  }
}

// transpose using a new array/ArrayList
public class Main {
  public static void main(String[] args) {
    ArrayList<ArrayList<Integer>> A = new ArrayList<>();
    A.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
    A.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
    A.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    // column wise store the elements in a 1D matrix
    for(int col=0; col<A.get(0).size(); col++) {
      ArrayList<Integer> arr = new ArrayList<>();
      for(int row=0; row<A.size(); row++) {
        arr.add(A.get(row).get(col));
      }
      ans.add(arr);
    }
    
    for(int row=0; row<ans.size(); row++) {
      for(int col=0; col<ans.get(0).size(); col++) {
        System.out.print(ans.get(row).get(col)+" ");
      }
      System.out.println();
    } 
  }
}

// transpose a rectangular matrix
public class Main {
  public static void main(String[] args) {
    int[][] A = {{10, 20, 30}, {40, 50, 60}};
    int rows = A.length;
    int cols = A[0].length;
    
    int[][] transpose = new int[cols][rows];

    for(int c=0; c<cols; c++) {
      for(int r=0; r<rows; r++) {
        transpose[c][r] = A[r][c];
      }
    }

    for(int i=0; i<transpose.length; i++) {
      for(int j=0; j<transpose[0].length; j++) {
        System.out.print(transpose[i][j]+" ");
      }
      System.out.println();
    }
  }
}
