public class ReshapeMatrix {
   public int[][] matrixReshape(int[][] nums, int r, int c) {
      int[][] ans = new int[r][c];
      if (r * c != nums.length * nums[0].length)
         return nums;
      int count = 0;
      for (int i = 0; i < nums.length; i++) {
         for (int j = 0; j < nums[0].length; j++) {
            ans[count / c][count % c] = nums[i][j];
            count++;
         }
      }
      return ans;
   }
}