class ArrayPairSum {
   public int arrayPairSum(int[] nums) {
      int sum = 0;
      Arrays.sort(nums);
      for (int i = 0; i<nums.length-1; i+=2) {
         sum += nums[i];
      }
      return sum;
   }
}