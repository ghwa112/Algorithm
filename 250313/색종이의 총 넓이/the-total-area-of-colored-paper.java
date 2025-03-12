import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] y1 = new int[n];
        int MAX = 201;
        int[][] square = new int[MAX][MAX];
        int OFFSET = 100;

        for (int i = 0; i < n; i++) {
            x1[i] = sc.nextInt()+OFFSET;
            y1[i] = sc.nextInt()+OFFSET;
        }

        for(int i = 0; i<n; i++){
            for(int x = x1[i]; x < x1[i] + 8 ; x++){
                for(int y = y1[i]; y < y1[i] + 8 ; y++){
                    square[x][y]++;  
                }  
                     
            }
        }

        int cnt = 0;

        for(int i = 0; i < MAX; i++){
            for(int j = 0; j < MAX; j++){
                if(square[i][j]>0)
                    cnt++;
            }
        }

        System.out.println(cnt);
        

        
    }
}