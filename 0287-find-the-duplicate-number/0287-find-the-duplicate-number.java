class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int val:nums){
            if(set.contains(val)){
                return val;
            }
        set.add(val);
        }
        return -1;
    }
}