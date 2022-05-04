class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int localHeight = 0, globalHeight = 0;
        
        while(start<end){
            localHeight = Math.min(height[start], height[end]);
            localHeight = localHeight*(end-start);
            globalHeight = Math.max(globalHeight, localHeight);
            
            if(height[start]>height[end]){
                end--;    
            }
            else{
                start++;
            }
        }
    return globalHeight;
    }
}