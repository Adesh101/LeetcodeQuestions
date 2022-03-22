class Solution {
    public int findDuplicate(int[] arr) {
        int n = arr.length;
        int i = 0;
        
        while(i<n){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
        
        for(int j=0; j<n; j++){
            if(arr[j]-1!=j){
                return arr[j];
            }
        }
        return -1;
    }
}