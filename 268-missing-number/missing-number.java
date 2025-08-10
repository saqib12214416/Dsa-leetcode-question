class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Set<Integer> s=new HashSet<>();
        for(int num:nums){
            s.add(num);
        }
        for(int i=0;i<=n;i++){
            if(!s.contains(i))return i;
        }
        return -1;
    }
}