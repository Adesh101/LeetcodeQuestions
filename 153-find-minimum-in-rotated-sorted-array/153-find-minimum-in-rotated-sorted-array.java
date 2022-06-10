class Solution {
    public int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        if(nums.length==1){
            return nums[0];
        }
        
        while(start<=end){
            int m = start + (end-start)/2;
            
            if(m<end && nums[m]>nums[m+1]){
                return nums[m+1];
            }
            
            if(m>start && nums[m]<nums[m-1]){
                return nums[m];
            }
            
            if(nums[start]>=nums[m]){
                end = m-1;
            }
            else{
                start = m+1;
            }
        }
        return nums[0];
    }
}