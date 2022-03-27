class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        int temp = 0;
        for(int i=0; i<nums.length-1; ){
            sum += nums[i];
            i+=2;
        }
        return sum;
    }
}