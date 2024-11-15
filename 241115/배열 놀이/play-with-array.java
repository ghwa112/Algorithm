
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;




public class Main {
    public static void main(String[] args) {
    	
    	
    	 try {
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

             String line1 = br.readLine();
             StringTokenizer st1 = new StringTokenizer(line1);
             int n = Integer.parseInt(st1.nextToken());
             int q = Integer.parseInt(st1.nextToken());
             
             String line2 = br.readLine();
             StringTokenizer st2 = new StringTokenizer(line2);
             int[] arr = new int[n];
             for(int i=0;i<n;i++) {
            	 arr[i] = Integer.parseInt(st2.nextToken());
             }
             
             for(int i=0;i<q;i++) {
            	 String qeustion = br.readLine();
            	 StringTokenizer qe = new StringTokenizer(qeustion);
                 int num = Integer.parseInt(qe.nextToken());
                 switch(num) {
                 case 1:
                	 int a = Integer.parseInt(qe.nextToken());
                	 System.out.println(arr[a-1]);
                	 break;
                 case 2:
                	 int b = Integer.parseInt(qe.nextToken());
                	 boolean exist = false;
                	 int result = 0;
                	 for (int j = 0; j < n; j++) {
                         if (arr[j] == b) {
                        	 exist = true;
                        	 result = j+1;
                        	 break;
                         }
                     }
                	 if(exist)
                		 System.out.println(result);
                	 else
                		 System.out.println(0);
                	 break;
                 case 3:
                	 int s = Integer.parseInt(qe.nextToken());
                	 int e = Integer.parseInt(qe.nextToken());
                	 for(int k=s-1; k<e; k++) {
                		 System.out.print(arr[k]+" ");
                	 }
                	 System.out.println();
                	 break;
                 }
                 
             }
         } catch(IOException e) {
             e.printStackTrace();
         }
     }
 }
