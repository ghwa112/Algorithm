import java.util.Scanner;
public class Main {
    private static boolean inRange(int a,int b,int n, int m){
            return a >= 0 && a < n && b >= 0 && b < m;
        }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] dx = new int[]{0,1,0,-1};
        int[] dy = new int[]{1,0,-1,0};

        int x = 0 , y = 0, dirNum = 0;
        int nx = 0;
        int ny = 0;

        int[][] map = new int[n][m];

        

        for(int k = 1; k <= n*m ; k++){

            map[x][y] = k;

            nx = x + dx[dirNum];
            ny = y + dy[dirNum];

            if(!inRange(nx,ny,n,m) || map[nx][ny] != 0){
                dirNum = (1+dirNum) % 4;
                nx = x + dx[dirNum];
                ny = y + dy[dirNum];
            }

            x = nx;
            y = ny;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
}