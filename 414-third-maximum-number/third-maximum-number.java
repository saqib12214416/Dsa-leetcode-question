class Solution {
    public int thirdMax(int[] nums) {
        PriorityQueue<Integer> p=new PriorityQueue<>();
        HashSet<Integer> seen=new HashSet<>();        
         for (int num : nums){
            if (seen.add(num)){ 
                p.add(num);
                if (p.size()>3){
                    p.poll();      
                }
            }
        } 
        if(p.size()<3){
            while(p.size()>1){
                p.poll();
            }
        }
        return p.peek();
    }
}
