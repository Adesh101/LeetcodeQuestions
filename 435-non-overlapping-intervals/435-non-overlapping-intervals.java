class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length<=1){
            return 0;
        }
        
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        
        int[] current_interval = intervals[0];
        List<int[]> list = new ArrayList<>();
        list.add(current_interval);
        int count = 0;
        
        for(int[] interval:intervals){
            int current_begin = current_interval[0];
            int current_end = current_interval[1];
            int next_begin = interval[0];
            int next_end = interval[1];
            
            if(current_end>next_begin){
                current_interval[1] = Math.min(current_end, next_end);
            }
            else{
                current_interval = interval;
                list.add(current_interval);
            }
        }
        return (intervals.length-list.size());
    }
}