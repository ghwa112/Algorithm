import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];

        int ans = 0;

        int[] array = new int[100];
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
            for(int j = start[i]; j<end[i]+1; j++){
                array[j]++;
                ans = Math.max(ans,array[j]);
            }
        }

        System.out.println(ans);
        // Please write your code here.
    }
}