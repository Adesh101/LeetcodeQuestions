class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int threesum = 0;
        int closest = 0;
        int gap = Integer.MAX_VALUE;
        int end = nums.length;
        for(int i=0; i<end-2; i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            
            int left = i+1;
            int right = end-1;
            
            while(left<right){
                threesum = nums[i] + nums[left] + nums[right];
                
                if(Math.abs(target-threesum)<gap){
                    gap = Math.abs(target-threesum);
                    closest = threesum;
                }
                
                if(threesum>target)
                    right--;
                else
                    left++;
                }
            }
        return closest;
    }
}