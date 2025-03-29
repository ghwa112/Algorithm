import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String commands = sc.next();
        
        char[] commandArray = commands.toCharArray(); 

        int[] dx = new int[]{0,1,0,-1};
        int[] dy = new int[]{1,0,-1,0};
        
        int x=0,y=0,dirNum=0,ans=0;
        boolean check = false;

        for(int i = 0; i < commandArray.length; i++){
            if(commandArray[i] == 'F'){
                x = x+dx[dirNum];
                y = y+dy[dirNum];
            }else if(commandArray[i] == 'R'){
                dirNum = (dirNum + 1) % 4;
            }else{
                dirNum = (dirNum + 3) % 4;
            }
            ans++;
            if(x == 0 && y == 0){
                check = true;
                break;
            }
        }
        if(!check) ans = -1;
        System.out.println(ans);
    }
}