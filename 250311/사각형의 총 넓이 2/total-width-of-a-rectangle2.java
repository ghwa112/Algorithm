import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int[] x2 = new int[n];
        int[] y2 = new int[n];

        int OFFSET = 100;
        int[][] square = new int[200][200];
        int ans = 0;

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt() + OFFSET;
            y1[i] = sc.nextInt() + OFFSET;
            x2[i] = sc.nextInt() + OFFSET;
            y2[i] = sc.nextInt() + OFFSET;
            for(int x = x1[i]; x < x2[i]; x++){
                for(int y = y1[i]; y < y2[i]; y++){
                    square[x][y]++;
                    if(square[x][y] == 1)
                        ans++;
                }
            }
        }
        
        System.out.println(ans);
    }
}