import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int count = 0, ans = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                count = count + (a[j] * Math.abs(j-i));
            }
            ans = Math.min(count,ans);
            count = 0;
        }

        System.out.println(ans);
    }
}