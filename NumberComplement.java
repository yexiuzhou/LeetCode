class NumberComplement {
   public int findComplement(int num) {
      if(num == 1){
         return 0;
      }
      int pow = 1;
      int numTemp = num;
      while(num!=0){
         pow *= 2;
         num = num/2;
      }
      return pow - numTemp - 1;
   }
}