class NumJewelsInStones2 {
   public int numJewelsInStones(String J, String S) {
      int[] i = new int[128];
      int ans = 0;
      for (final char c : J.toCharArray()) {
         i[c] = 1;
      }
      for (final char c : S.toCharArray()) {
         ans += i[c];
      }
      return ans;
   }
}
