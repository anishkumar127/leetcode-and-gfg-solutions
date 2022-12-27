class Solution {
    public int[] twoSum(int[] num, int target) {
        int start =0;
        int end =num.length-1;
        while(start<=end){
            int sum = num[start]+num[end];
            if(sum==target) return new int[] {start+1, end+1};
            else if(sum<target) start++;
            else end--;
        }
        return new int[]{};
    }
}