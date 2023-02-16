class Solution {
public:
    int numIdenticalPairs(vector<int>& nums) {
        unordered_map<int,int> map;
            int res = 0;
            for(auto &e :nums){
                res+=map[e]++;
            }
        return res;
    }
};