**brute force**
​
```
class Solution {
public int countNegatives(int[][] grid) {
int count =0;
int m = grid.length;
int n = grid[0].length;
​
for(int i=0; i<m; i++){
for(int j=0; j<n; j++){
if(grid[i][j]<0){
count++;
}
}
}
return count;
}
}
```