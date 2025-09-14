class Solution {
    public boolean halvesAreAlike(String s) {
          s = s.toLowerCase(); 
       int i=0;
       int j=s.length()-1;
       int vowels=0;
       int vow=0;
       String vowe="aeiou";
       while(i<j){
        if(vowe.indexOf(s.charAt(i))!=-1){
            vowels++;
        }
        if(vowe.indexOf(s.charAt(j))!=-1){
            vow++;
        }
        i++;
        j--;
       } 
        return vowels==vow;
    }
}