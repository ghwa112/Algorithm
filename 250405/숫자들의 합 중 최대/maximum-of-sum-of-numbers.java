import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int max = Integer.MIN_VALUE;
        
        for(int i = x; i <= y; i++){

            int result = 0;
            int temp = i;

            while(temp>0){
                result += temp % 10;
                temp /= 10;
            }
            max = Math.max(max,result);
        }

        System.out.println(max);
    }
}