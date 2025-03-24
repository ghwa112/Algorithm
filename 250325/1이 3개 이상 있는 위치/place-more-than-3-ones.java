import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,-1,0,1};

        int nx = 0;
        int ny = 0;

        int cnt = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for(int k = 0; k<4; k++){

                    nx = i+dx[k];
                    ny = j+dy[k];

                    if(nx < 0 || nx > n-1 || ny < 0 || ny > n-1)
                        continue;

                    cnt += arr[nx][ny];
                    
                    if(cnt == 3){
                        ans++;
                        break;
                    } 
                }
                cnt = 0;
            }
        }
        System.out.println(ans);
    }
}