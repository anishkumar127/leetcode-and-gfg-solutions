class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        
        int carry = 0;
        int i = num.length-1;
        String s = String.valueOf(k);
        int j = s.length()-1;
        
        while(i>=0 || j>=0){
            
            int sum = carry;
            
            if(i>=0){
                sum+=num[i];
                i--;
            }
            
            if(j>=0){
                sum+=s.charAt(j)-'0';
                j--;
            }
            
            carry = sum/10;
            
            ans.add(sum%10);
        }
        
        if(carry!=0) ans.add(carry);
        
        Collections.reverse(ans);
        return ans;
    }
}