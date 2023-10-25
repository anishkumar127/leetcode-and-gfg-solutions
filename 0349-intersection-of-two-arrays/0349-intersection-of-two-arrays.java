class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();

        for (int val : nums1) {
            s1.add(val);
        }

        for (int val : nums2) {
            s2.add(val);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int val : s2) {
            if (s1.contains(val)) {
                ans.add(val);
            } else s1.add(val);
        }
        int arr[] = new int[ans.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}
