package Arrays;

//https://leetcode.com/problems/set-matrix-zeroes/

public class q4_set_matrix_zeroes {

    public static void main(String[] args) {
        int matrix[][] = {{1,1,0},{1,1,1},{0,1,1}};
        printMatrix(matrix);
        setZeroesOptimized(matrix);
        printMatrix(matrix);

    }
    public static void printMatrix(int matrix[][]){
        for(int i = 0;i<matrix.length;i++){
            for (int j = 0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void setZeroes(int[][] matrix) {   // Brute force Runtime Error will occur
        int zeroes[][] = new int[matrix.length][2];
        for(int i = 0;i<zeroes.length;i++){
            zeroes[i][0] = -1;
            zeroes[i][1] = -1;
        }
        int a = 0;
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j < matrix[i].length;j++){

                if(matrix[i][j] == 0){

                    zeroes[a][0] = i;
                    zeroes[a][1] = j;
                    a++;
                }
            }
        }


        for(int j = 0; j < a;j++){
            for(int k = 0;k < matrix.length;k++){

                matrix[zeroes[j][0]][k] = 0;
            }
            for(int k = 0;k < matrix[0].length;k++){

                matrix[k][zeroes[j][1]] = 0;
            }
        }

    }


    public static void setZeroesOptimized(int[][] matrix) {
        /// row , column
        int m = matrix.length;  // row size
        int n = matrix[0].length;  // columns size
        int x = 1;
        int y = 1;
        for(int i = 0;i < n;i++){  //  1st row
            if(matrix[0][i] == 0) x = 0;
        }
        for(int i = 0;i < m;i++){  // 1st column
            if(matrix[i][0] == 0) y = 0;
        }

        for(int i = 1;i< m;i++){

            for(int j = 1;j < n;j++){

                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;// row ka leftmost
                    matrix[0][j] = 0; // column ka topmost
                }
            }
        }

        for(int i = 1;i< n;i++){
            if(matrix[0][i] == 0){
                for(int j = 1;j < m;j++){
                    matrix[j][i] = 0;  // making column zero
                }
            }
        }
        for(int i = 1;i< m;i++){
            if(matrix[i][0] == 0){
                for(int j = 1;j < n;j++){
                    matrix[i][j] = 0;  // making row zero
                }
            }
        }

        if(y == 0){
            for(int i = 0;i<m;i++){
                matrix[i][0] = 0;
            }
        }
        if(x == 0){
            for(int i = 0;i<n;i++){
                matrix[0][i] = 0;
            }
        }


    }
}
