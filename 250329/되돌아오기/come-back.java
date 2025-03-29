import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dx = new int[]{1,0,-1,0};
        int[] dy = new int[]{0,-1,0,1};

        int ans = 0;

        int x = 0;
        int y = 0;

        for(int i = 0; i < n; i++){

            char dir = sc.next().charAt(0);
            int dist = sc.nextInt();

            for(int j = 0; j<dist; j++){

                if(dir == 'E'){
                x = x + dx[0];
                y = y + dy[0];
                }else if(dir == 'S'){
                x = x + dx[1];
                y = y + dy[1];
                }else if(dir == 'W'){
                x = x + dx[2];
                y = y + dy[2];
                }else if(dir == 'N'){
                x = x + dx[3];
                y = y + dy[3];
                }
                

                ans++;

                if(x == 0 && y ==0){
                  break;   
                }
            }
            if(x == 0 && y ==0){
                  break;   
                }
        }
        System.out.println(ans);
        
    }
}