import java.util.Arrays;
// package Dynamic programming.Matrix;
/*  Given an array p[] of length n used to denote the dimensions of a series of matrices such that 
the dimension of i'th matrix is p[i] * p[i+1]. There are a total of n-1 matrices. Find the most 
efficient way to multiply these matrices together. 
// As in MCM, you were returning the most effective count but this time return the string which
 is formed of A - Z (only Uppercase) denoting matrices & Brackets( "(" ")" ) denoting multiplication
symbols. For example, if n =11, the matrixes can be denoted as A - K as n<=26 & brackets as multiplication symbols.

1.Each multiplication is denoted by putting open & closed brackets to the matrices multiplied & also Please 
note that the order of matrix multiplication matters, as matrix multiplication is non-commutative A*B != B*A

2.As there can be multiple possible answers, the console would print "True" for the correct string and "False"
for the incorrect string. You need to only return a string that performs a minimum number of multiplications.*/

public class Brackets_in_Matrix_Chain_Multiplication {
    static String constructString(int i, int j, int[][] dp1) {
        if (i == j) {
            return Character.toString((char)(i + 64));
        }
        int k = dp1[i][j];
        return "(" + constructString(i, k, dp1) + constructString(k+1, j, dp1) + ")";
    }
    static String matrixChainOrder(int p[], int n){
        // code here
        int[][] dp = new int[n][n];
        int[][] dp1 = new int[n][n];
        for(int[] arr: dp){
            Arrays.fill(arr,-1);
        }
        for(int[] arr: dp1){
            Arrays.fill(arr,-1);
        }
        int val = helper(p,1,n-1,dp,dp1);
        String ans = constructString(1, n-1, dp1);
        for(int i=0;i<n-1;i++){
            ans+=(char)(i+65);
        }
        return ans;
    }
    static int helper(int[] p,int i,int j,int[][] dp,int[][] dp1){
        if(i>=j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int min = Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int val = helper(p,i,k,dp,dp1)+helper(p,k+1,j,dp,dp1)+p[i-1]*p[k]*p[j];
            if(val<min){
                min=val;
                dp1[i][j]=k;
            }
        }
        dp[i][j]=min;
        return dp[i][j];
    }
    public static void main(String[] args) {
        int[] arr = {40, 20, 30, 10, 30};
        int n = arr.length;
        System.out.println(matrixChainOrder(arr,n));
    }
}
