class Solution {
    public int[] findErrorNums(int[] arr) {
        int n = arr.length;
        int i = 0;
        int[] newarr = new int[2];
        
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
                newarr[0] = arr[j];
                newarr[1] = j+1;
            }
        }
        return newarr;
    }
}