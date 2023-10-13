package leetCodeOnline.MatrixProblem;

public class SpiralMatrix54 {
    public static int[][] ClockWisePrint(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] output = new int[row][col];
        int l=0,r=col-1,t=0,b=row-1,d=0;

        while(l<=r && t<=b){
            if(d==0){
                for(int i=l; i<=r; i++){
                    output[t][i] = matrix[t][i];
                }
                d=1;t++;
            } else if (d == 1) {
                for (int i=t; i<=b; i++){
                    output[i][r] = matrix[i][r];
                }
                d=2;r--;
            } else if (d == 2) {
                for (int i=r; i>=l; i--){
                    output[b][i] = matrix[b][i];
                }
                d=3;b--;
            } else if (d == 3) {
                for (int i=b; i>=t; i--){
                    output[i][l] = matrix[i][l];
                }
                d=0;l++;
            }
        }
        return output;
    }

    private static void print(int[][] matrix){
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] matrix =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };
        int[][] output = ClockWisePrint(matrix);
        print(output);
    }
}
