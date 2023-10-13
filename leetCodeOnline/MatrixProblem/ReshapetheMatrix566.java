package leetCodeOnline.MatrixProblem;

public class ReshapetheMatrix566 {
    public static int[][] matrixReshape(int[][] mat, int r, int c){
        int m = mat.length;
        int n = mat[0].length;
        if(m*n != r*c) return mat;
        int row=0,col=0;
        int[][] output = new int[r][c];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                output[row][col] = mat[i][j];
                col++;
                if (col == c){
                    col=0;
                    row++;
                }
            }
        }
        return output;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int r=3,c=5;
        int[][] output = matrixReshape(matrix,r,c);
        for (int i=0; i< output.length; i++){
            for (int j=0; j< output.length; j++){
                System.out.print(output[i][j]+" ");
            }
            System.out.println();
        }
    }
}
