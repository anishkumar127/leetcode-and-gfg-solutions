class Solution {
    public int lengthOfLongestSubstring(String str) {
        // if(str.equals("pwwkew")) return 3;
        // if(str.length()==1) return 1;        
        HashMap<Character,Integer> map = new HashMap<>();
        int s= 0;
        int e = 0;
        int n = str.length();
        int max =0;
        String x ="";
        System.out.print(x.length());
        while(e<=n-1){
            // System.out.print("hello");
            if(!map.containsKey(str.charAt(e))){
                map.put(str.charAt(e),map.getOrDefault(str.charAt(e),0)+1);
                max = Math.max(max,map.size());
                e++;
            }else{
                // map.put(str.charAt(e),map.getOrDefault(str.charAt(e),0)-1);
               
                map.remove(Character.valueOf(str.charAt(s)));                    
                s++;
            }
            
        }
        System.out.print(map);
        // if(map.size()==0) return 1;
        return max ;
    }
}