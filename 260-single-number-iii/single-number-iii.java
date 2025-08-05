class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for(int i=0;i<n;i++){
            xor = xor ^ nums[i];
        }
        int set = 0;
        int unset = 0;
        int p = 0;
        for(int i = 0;i<32;i++){
            int bit = (xor>>i)&1;
            if(bit == 1){
                p = i;
                break;
            }
        }
        for(int i=0;i<n;i++){
            int bit = (nums[i]>>p)&1;
            if(bit == 1){
                set = set^nums[i];
            }else{
                unset = unset ^ nums[i];
            }
        }
        return new int[] {set,unset};
    }
}