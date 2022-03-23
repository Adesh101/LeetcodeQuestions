class Solution {
    public int firstMissingPositive(int[] nums) {
         int nums_len = nums.length;
        int idx = 0;

        while(idx<nums_len){
            int index_num = nums[idx] - 1;
            if(nums[idx]>0 && nums[idx]<=nums_len && nums[idx]!=nums[index_num]){
                int temp = nums[index_num];
                nums[index_num] = nums[idx];
                nums[idx] = temp;
            }
            else{
                idx++;
            }
        }

        for(int j=0; j<nums_len; j++){
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return idx+1;
    }
}