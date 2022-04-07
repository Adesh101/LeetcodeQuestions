class Solution {
    public void sortColors(int[] nums) {
        int countZeroes = 0;
        int countOnes = 0;
        int countTwos = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                countZeroes++;
            }
            else if(nums[i]==1){
                countOnes++;
            }
            else{
                countTwos++;
            }
        }
        
        int temp = 0;
        
        while(countZeroes>0){
            nums[temp] = 0;
            temp++;
            countZeroes--;
        }
        
        while(countOnes>0){
            nums[temp] = 1;
            temp++;
            countOnes--;
        }
        
        while(countTwos>0){
            nums[temp] = 2;
            temp++;
            countTwos--;
        }
    }
}