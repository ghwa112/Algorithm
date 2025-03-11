import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];

        int[] array = new int[200];
        int ans = 0;
        int OFFSET = 100;
        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt() + OFFSET;
            x2[i] = sc.nextInt() + OFFSET;
            for(int j = x1[i]; j< x2[i]; j++){
                array[j]++;
                ans = Math.max(ans,array[j]);
            }  
        }        

        System.out.println(ans);
    }
}