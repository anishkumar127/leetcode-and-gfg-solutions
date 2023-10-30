class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] num = new Integer[arr.length];
        for(int i=0; i<arr.length;i++) num[i] = arr[i];
        Arrays.sort(num,(a ,b)->{
            int count_a = Integer.bitCount(a);
            int count_b = Integer.bitCount(b);
            if(count_a==count_b){
               return a.compareTo(b);
            }
            return Integer.compare(count_a,count_b);
        });
        for(int i = 0; i<num.length; i++){
            arr[i] = num[i];
        }
        return arr;
    }
}