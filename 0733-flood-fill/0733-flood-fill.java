class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
          if(image[sr][sc] == color) return image;
        find(image,sr,sc,color,image[sr][sc]);
        return image;
    }
    private void find(int[] [] image,int sr,int sc, int color, int initColor){
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length){
            return ;
        }
        if(initColor == image[sr][sc]){
            image[sr][sc]= color;
            find(image,sr+1,sc,color,initColor);
             find(image,sr,sc+1,color,initColor);
             find(image,sr-1,sc,color,initColor);
             find(image,sr,sc-1,color,initColor);
        }
    }
}