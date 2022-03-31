class Solution {
    public double average(int[] salary) {
        int minSalary = Integer.MAX_VALUE;
        int maxSalary = Integer.MIN_VALUE;
        double avgSalary = 0;
        
        for(int x:salary){
            if(x>maxSalary){
                maxSalary = x;
            }
            if(x<minSalary){
                minSalary = x;
            }
            avgSalary += x;
        }
        return ((avgSalary-minSalary-maxSalary)/(salary.length-2));
    }
}