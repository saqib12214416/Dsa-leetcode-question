class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] a=s.toCharArray();
        int max=0;
        for(int i=0;i<a.length;i++){
            HashSet<Character> h=new HashSet<>();
            for(int j=i;j<a.length;j++){
                if(h.contains(a[j])){
                    break;
                }
                else{
                   h.add(a[j]); 
                }
                max=Math.max(max,j-i+1);
            }
        }
        return max;
    }
}