class SingleNumber {
   public int singleNumber(int[] nums) {
      Set<Integer> numbers = new HashSet<>();
      int ans = 0;
      for (int n : nums) {
         numbers.add(n);
      }
      
      for (int num : numbers) {
         ans += 2*num;
      }
      
      for (int n : nums) {
         ans -= n;
      }
      
      return ans;
   }
}