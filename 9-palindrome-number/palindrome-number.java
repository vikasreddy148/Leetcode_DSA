class Solution {
    public int reversedNum(int x){
        int reversed = 0;
        while(x != 0){
            int digit = x%10;
            reversed = reversed * 10 + digit;
            x/=10;
        }
        return reversed;
    }
    public boolean isPalindrome(int x) {
       if(x<0) return false;
        int reversed = reversedNum(x);
        System.out.println(reversed);
        if(reversed == x){
            return true;
        }else{
            return false;
        }
    }
}