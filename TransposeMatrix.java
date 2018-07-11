class TransposeMatrix{
   public int[][] transpose(int[][] A) {
      int rows = A.length;
      int cols = A[0].length;
      int[][] transposed = new int[cols][rows];
      for (int y = 0; y < rows; y++) {
         for (int x = 0; x < cols; x++) {
            transposed[x][y] = A[y][x];
         }
      }
      return transposed;
   }
}