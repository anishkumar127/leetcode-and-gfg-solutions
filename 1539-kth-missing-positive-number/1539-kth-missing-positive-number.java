class Solution {
    public int findKthPositive(int[] arr, int k) {
        Map<Integer,Boolean> map = new HashMap<>();

        for(int val:arr){
            map.putIfAbsent(val,true);
        }
        int count =0;
        int size = arr[arr.length-1]+k;
        System.out.print(size);
        for(int i=1; i<=size; i++){
            if(map.get(i)==null){
                count++;
                // System.out.print(count);
                // System.out.print(map);
                if(count==k){
                    return i;
                }
            }
        }
        return -1; 
    }
/*
2 3 4 7 11 k 5.
missing 1 5 6 8 9 10. 

1 2 3 4 k = 2. non missing.
n +2 = 6. 
 */
}