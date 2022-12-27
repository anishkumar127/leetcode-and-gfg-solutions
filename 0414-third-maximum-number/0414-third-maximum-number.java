class Solution {
    public int thirdMax(int[] nums) {
         Queue<Integer> que = new PriorityQueue<>();
        
        for(int n : nums){
            if(!que.contains(n)) que.add(n);
            
            if(que.size() > 3) que.remove();
        }
        System.out.print(que);
        if(que.size() >= 3 || que.size() == 1) return que.peek();
        
        //when we only have two items in the que.
        else {
            que.remove();
            return que.peek();
        }
    }
}

/*
so in this solution what we are doing ?
we are doing basically umm
for removing duplicate. we just adding when que not contains that value before.
simpply this way we will not add any kind of duplicate value into our que.
so this will help us to find distint maximum value.
if somehow if que size going to greater then 3 then we simply remove the  miniumum value.

why we are removing minimum value ? because of we need to find maximum 3rd. so that below third maxiumu
we don't need any value .

ok then next. 

we done with our arr elment.
now need to check quee size.
if greater then 3 or equal so we need to return that third maximum. what wait a minute.
why greater then >= 3. in case we will not go greater then 3. in our array loop whenever we go upper 3 we removed from our que. so this is just a condition.
ok and one more. if only 1 elmeent into que that means this will be the maximum one. so we return that directly.

and now one more edge case. if que size is 2. 
then what we need to return maximum element na ? 
so what we will do.
we will deletee minimum and return the maximum,

so here how its working ?

so basically java follow min heap.
its up mimum value in que.
andd maximum value below.
so we remove mimum and return maxmum 

so that's it. 
*/