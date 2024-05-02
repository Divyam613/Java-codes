public class Longest_Common_Subsequence {
    public static int longestCommonSubsequence(String text1, String text2) {
        int n = text1.length();
        int m=text2.length();
        int[][] dp = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int i=0;i<=m;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    int op1 = dp[i-1][j];
                    int op2 = dp[i][j-1];
                    dp[i][j]=Math.max(op1,op2);
                }
            }
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        System.out.println(longestCommonSubsequence(s1,s2));
    }
}
