class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        int n = nums.length;
        HashMap<Integer,Integer>map  = new HashMap<>();
        
        for(int i =0; i<n; i++){
            int num = nums[i];
            if(map.containsKey(num)){
                int diff = Math.abs(map.get(num) - i);
                // System.out.print(diff);
                if(diff<=k){
                    return true;
                }
            }
            map.put(num,i);
        }
        return false;
    }
}