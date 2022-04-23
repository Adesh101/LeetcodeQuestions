class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        ArrayList<List<Integer>> result = new ArrayList<>();
        
        if (nums == null || nums.length == 0)
            return result;
        
        int n = nums.length;
        
        Arrays.sort(nums);
        
        for(int i=0; i<n; i++){
            
            int target_3 = target - nums[i];
            
            for(int j=i+1; j<n; j++){
            
                int target_2 = target_3 - nums[j];
                
                int front = j + 1;
                int back = n - 1;
                
                while(front<back){
                    int two_sum = nums[front] + nums[back];
                    
                    if(two_sum<target_2)
                        front++;
                    
                    else if(two_sum>target_2)
                        back--;
                    
                    else{
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[front]);
                        list.add(nums[back]);
                        result.add(list);
                        
                        while(front<back && nums[front]==list.get(2)) ++front;
                        
                        while(front<back && nums[back]==list.get(3)) --back;
                    }
                }
                while(j+1<n && nums[j+1]==nums[j]) ++j;
            }
            while(i+1<n && nums[i+1]==nums[i])
                ++i;
        }
        return result;
    }
}