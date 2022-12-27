class Solution {
    public int[] buildArray(int[] nums) {
        int ans[] = new int[nums.length];
        int n = nums.length;
        
        int idx=0;
        for(int i=0; i<n; i++){
            ans[idx++] = nums[nums[i]];
        }
        return ans;
    }
}

/*
in this question what we are doing.
so basically we are doing.

ans result variable.
in result variable what we are putting.

nums[i] but that is a catch. we putting nums[nums[i]];
so there.
n i is 0 so 0 index. value
i is 1 so n[n[i]] will be. 1 index value is 2. and 2 index value is 1. so its add 1 value.
now. next i is 2. so n[n[i]] i is 2. so index 2 is. 1. and [n[i]]  1 index will be. 2;

so we just need to do what mention into the quetsion.
*/