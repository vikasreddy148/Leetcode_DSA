class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<Integer> primes = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        int arr[] = new int[n+1];
        arr[1] = 1;
        arr[0] = 1;
        for(int i = 2;i<=n;i++){
            if(arr[i]==0){
               for(int j=2; j*i<=n;j++){
                arr[i*j]=1;
               } 
            }
        }
        for (int i = 2; i <= n / 2; ++i) {
            if (arr[i] == 0 && arr[n - i] == 0) {
                ans.add(Arrays.asList(i, n - i));
            }
        }
        return ans; 
    }
}