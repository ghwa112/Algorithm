import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static final int INT_MIN = Integer.MIN_VALUE;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] dp = new int[n];

        for(int i = 0; i < n; i++){
            dp[i] = INT_MIN;
        }
                
        dp[0] = nums[0];

        for(int i = 1; i<n; i++){
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
        }
        int ans = INT_MIN;
        for(int i=0; i<n ; i++){
            ans = Math.max(ans,dp[i]);
        }
        
        System.out.println(ans);
    }
}