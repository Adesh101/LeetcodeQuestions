class Solution {
    public int findMinArrowShots(int[][] points) {
        
        if(points.length<=1){
            return 1;
        }
        
        Arrays.sort(points, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
        
        int[] current_interval = points[0];
        List<int[]> list = new ArrayList<>();
        list.add(current_interval);
        
        for(int[] point: points){
            int current_point = current_interval[0];
            int current_point_end = current_interval[1];
            int next_point = point[0];
            int next_point_end = point[1];
            
            if(current_point_end>=next_point){
                current_interval[1] = Math.min(current_point_end, next_point_end);
            }else{
                current_interval = point;
                list.add(current_interval);
            }
        }
        return list.size();
    }
}