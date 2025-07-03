class Solution {

    public boolean isSafe(char board[][],int row,int col){

        int n=board.length;
        for(int i=col;i<n;i++){
            if(board[row][i]=='Q') return false;
        }

        for(int i=row;i>=0;i--){
            if(board[i][col]=='Q') return false;
        }

        for(int i=row,j=col;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q') return false;
        }

        for(int i=row,j=col;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q') return false;
        }

        return true;
    }

    public void nQueen(char board[][],int row,List<List<String>> ans){

        if(row==board.length){
            
           List<String> list = new ArrayList<>();

            for(int i=0;i<board.length;i++){
                StringBuilder str = new StringBuilder();
                for(int j=0;j<board.length;j++){
                str.append(board[i][j]);
                }
                list.add(str.toString());
            }

            ans.add(list);

            return; 
        }
        
        for(int i=0;i<board.length;i++){

            if(isSafe(board,row,i)){
                board[row][i]='Q';
                nQueen(board,row+1,ans);
                board[row][i]='.';
            }

        }

    }

    public List<List<String>> solveNQueens(int n) {
        
        char board[][]=new char[n][n];
        
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }

        List<List<String>> ans = new ArrayList<>();
        nQueen(board,0,ans);

        return ans;
    }
}