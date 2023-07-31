class Solution {

    int[][] dp;
        
    public int minimumDeleteSum(String s1, String s2) {

        int n = s1.length();
        int m = s2.length();

        this.dp = new int[n][m];

        for(int[] arr:dp)
            Arrays.fill(arr,-1);

        return recursion(s1,s2,n-1,m-1);      
      
    }


    
    private int recursion(String s1,String s2,int i,int j){

        if(i<0 && j<0){
            return 0;
        }

        if(j < 0 )
            return (int)s1.charAt(i)+recursion(s1,s2,i-1,j);
        
        if(i< 0)
            return (int)s2.charAt(j)+recursion(s1,s2,i,j-1);

        if(dp[i][j] != -1)
            return dp[i][j];

       if(s1.charAt(i) == s2.charAt(j)){
           dp[i][j] = recursion(s1,s2,i-1,j-1);
       }else{
           dp[i][j] = Math.min((int)s1.charAt(i)+recursion(s1,s2,i-1,j),
                                (int)s2.charAt(j)+recursion(s1,s2,i,j-1));
       }

       return dp[i][j];

    }

}