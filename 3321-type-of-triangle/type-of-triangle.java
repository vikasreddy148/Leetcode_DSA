class Solution {
    public String triangleType(int[] nums) {
         
        int a = nums[0];
        int b = nums[1];
        int c = nums[2];
        boolean s1 = (a+b > c) ;
        boolean s2 = (a+c > b) ; 
        boolean s3 = (b+c > a) ; 
        if(s1 && s2 && s3){
            if(nums[0]==nums[1] && nums[1]==nums[2]){
            return "equilateral";
        
        }else if(a==b || b==c || a==c){
            return "isosceles";
        }else{
            return "scalene";
        }

        }

        return "none";
        
    }
}