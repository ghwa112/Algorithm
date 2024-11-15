import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;




public class Main {
    public static void main(String[] args) {
    	
    	 try {
             int x = 0, y = 0; 
             int[] dx = new int[]{1,  -1, 0, 0};
             int[] dy = new int[]{0, 0,  -1, 1};
             int nx=0, ny=0;

             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

             String line1 = br.readLine();
             StringTokenizer st1 = new StringTokenizer(line1);
             int count = Integer.parseInt(st1.nextToken());
             int dirNum = 0;
             
             for(int i = 0; i < count; i++){
            	 
                 String line2 = br.readLine();
                 StringTokenizer st2 = new StringTokenizer(line2);
                 String a = st2.nextToken();
                 int b = Integer.parseInt(st2.nextToken());
                 
                 switch(a) {
                 case "E":
                	 dirNum = 0;
                	 break;
                 case "W":
                	 dirNum = 1;
                	 break;
                 case "S":
                	 dirNum = 2;
                	 break;
                 case "N":
                	 dirNum = 3;
                	 break; 
                 }
                 for(int j = 0; j < b ; j++) {
                	 nx = nx + dx[dirNum];
                     ny = ny + dy[dirNum];
                 }
             }
             
             System.out.println(String.valueOf(nx) + " " + String.valueOf(ny));
           
         } catch(IOException e) {
             e.printStackTrace();
         }
     }
 }
