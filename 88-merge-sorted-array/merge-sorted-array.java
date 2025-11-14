class Solution {
    public void merge(int[] nums1, int n, int[] nums2, int m) {
        int p1 =0;
        int p2= 0;
        int p3= 0;
        int ans[] = new int[n+m];
        while(p1<n && p2<m){
            if(nums1[p1]<nums2[p2]){
                ans[p3] = nums1[p1];
                p1++;p3++;
            }else{
                ans[p3] = nums2[p2];
                p2++;p3++;
            }
        }
        while(p1<n){
            ans[p3] = nums1[p1];
            p1++;
            p3++;
        }
        while(p2<m){
            ans[p3] = nums2[p2];
            p3++;
            p2++;
        }
    for(int i=0;i<n+m;i++){
        nums1[i] = ans[i];
    }
    }
}