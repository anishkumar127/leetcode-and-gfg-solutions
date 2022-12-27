class Solution {
    public int repeatedNTimes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int value:nums){
            if(list.contains(value)) return value;
            else list.add(value);
        }
        return -1;
    }
}