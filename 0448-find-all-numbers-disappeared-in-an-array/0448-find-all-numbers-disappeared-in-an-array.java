class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 1; i <= nums.length; i++) {
            // System.out.print(map.get(i)+" ");
            if (map.get(i) == null) {
                arr.add(i);
            }
        }
        return arr;
    }
}
