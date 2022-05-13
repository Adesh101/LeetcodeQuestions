class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int start = 0, end = nums.length, temp_product = 1, subarrays = 0;
        if(k<=1)
            return 0;
        for(int current=0; current<end; current++){
            temp_product = temp_product*nums[current];
            while(temp_product>=k)
                temp_product /= nums[start++];
            subarrays += current - start + 1;
        }
        return subarrays;
    }
}