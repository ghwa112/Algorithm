import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,-1,0,1};

        int dirNum = 0;

        int[][] map = new int[n][m];

        int i = 0;
        int j = 0;

        public boolean inRange(int a,int b){
            return a < 0 || a > m || b < 0 || b > n;
        }

        while(true){
            map[i][j]++;
            j++;

            
        }
    }
}