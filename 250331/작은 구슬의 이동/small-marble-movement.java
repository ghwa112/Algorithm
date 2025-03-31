import java.util.Scanner;

public class Main {
    public static boolean inRange(int x, int y, int n){
        return x > 0 && x <= n && y > 0 && y <= n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt() - 1;
        int C = sc.nextInt() - 1;
        String D = sc.next();
        // Please write your code here.

        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,-1,0,1};
        int dirNum = 0;

        int[][] map = new int[N][N];

        switch(D){
            case "U":
                dirNum = 1;
            case "D":
                dirNum = 3;
            case "R":
                dirNum = 0;
            case "L":
                dirNum = 2;
        }

        for(int i = 0; i < T; i++){

            int nx = R + dx[dirNum];
            int ny = C + dy[dirNum];

            if(!inRange(nx,ny,N)){
                dirNum = (2 + dirNum) % 4;
                continue;
            }

            R = nx;
            C = ny;
        }

        System.out.println(C + " " + R);
    }
}
