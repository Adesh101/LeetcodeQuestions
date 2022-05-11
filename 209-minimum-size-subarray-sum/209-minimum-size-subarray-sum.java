class Solution {
    public int minSubArrayLen(int k, int[] arr) {
        int windowSum = 0, windowStart = 0, minWindow = Integer.MAX_VALUE;
        for(int idx=0; idx<arr.length; idx++){
            if(arr[idx]>=k)
                return 1;

            windowSum += arr[idx];
            while(windowSum>=k){
                minWindow = Math.min(minWindow, (idx-windowStart)+1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        
        if(minWindow == Integer.MAX_VALUE)
            return 0;
        
        return minWindow;
    }
}