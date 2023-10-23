class Solution {

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int max = -1;

        int item = -1;
        Set<Integer> keys = map.keySet();
        System.out.print(map);
        for (int val : keys) {
            if (map.get(val) > max) {
                max = map.get(val);
                System.out.print(val);
                item = val;
            }
        }
        return item;
    }
}
