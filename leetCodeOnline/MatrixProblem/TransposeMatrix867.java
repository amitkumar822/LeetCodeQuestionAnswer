package leetCodeOnline.MatrixProblem;

public class TransposeMatrix867 {
    public static int[][] transpose(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] output = new int[col][row];
        for (int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                output[j][i] = matrix[i][j];
            }
        }
        return output;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] output = transpose(matrix);
        for (int i=0; i<matrix.length; i++){
            for (int j=0; j<matrix[0].length; j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
}

/*
output:-
1 4 7
2 5 8
3 6 9
 */
