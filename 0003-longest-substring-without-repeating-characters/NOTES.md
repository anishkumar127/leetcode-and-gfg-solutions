```
class Solution {
public int lengthOfLongestSubstring(String str) {
HashMap<Character,Integer> map = new HashMap<>();
int s= 0;
int e = 0;
int n = str.length();
int max =0;
while(e<=n-1){
if(!map.containsKey(str.charAt(e))){
map.put(str.charAt(e),map.getOrDefault(str.charAt(e),0)+1);
max = Math.max(max,map.size());
e++;
}else{
map.remove(Character.valueOf(str.charAt(s)));
s++;
}
}
return max ;
}
}
```