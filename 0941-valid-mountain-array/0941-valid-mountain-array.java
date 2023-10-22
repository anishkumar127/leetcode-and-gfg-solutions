class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3)
            return false;
        int index=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i])
                return false;
            else if(arr[i-1]>arr[i]){
                index=i-1;
                if(index==0)
                    return false;
                    break;
            }
                
        }
        for(int i=index;i<arr.length-1;i++){
            if(arr[i]==arr[i+1])
                return false;
            else if(arr[i]<arr[i+1]){
                return false;
            }
        }
        return true;
        
    }
}
