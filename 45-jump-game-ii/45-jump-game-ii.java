class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int currentEnd = 0, currentFarthest = 0;
        
        for(int i=0; i<nums.length-1; i++){
            currentFarthest = Math.max(currentFarthest, nums[i]+i);
            if(i==currentEnd){
                jumps++;
                currentEnd = currentFarthest;
            }
        }
        return jumps;
    }
}