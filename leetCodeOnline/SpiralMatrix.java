package leetCodeOnline;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpiralMatrix {
    static List<Integer> spiralOrder(int[][] matrix){
        List<Integer> res = new ArrayList<>();
        if(matrix.length==0) return res;
        int top=0, bottom=matrix.length-1,left=0,right=matrix[0].length-1;

        while (left <= right && top <= bottom){
            for (int i=left; i<=right; i++) res.add(matrix[top][i]);
                top++;
            for (int i=top; i<=bottom; i++) res.add(matrix[i][right]);
            right--;

            if(top <=bottom) {
                for (int i = right; i >=left; i--) res.add(matrix[bottom][i]);
                bottom--;
            }

            if(left <=right) {
                for (int i = bottom; i >=top; i--) res.add(matrix[i][left]);
                left++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
//        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];

        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //int len = matrix.length;
        List<Integer> res = spiralOrder(matrix);

        String st = String.valueOf(res);
        String str = st.replaceAll("[\\[\\,\\]]","");

        String[] wd = str.split(" +");

        int[] nb = new int[row*col];
        int k=0;
        for (String rt : wd){
            nb[k++] = Integer.parseInt(rt);
        }
        k=0;
        int[][] td = new int[row][col];
        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                td[i][j] = nb[k++];
            }
        }

        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                int digit = td[i][j];
                System.out.print(digit+" ");
            }
            System.out.println();
        }
    }
}
