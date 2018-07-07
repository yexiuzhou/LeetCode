class ShortestDistanceToACharacter {
   public int[] shortestToChar(String S, char C) {
      int length = S.length();
      int[] ans = new int[length];
      
      int prev = Integer.MIN_VALUE/2;
      for (int i = 0; i < length; ++i) {
         if (S.charAt(i) == C) {
            prev = i;
         }
         ans[i] = i - prev;
      }
      
      prev = Integer.MAX_VALUE/2;
      for (int i = length-1; i >= 0; --i) {
         if (S.charAt(i) == C) {
            prev = i;
         }
         ans[i] = Math.min(ans[i], prev - i);
      }
      
      return ans;
   }
}