class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums==null || nums.length<1){
            return 0;
        }
        
        Arrays.sort(nums);
        int max_count = 0, count = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]==nums[i])
                continue;
            if(nums[i-1]+1==nums[i]){
                count++;
                max_count = Math.max(max_count, count);
            }
            else{
                count = 0;
            }
        }
        return max_count+1;
    }
}