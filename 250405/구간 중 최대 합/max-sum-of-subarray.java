import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        int ans = 0, count = 0;

        for(int i = 0; i <= n - k; i++){
            for(int j = 0; j<k;j++){
                count = count + arr[i+j];
            }
            ans = Math.max(count,ans);
            count = 0;
        }

        System.out.println(ans);
    }
}