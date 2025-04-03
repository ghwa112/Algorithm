import java.util.Scanner;

public class Main {

    public static boolean inRange(int x, int y, int n){
        return x >= 0 && x < n && y >= 0 && y < n;
    }

    public static int count(char grid[][],int n, int startNum){

        int[] dx = new int[]{0,1,0,-1};
        int[] dy = new int[]{1,0,-1,0};

        int dirNum = 0, x = 0, y = 0;
        int startX = 0, startY = 0;
        int[][] startPoint = new int[n][n];
        //find start point
        for(int i = 0; i < (4*n); i++){
            
            startPoint[x][y] = i + 1;
            if(i == startNum-1){
                break;
            }

            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];

            if(!inRange(nx,ny,n)){
                dirNum++;
                continue;
            }
            x = nx;
            y = ny;
        }


        //find start direction
        if(startNum > 0 && startNum <= n){
            dirNum = 1;
        }else if(startNum > n && startNum <= (2*n)){
            dirNum = 2;
        }else if(startNum > (2*n) && startNum <= (3*n)){
            dirNum = 3;
        }else{
            dirNum = 0;
        }

        int ans = 0;

        while(true){

            ans++;

            // System.out.print(dirNum+" ");
            // System.out.println("("+x+" "+y+")");

            if(grid[x][y] == '/'){
                dirNum = Math.abs(3-dirNum);
            }else{
                dirNum = dirNum^1;
            }

            // System.out.print(dirNum+" ");
            // System.out.println("("+x+" "+y+")");

            int nx = x + dx[dirNum];
            int ny = y + dy[dirNum];
            //System.out.println("("+nx+" "+ny+")");
            if(!inRange(nx,ny,n))
                break;
            
            x = nx;
            y = ny;
        }

        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[][] grid = new char[n][n];

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = s.charAt(j);
            }
        }
        int startNum = sc.nextInt();
        int ans = count(grid,n,startNum);

        System.out.println(ans);
       
    }
}