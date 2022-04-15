class Solution {
    public int[] rearrangeArray(int[] nums) {
        int neg_count = 0, pos_count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<0){
                neg_count++;
            }
            else{
                pos_count++;
            }
        }
        
        int[] negArray = new int[neg_count];
        int[] posArray = new int[pos_count];
        
        int neg_temp = 0, pos_temp = 0, temp1 = 0, temp2 = 0;
        
        for(int j=0; j<nums.length; j++){
            if(nums[j]<0){
                negArray[neg_temp] = nums[j];
                neg_temp++;
            }
            else{
                posArray[pos_temp] = nums[j];
                pos_temp++;
            }
        }
        
        for(int i=0; i<nums.length; i++){
            if(i%2==0){
                nums[i] = posArray[temp1];
                temp1++;
            }
            else{
                nums[i] = negArray[temp2];
                temp2++;
            }
        }
        return nums;
    }
}