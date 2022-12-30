class Solution {
    public int mostFrequentEven(int[] nums) {
    
        HashMap<Integer,Integer> map = new HashMap<>();
       int max = 0; 
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
                max  = Math.max(max,map.get(nums[i]));
            }
        }
        int ans = Integer.MAX_VALUE;
            
      for(int val:map.keySet()){
          if(map.get(val)==max){
              ans = Math.min(ans,val);
          }
      }
            
     return ans==Integer.MAX_VALUE? -1:ans;
    }
}
