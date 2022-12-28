class Solution {
public:
    int minStoneSum(vector<int>& piles, int k) {
        priority_queue<int>pq(piles.begin(),piles.end());
        int sum= accumulate(piles.begin(),piles.end(),0);
        while(k--){
            int val = pq.top();
            pq.pop();
            pq.push(val-val/2);
            sum-=val/2;
        }
        return sum;
    }
};