class Solution {
    public int[] rearrangeArray(int[] nums) {
        
        int[] ans = new int[nums.length];
        int neg_idx = 1, pos_idx = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                ans[neg_idx] = nums[i];
                neg_idx+=2;
            }
            else{
                ans[pos_idx] = nums[i];
                pos_idx+=2;
            }
        }
        return ans;
    }
}