class Solution {

    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int num : nums) {
            if (set.contains(num)) {
                arr.add(num);
            } else {
                set.add(num);
            }
        }
        return arr;
    }
}
