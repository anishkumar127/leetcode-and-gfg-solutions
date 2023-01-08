class Solution {
    public int maxPoints(int[][] points) {
        int max=1;
        for(int i=0;i<points.length-1;i++)
        {
            HashMap<Float,Integer> map=new HashMap<>();
            for(int j=i+1;j<points.length;j++)
            {
                float temp;
                int a=points[j][1]-points[i][1];
                int b=points[j][0]-points[i][0];
                if(a==0) {
                    temp=0;
                }
                else if(b==0){
                    temp=Float.POSITIVE_INFINITY;
                }
                else{
                    temp=(float)(a)/(b);
                }
                if(map.containsKey(temp)){
                    map.put(temp,map.get(temp)+1);
                }  
                else{
                    map.put(temp,2);
                }
                if(map.get(temp)>max){
                    max=map.get(temp);
                }
            }
        }
        return max;
    }
}