class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length())return false;
        int[] alphabets=new int[26];
        for(char c: magazine.toCharArray()){
            alphabets[c-'a']++;
        }
        for(char c: ransomNote.toCharArray()){
            if(alphabets[c-'a']==0)return false;
            alphabets[c-'a']--;
        }
        return true;
    }
}