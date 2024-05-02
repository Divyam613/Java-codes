package Array.TwoD_array;

public class Out_of_boundary_paths {
    public static int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        int[][][] dp = new int[m][n][maxMove+1];
        for(int[][] arr: dp){
            for(int[] ar: arr){
                for(int i=0;i<ar.length;i++){
                    ar[i]=-1;
                }
            }
        }
        return helper(m,n,maxMove,startRow,startColumn,dp);
    }
    public static int helper(int m, int n, int maxMove, int startRow, int startColumn,int[][][] dp){
        if(startRow<0 || startRow>=m || startColumn<0 || startColumn>=n){
            return 1;
        }
        if(maxMove==0){
            return 0;
        }
        if(dp[startRow][startColumn][maxMove]!=-1){
            return dp[startRow][startColumn][maxMove];
        }
        int op1 = helper(m,n,maxMove-1,startRow-1,startColumn,dp);
        int op2 = helper(m,n,maxMove-1,startRow+1,startColumn,dp);
        int op3 = helper(m,n,maxMove-1,startRow,startColumn-1,dp);
        int op4 = helper(m,n,maxMove-1,startRow,startColumn+1,dp);
        dp[startRow][startColumn][maxMove]=((op1+op2)%1000000007+(op3+op4)%1000000007)%1000000007;
        return dp[startRow][startColumn][maxMove];
    }

    public static void main(String[] args) {
        int m=2,n=2,maxMove=2,startRow=0,startColumn=0;
        System.out.println(findPaths(m,n,maxMove,startRow,startColumn));
    }
}
