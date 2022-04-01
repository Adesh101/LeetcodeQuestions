class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int arr_len = arr.length;
        int idx = 0;
        int tempDifference = arr[1]-arr[0];
        while(idx<arr_len-1){
            if((arr[idx+1]-arr[idx])!=tempDifference){
                return false;
            }
            idx++;
        }
    return true;
    }
}