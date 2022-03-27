class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int temp = 0;
        int n = nums.length-1;
        int[] nums2 = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2!=0){
                nums2[n--] = nums[i];
            }
            else{
                nums2[temp] = nums[i];
                temp++;
            }
        }
        return nums2;
    }
}