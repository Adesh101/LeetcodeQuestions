class Solution {
    public int[] getConcatenation(int[] nums){
        int size = nums.length*2;
        int[] temp = new int[size];
        int n = nums.length;
        
        for(int i=0; i<nums.length; i++){
            temp[i] = nums[i];
            temp[i+n] = nums[i];
        }   
        return temp;
    }
}