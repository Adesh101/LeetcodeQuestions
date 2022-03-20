class Solution {
    public int countHillValley(int[] nums) {
        List<Integer> temp = new ArrayList<>();

        int hill = 0;
        temp.add(nums[0]);
        
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                continue;
            }
            temp.add(nums[i]);
        }
        
        for(int i=1; i<temp.size()-1; i++){
            if(temp.get(i-1)<temp.get(i) && temp.get(i)>temp.get(i+1)){
                hill++;
            }  
            if(temp.get(i-1)>temp.get(i) && temp.get(i)<temp.get(i+1)){
                hill++;
            }
         }
         return hill;
    }
}