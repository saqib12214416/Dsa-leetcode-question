class Solution {
    public int mySqrt(int x) {
        if(x==0||x==1)return x;
        int l=1;
        int r=x;
        while(l<=r){
          int m=l+(r-l)/2;
          long m2=(long)m*m;
            if(m2==x)return m;
            else if(m2<x)l=m+1;
            else r=m-1;
        }
        return Math.round(r);
    }
}