import java.util.Scanner;
public class Main {

    public static boolean inRange(int x, int y, int n){
        return x > 0 && x <= n && y > 0 && y <= n;
    }

    public static boolean check(int map[][],int x, int y,int n){

        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,-1,0,1};

        int ans = 0, nx = 0, ny = 0;

        for(int i = 0; i < 4; i++){

            nx = x + dx[i];
            ny = y + dy[i];

            if(inRange(nx,ny,n)){
                if(map[nx][ny] == 1) ans++;
            }else{
                continue;
            }
            
        }
        if(ans == 3){
            return true;
        }else
            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] square = new int[n+1][n+1];

        for(int i = 0; i < m; i++){

            int x = sc.nextInt();
            int y = sc.nextInt();

            square[x][y]++;

            if(check(square,x,y,n)){
                System.out.println(1);
            }else{
                System.out.println(0);
            }            
        }
    }
}