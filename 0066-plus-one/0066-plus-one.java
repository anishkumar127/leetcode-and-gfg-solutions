class Solution {
    public int[] plusOne(int[] arr) {
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]<9){
              arr[i]++;
                return arr;
            }
            arr[i] = 0;
        }
        
        arr = new int [arr.length+1];
        arr[0] = 1;
        return arr;
    }
}

/*
if number less then 9 then we simply add 1. and return the array.

then one and only case occure when number is 9. and then we just need to make that 9 into 0.

and then just increase the array length. and then add just extra 1 front of array. 
and then return the array.
*/