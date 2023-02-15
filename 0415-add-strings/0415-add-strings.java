class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        
        int carry =0;
        StringBuilder ans = new StringBuilder();
        
        while(i>=0 && j>=0){
            
            int x = num1.charAt(i)-'0';
            int y = num2.charAt(j)-'0';
            
            int sum = x + y + carry;
            
            carry = sum/10;
            
            ans.append(sum%10);
            
            i--;
            j--;
        }
        
        while(i>=0){
            
            int x = num1.charAt(i)-'0';
            
            int sum = x + carry;
            
            carry = sum/10;
            
            ans.append(sum%10);
            
            i--;
        }
        
        while(j>=0){
            
            int y = num2.charAt(j)-'0';
            
            int sum =  y + carry;
            
            carry = sum/10;
            
            ans.append(sum%10);
            
            j--;
        }
        
        if(carry!=0) ans.append(carry);
        
        return ans.reverse().toString();
    }
}