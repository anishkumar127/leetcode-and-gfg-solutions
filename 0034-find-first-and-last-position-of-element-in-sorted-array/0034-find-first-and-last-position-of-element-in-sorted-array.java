class Solution {

    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];

        int s = findFirst(0, nums.length - 1, nums, target);
        int e = findSecond(0, nums.length - 1, nums, target);
        arr[0] = s;
        arr[1] = e;
        return arr;
    }

    public static int findFirst(int s, int e, int[] nums, int t) {
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == t) {
                ans = mid;
                e = mid-1;
            } else if (nums[mid] > t) e = mid - 1; else s = mid + 1;
        }
        return ans;
    }

    public static int findSecond(int s, int e, int[] nums, int t) {
        int ans = -1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (nums[mid] == t) {
                ans = mid;
                s = mid+1;
            }
                else if (nums[mid] > t) e = mid -1 ; else s = mid + 1;
        }
        return ans;
    }
}
