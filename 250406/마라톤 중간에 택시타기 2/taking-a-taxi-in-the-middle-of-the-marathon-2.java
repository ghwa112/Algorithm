import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        
        for(int i = 1; i < n-1; i++){
            int dis = 0;
            
            for(int j = 0; j < n; j++){
                int deduct = 1;
                if(j==i || j-deduct <0) continue;
                if(j-deduct == i) deduct = 2;
                dis += Math.abs(x[j]-x[j-deduct]) + Math.abs(y[j]-y[j-deduct]);
            }
            min = Math.min(dis,min);
        }
        System.out.println(min);
    }
}