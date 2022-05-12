class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int end = nums.length;
        for(int i=0; i<end-2; i++){
            if(i>0 && nums[i]==nums[i-1])
                continue;
            
            int left = i+1;
            int right = end-1;
            
            while(left<right){
                int threesum = nums[i] + nums[left] + nums[right];
            
                if(threesum>0)
                    right--;
                
                else if(threesum<0)
                    left++;
                
                else{
                    list.add(new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right])));
                    left++;
                    
                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }
                }
            }
        }
        return list;
    }
}