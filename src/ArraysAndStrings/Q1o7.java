package ArraysAndStrings;

import java.util.*;
public class Q1o7 {
    private int[][] rotate(int[][] mat, int m){
        for(int i=0,j = m-1; i<j; i++,j--){
            int[] temp = mat[i];
            mat[i] = mat[j];
            mat[j] = temp;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<i;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        return mat;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int m = inp.nextInt();
        int[][] mat = new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                mat[i][j] = inp.nextInt();
            }
        }
        Q1o7 q = new Q1o7();
        int[][] ans = q.rotate(mat,m);
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
