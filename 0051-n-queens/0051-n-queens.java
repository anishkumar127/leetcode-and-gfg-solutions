class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
          char[][] board = new char[n][n];
        // initialise
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        NQueens(board,0,ans);
        return ans;
    }
     private boolean isSafe(char[][] board, int row,int col){
        int n = board.length;
        // vertical up
        for(int i = row-1; i>=0; i--){
            if(board[i][col] =='Q'){  // if go up already queen then return false;
                return false;
            }
        }
//        digaonal left
        for(int i=row-1,  j = col-1 ;  i>=0 && j>=0 ; i-- ,j--) {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        // dioagonal right
        for(int i=row-1,  j = col+1 ;  i>=0 && j<n ; i-- ,j++) {
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    private void NQueens(char[][] board, int row,List<List<String>> ans){
        if(row==board.length){
            ans.add(new ArrayList<>(display(board)));
            return;
        }
        // column loop
        for(int j=0; j<board.length; j++){
            if(isSafe(board,row,j)){
            board[row][j] = 'Q';
            NQueens(board,row+1,ans); // function call.
            board[row][j] ='.'; // backtracking
            }
        }
    }
       private ArrayList<String> display(char [][] board){
           ArrayList<String> ans = new ArrayList<>();
         for(char[] arr:board){
             String curr = "";
           for(char val:arr){
            // ans.add(curr==val);
               curr +=val;
           }
             ans.add(curr);
         }
           return ans;
    }
}