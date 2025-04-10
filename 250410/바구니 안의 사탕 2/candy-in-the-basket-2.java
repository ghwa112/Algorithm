import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int candies = 0;
        int positions = 0;
        int[] map = new int[101];
        for (int i = 0; i < n; i++) {
 
            candies = sc.nextInt();
            positions = sc.nextInt();

            map[positions] = candies; 
        }

        int max = Integer.MIN_VALUE;

        for(int i = 0; i<101; i++){
            int count = 0;
            for(int j = i-k; j <= i+k; j++){
                
                
                if(j>=0 && j<101){
                    count += map[j];
                }
            }
            max = Math.max(max,count);
        }
        System.out.println(max);

        
    }
}