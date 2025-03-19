import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dirNum = 0;
        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,-1,0,1};
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < n; i++) {
            char direction = sc.next().charAt(0);
            int distance = sc.nextInt();
            
            if(direction == 'E'){
                dirNum = 0;
            }else if(direction == 'S'){
                dirNum = 1;
            }else if(direction == 'W'){
                dirNum = 2;
            }else if(direction == 'N'){
                dirNum = 3;
            }

            for(int j =0; j< distance; j++){
                x += dx[dirNum];
                y += dy[dirNum];
            }
        }

        System.out.print(x + " " + y);
    }
}