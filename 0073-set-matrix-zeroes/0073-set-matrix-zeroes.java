class Solution {
      public int[][] setZeroes(int[][] matrix) {
    
        int row = matrix.length;
        int col = matrix[0].length;

        int arr[][] = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 0) {
                    for (int k = 0; k < col; k++) {
                        matrix[i][k] = 0;
                    }

                    for (int l = 0; l < row; l++) {
                        matrix[l][j] = 0;
                    }
                }

            }

        }

        return matrix;
    }
}