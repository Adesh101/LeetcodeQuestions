class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
          int n = arr.length;
        int i = 0;
        while(i<n){
            if(arr[i]!=arr[arr[i]-1]){
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }
            else{
                i++;
            }
        }
        List<Integer> temp = new ArrayList<>();
        for (int j=0; j<arr.length; j++){
            if(arr[j]-1!=j){
                temp.add(j+1);
            }
        }
        return temp;
    }
}