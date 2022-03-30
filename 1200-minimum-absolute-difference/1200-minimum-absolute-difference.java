class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int tempMin = 0, absMin = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>(); 
        for(int i=0; i<arr.length-1; i++){
            tempMin = arr[i+1] - arr[i];
            if(tempMin<absMin){
                absMin = tempMin;
                ans.clear();
                ans.add(Arrays.asList(arr[i], arr[i+1]));
            }
            else if(tempMin==absMin){
                ans.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return ans;
    }
}