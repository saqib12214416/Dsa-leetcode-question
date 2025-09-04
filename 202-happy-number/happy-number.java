class Solution {
     public boolean isHappy(int n) {
         Set<Integer> s=new HashSet<>();
         while(n!=1){
            if(s.contains(n))return false;
            s.add(n);
            n=calSquare(n);
         }
         return true;
     }
     int calSquare(int n){
        int sum=0;
         while(n!=0){
             int rem=n%10;
             sum+=rem*rem;
             n=n/10;
         }
         return sum;
     }
 }