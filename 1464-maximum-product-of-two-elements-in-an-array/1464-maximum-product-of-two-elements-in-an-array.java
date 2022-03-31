class Solution {
    public int maxProduct(int[] nums) {
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        
        for(int num:nums){
            if(num>firstMax){
                secondMax = firstMax;
                firstMax = num;
            }
            else if(num>secondMax){
                secondMax = num;
            }
        }
        
        for(int num:nums){
            if(num<firstMin){
                secondMin = firstMin;
                firstMin = num;
            }
            else if(num<secondMin){
                secondMin = num;
            }
        }
        return Math.max((firstMin-1)*(secondMin-1),(firstMax-1)*(secondMax-1));
    }
}