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
​
```Ts
function countNegatives(grid: number[][]): number {
const arr: number[] = grid.flat();
​
const count: number = arr.reduce((curr: number, next: number) => {
if (next < 0) {
return curr + 1;
} else {
return curr;
}
}, 0);
return count;
}
​
​
```