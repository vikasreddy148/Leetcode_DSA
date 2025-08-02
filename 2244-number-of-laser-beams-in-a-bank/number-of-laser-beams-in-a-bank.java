class Solution {
    public int numberOfBeams(String[] bank) {
        int n = bank.length;
        int m = bank[0].length();
        int beams[] = new int[n];
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<m;j++){
                char ch = bank[i].charAt(j);
                if(ch == '1') count++;
            }
            beams[i] = count;
        }
        int ans = 0;
        for(int i=0;i<beams.length;i++){
            if(beams[i]>0){
                for(int k=i+1;k<beams.length;k++){
                    if(beams[k]>0){
                        ans = ans + beams[i]*beams[k];
                        break;
                    }
                }
            }
        }
        return ans;
    }
}