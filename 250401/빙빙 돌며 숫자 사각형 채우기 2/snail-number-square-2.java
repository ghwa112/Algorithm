import java.util.Scanner;
public class Main {
    public static boolean inRange(int x, int y, int n, int m){
        return x >= 0 && x < n && y >= 0 && y < m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] map = new int[n][m];

        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,1,0,-1};

        int dirNum = 0, x = 0, y = 0;

        for(int i = 1; i <= n*m; i++){

            map[x][y] = i;

            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            if(!inRange(nx,ny,n,m) || map[nx][ny] != 0){
                dirNum = (1+dirNum) % 4;
                x += dx[dirNum];
                y += dy[dirNum];
                continue;
            }

            x = nx;
            y = ny;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j<m; j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
}