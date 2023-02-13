class Solution {
    public int countOdds(int low, int high) {
      if(low%2==0) low = low+1;
        
      if(high%2==0) high = high -1;
        
        return ((high-low)/2)+1;
    }
}