import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] map = new int[200][200];
        int OFFSET = 100;

        for (int i = 1; i <= n; i++) {
            int x1 = sc.nextInt()+OFFSET;
            int y1 = sc.nextInt()+OFFSET;
            int x2 = sc.nextInt()+OFFSET;
            int y2 = sc.nextInt()+OFFSET;

            if(i % 2 != 0){
                for(int x = x1; x < x2; x++){
                    for(int y = y1; y < y2; y++){
                        map[x][y] = 0;
                    }
                }
            }else{
                for(int x = x1; x < x2; x++){
                    for(int y = y1; y < y2; y++){
                        map[x][y] = 1;
                    }
                }
            }
        }
        
        int ans = 0;

        for(int i = 0; i < 200; i++){
            for(int j = 0; j < 200; j++){
                if(map[i][j] == 1) ans++;
            }
        }
        System.out.println(ans);
    }
}