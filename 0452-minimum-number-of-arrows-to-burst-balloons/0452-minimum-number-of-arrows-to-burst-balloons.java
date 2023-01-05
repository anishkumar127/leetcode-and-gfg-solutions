class Solution {
    public int findMinArrowShots(int[][] points) {
        int count = 0;
        int min = 0;
        
        Arrays.sort(points , (a,b)-> Integer.compare(a[1],b[1]));
        
        
        for(int i=0; i<points.length; i++){
            if(count==0 || min<points[i][0]){
                count++;
                min = points[i][1];
            }
        }
        
        return count;
    }
}