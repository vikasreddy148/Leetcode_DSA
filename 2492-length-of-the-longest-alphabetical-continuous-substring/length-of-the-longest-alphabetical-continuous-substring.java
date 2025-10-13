class Solution {
    public int longestContinuousSubstring(String s) {
        int n = s.length();
        int maxLen = 1,currLen = 1;
        for(int i=1;i<n;i++){
            
            if(s.charAt(i) == s.charAt(i-1)+1){
                currLen++;
                maxLen = Math.max(currLen,maxLen);
            }else{
                currLen = 1;
            }

        }
        return maxLen;
        
    }
}