class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int first_element = 0, count_first_ele = 0;
        int second_element = 0, count_second_ele = 0;
        for(int element: nums){
            if(element == first_element)
                count_first_ele++;
            else if(element == second_element){
                count_second_ele++;
            }
            else if(count_first_ele == 0){
                count_first_ele++;
                first_element = element;
            }
            else if(count_second_ele == 0){
                count_second_ele++;
                second_element = element;
            }
            else{
                count_first_ele--;
                count_second_ele--;
            }
        }
        
        count_first_ele = 0;
        count_second_ele = 0;
        
        for(int idx=0; idx<nums.length; idx++){
            if(nums[idx]==first_element){
                count_first_ele++;
            }    
            else if(nums[idx]==second_element){
                count_second_ele++;
            }    
        }
        
        if(count_first_ele > (nums.length/3)){
            list.add(first_element);
        }
        
        if(count_second_ele > (nums.length/3)){
            list.add(second_element);
        }

        return list;
    }
}