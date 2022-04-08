class Solution {
    public int smallestRangeII(int[] arr, int k) {
        
        Arrays.sort(arr);
        
        int start = 0;
        int end = arr.length-1;
        
        int res = arr[arr.length - 1] - arr[0];
        
        int left = arr[0] + k;
        int right = arr[end] - k;
        
        for(int i=0; i<end; i++){
            int maxi = Math.max(arr[i]+k, right); 
            int mini = Math.min(arr[i+1]-k, left);
            
            res = Math.min(res, maxi-mini);
        }
        
        return res;
    }
}