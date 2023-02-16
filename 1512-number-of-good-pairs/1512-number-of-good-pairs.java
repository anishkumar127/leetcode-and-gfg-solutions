class Solution {
    public int numIdenticalPairs(int[] nums) {
     HashMap<Integer,Integer> map = new HashMap<>();
        int count =0;
        for(int e :nums){
            if(!map.containsKey(e)){
                map.put(e,1);
            }else{
                count+=map.get(e);
                map.put(e,map.getOrDefault(e,0)+1);
            }
        }
        return count;
    }
}