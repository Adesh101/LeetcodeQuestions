class Solution {
    public int maxProduct(int[] nums) {
        int firstMax = 0, secondMax = 0;
        int storeIdx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>firstMax){
                firstMax = nums[i];
                storeIdx = i;
            }
        }
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]>secondMax && i!=storeIdx){
                secondMax = nums[i];
            }
        }
        
        return (firstMax-1)*(secondMax-1);
    }
}