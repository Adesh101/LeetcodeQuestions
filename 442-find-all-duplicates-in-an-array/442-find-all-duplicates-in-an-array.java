class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        int n = arr.length;
        int i = 0;
        Set<Integer> a = new HashSet<>();
        
        while(i<n){
            int correct = arr[i]-1;         
            if(arr[i]!=arr[correct]){
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            }
            else{
                if(correct!=i && arr[correct]==arr[i]){
                        a.add(arr[i]);
                    }
                i++;
            }
        }   
        return new ArrayList<Integer>(a);
    }
}