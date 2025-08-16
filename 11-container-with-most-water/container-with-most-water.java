class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int ans=Integer.MIN_VALUE;
        while(i<j){
            int curr=Math.min(height[i],height[j]);
            int area=curr*(j-i);
            ans=Math.max(ans,area);
            if(height[i]<height[j])i++;
            else j--;
        }
        return ans;
    }
}