public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int num1;
        int num2;
        int sum;
        int[] r = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                num1 = nums[i];
                num2 = nums[j];
                sum = num1 + num2;
                if (i!=j && sum==target){
                    r[0] = i;
                    r[1] = j;
                    return r;
                }
            }
        }
        return r;
    }
}
