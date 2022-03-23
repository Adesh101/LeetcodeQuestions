class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int n = arr.length;
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        
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
                ans.add(arr[j]);
            }
        }
        return ans;
    }
}