import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dx = new int[]{0,-1,0,1};
        int[] dy = new int[]{1,0,-1,0};
        int[][] map = new int[n][n];
        boolean check = false;

        int dirNum = 0, x = n/2, y = n/2;
        int roof = 1 , k = 1;
        while(true){
            map[x][y] = k;
            for(int i = 0; i < 2; i++){
                for(int j = 0; j < roof; j++){
                    x = x + dx[dirNum];
                    y = y + dy[dirNum];
                    map[x][y] = ++k;
                    if(k == n*n){check = true; break;}
                }
                dirNum = (1+dirNum) % 4;
                if(check) break;
            }
            roof++;
            if(check) break;
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }
    }
}