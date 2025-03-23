import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] direction = s.toCharArray();
        
        int dirNum = 0;


        int[] dx = new int[]{0,1,0,-1};
        int[] dy  = new int[]{1,0,-1,0};
        int x = 0;
        int y = 0;

        for(int i = 0; i < direction.length; i++){
            if(direction[i] == 'F'){
                x = x + dx[dirNum];
                y = y + dy[dirNum];
            }else if(direction[i] == 'R'){
                dirNum = (dirNum + 1) % 3; 
            }else if(direction[i] == 'L'){
                dirNum = (dirNum + 3) % 4; 
            }
        }

        System.out.println(x + " " + y);
    }
}

