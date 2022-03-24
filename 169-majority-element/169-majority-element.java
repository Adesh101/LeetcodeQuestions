class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int n = nums.length;
        int major = nums[0];
        
        for(int i=1; i<n; i++){
            if(count==0){
                count++;
                major = nums[i];
            }
            
            else if(major==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return major;
    }
}