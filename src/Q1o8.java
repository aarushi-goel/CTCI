import java.util.*;
public class Q1o8 {
    private int[][] zero(int[][] mat, int m, int n){
        boolean row = false;
        boolean col = false;
        for(int j=0;j<mat[0].length;j++){
            if(mat[0][j]==0){
                mat[0][j] = 0;
                row = true;
                break;
            }
        }
        for(int i=0;i<mat.length;i++){
            if(mat[i][0]==0){
                mat[i][0] = 0;
                col = true;
                break;
            }
        }
        for(int i =1;i<mat.length;i++){
            for(int j=1;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }
        for(int i=1;i<mat.length;i++){
            if(mat[i][0]==0){
                int j = mat[0].length-1;
                while(j>=0){
                    mat[i][j] = 0;
                    j--;
                }
            }
        }
        for(int j=1;j<mat[0].length;j++){
            if(mat[0][j]==0){
                int i = mat.length-1;
                while(i>=0){
                    mat[i][j] = 0;
                    i--;
                }
            }
        }
        if(row){
            for(int j=0;j<mat[0].length;j++){
                mat[0][j] = 0;
            }
        }
        if(col){
            for(int i=0;i<mat.length;i++){
                mat[i][0] = 0;
            }
        }
        return mat;
    }
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        int m = inp.nextInt();
        int n = inp.nextInt();
        int[][] mat= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = inp.nextInt();
            }
        }
        Q1o8 q = new Q1o8();
        int[][] ans = q.zero(mat,m,n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(ans[i][j]+ "  ");
            }
            System.out.println("\n");
        }
    }
}
