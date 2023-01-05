class Solution {
    public int numTilings(int n) {
        if (n <=2) {
            return n;
        }

        int mod = 1000000007;
        long a = 1, b = 1, c = 2;
        
        for (int i = 3; i <= n; i++) {
          long d = (2*c + a)%mod;
            a = b;
            b = c;
            c = d;
        }

        return (int) c;
    }
}