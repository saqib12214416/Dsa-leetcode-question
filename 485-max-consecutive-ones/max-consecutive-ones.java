class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int l=0;
        int r=0;
        int ans=-1;
        int window=0;
        int n=nums.length;
        while(r<n){
            window+=nums[r];
            while(r-l+1!=window){
                window-=nums[l];
                l++;
            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}