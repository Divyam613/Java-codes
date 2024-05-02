import java.util.Arrays;
// package Dynamic programming;
//For an integer array nums, an inverse pair is a pair of integers [i, j] where 0 <= i < j < nums.length and nums[i] > nums[j].

//Given two integers n and k, return the number of different arrays consist of numbers from 1 to n such that there are exactly k inverse pairs. Since the answer can be huge, return it modulo 109 + 7.

public class K_Inverse_Pairs_Array {
    public static int kInversePairs(int n, int k) {
        int[] dp = new int[k+1];
        int[] dp1 = new int[k+1];
        Arrays.fill(dp,0);
        Arrays.fill(dp1,0);
        dp[0]=1;
        for(int i=2;i<=n;i++){
            for(int j=0;j<=k;j++){
                if(j==0){
                    dp1[j]=1;
                }
                else{
                    int val = (dp1[j-1]+dp[j])%1000000007;
                    if(j>=i){
                        val = (val-dp[j-i]+1000000007)%1000000007;
                    }
                    dp1[j]=val;
                }
            }
            for(int j=0;j<=k;j++){
                dp[j]=dp1[j];
            }
        }
        return dp[k];
    }
    public static void main(String[] args) {
        int    n = 3, k = 0;
        System.out.println(kInversePairs(n,k));
    }
}
