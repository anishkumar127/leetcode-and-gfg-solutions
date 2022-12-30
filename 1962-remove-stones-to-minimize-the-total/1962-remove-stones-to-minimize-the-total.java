class Solution {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int sum=0;
        int n = piles.length;
        for(int i=0; i<n; i++){
            pq.add(piles[i]);
        }
        while(k-->0){
            int val = pq.remove();
            int newval =(int) Math.ceil((val*1.0)/2);
            // System.out.print("val "+val+"newval "+newval+" ");
            pq.add(newval);
        }
        while(pq.size()>0){
            sum+=pq.remove();
        }
        return sum;
    }
}