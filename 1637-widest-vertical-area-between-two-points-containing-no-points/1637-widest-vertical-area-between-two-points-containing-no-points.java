class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int ans = 0;
        
        int[] arr = new int[points.length];
        
        for(int i=0; i<points.length; i++){
            arr[i] = points[i][0];
        }
        
        Arrays.sort(arr);
        
        for(int i=1; i<arr.length; i++){
            ans = Math.max(ans,arr[i]-arr[i-1]);
        }
        
        return ans;
    }
}