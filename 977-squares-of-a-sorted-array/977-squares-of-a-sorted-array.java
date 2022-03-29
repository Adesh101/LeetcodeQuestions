class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        
        int[] arr = new int[nums.length];
        
        for(int idx=nums.length-1; idx>=0; idx--){
            if(Math.abs(nums[start])>Math.abs(nums[end])){
                arr[idx] = nums[start]*nums[start];
                start++;
            }
            else{
                arr[idx] = nums[end]*nums[end];
                end--;
            }
        }
        return arr;
    }
}