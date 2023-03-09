class Solution {
    public int findKthPositive(int[] arr, int k) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for(int val:arr){
            map.put(val,true);
        }
        
        int count = 0;
        int ans = 0;
        int size = arr[arr.length-1]+k;
        for(int i=1; i<=size; i++){
            if(map.get(i)==null){
              count++;
            }
            
            if(count==k) return i;
        }
        return count;
    }
}