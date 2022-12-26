class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
          set<int> s;
		
        s.insert(nums.begin(),nums.end()); 
		
		
        return nums.size()!=s.size();
    }
};