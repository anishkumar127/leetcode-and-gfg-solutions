class Solution {
    public int[] sortArray(int[] nums) {
        int output[] = new int [nums.length];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i=0;
        for(int num:nums){
            pq.offer(num);
        }
        while(!pq.isEmpty()){
            output[i++] = pq.poll();
        }
        
        return output;
    }
}