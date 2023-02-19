//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.util.stream.*;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}
// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

      long [] prefix = new long[n];
       prefix[0] = arr[0];
       
       for(int i=1; i<n; i++){
           prefix[i] = arr[i]+prefix[i-1];
       }
        long [] suffix = new long[n];
       suffix[n-1] = arr[n-1];
       
       for(int i=n-2; i>=0; i--){
           suffix[i] = arr[i]+suffix[i+1];
       }
       
       for(int i=0; i<n; i++){
           if(prefix[i]-suffix[i]==0){
               return i+1;
           }
       }
       return -1;
    }
}
