public class squareMatrixTranspose {
  public int[][] transpose(int[][] A) {
    for(int row=0; row<A.length; row++) {
      for(int col=row; col<A[0].length; col++) {
        int temp = A[row][col];
        A[row][col] = A[col][row];
        A[col][row] = temp;
      }
    }
  } 
}
