class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums==null || nums.length<1){
            return 0;
        }
        
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        
        int longestStreak = 0;
        
        for(int num: set){
            if(!set.contains(num-1)){
                int currentNumber = num;
                int currentStreak = 1;
                
                while(set.contains(currentNumber+1)){
                    currentNumber++;
                    currentStreak++;
                }
                
                longestStreak = Math.max(currentStreak, longestStreak);
            }
        }
    return longestStreak;
    }
}