class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int tempMin = 0, absMin = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>(); 
        for(int i=0; i<arr.length-1; i++){
            tempMin = arr[i+1] - arr[i];
            absMin = Math.min(absMin, tempMin);
        }
        for(int i=0; i<arr.length-1; i++){
            if(arr[i+1]-arr[i]==absMin){
                ans.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        return ans;
    }
}