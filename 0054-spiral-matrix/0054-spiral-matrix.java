class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        int lrow = matrix.length;
        int lcol = matrix[0].length;

        int srow = 0 , erow = lrow-1;
        int scol = 0 , ecol = lcol-1;

        List<Integer> list = new ArrayList<>();
        while(srow<=erow && scol<=ecol){

           

            for(int i=srow, j=scol;j<=ecol;j++){
                list.add(matrix[i][j]);
                System.out.print(matrix[i][j]+" ");
            } 

            for(int j=ecol,i=srow+1;i<=erow;i++){
                list.add(matrix[i][j]);
                System.out.print(matrix[i][j]+" ");
            }

            for(int i=erow,j=ecol-1;j>=scol;j--){
                if(srow==erow) break;
                list.add(matrix[i][j]);
                System.out.print(matrix[i][j]+" ");
            }

            for(int j=scol,i=erow-1;i>srow;i--){
                if(scol==ecol) break;
                list.add(matrix[i][j]);
                System.out.print(matrix[i][j]+" ");
            }


            srow++;
            scol++;
            ecol--;
            erow--;
        }

        return list;
    }
}