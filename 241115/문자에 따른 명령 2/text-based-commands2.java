import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        try {
             int[] dx = new int[]{1, 0, -1, 0};
             int[] dy = new int[]{0, -1, 0, 1};
             int nx=0, ny=0;
             int dirNum = 3;

              BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 1024 * 1024);
             String line1 = br.readLine(); // 문자열 입력
             char[] chars = line1.toCharArray(); // 문자열을 문자 배열로 변환
             
             for (char c : chars) {
                 switch(c){
                 case 'R':
                	 dirNum += 1;
                	 break;
                 case 'L':
                	 dirNum -= 1;
                	 break;
                 case 'F':
                	 nx = nx + dx[dirNum];
                     ny = ny + dy[dirNum];                	 
                     break;
                 }
             }
             
             System.out.println(nx + " " + ny);
           
         } catch(IOException e) {
             e.printStackTrace();
         }
    }
}