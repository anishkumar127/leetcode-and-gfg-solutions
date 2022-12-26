class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
      map<int,int>map;
          for(auto &val:nums){
              map[val]++;
          }
        
        for(auto &val:map){
            if(val.second>=2){
                return true;
            }
        }
        return false;
    }
};