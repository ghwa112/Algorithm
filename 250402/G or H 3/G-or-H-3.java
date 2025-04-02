import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[10001];
        for (int i = 0; i < n; i++) {
            int pos = sc.nextInt();
            char c = sc.next().charAt(0);
            
            if(c=='G'){
                array[pos] += 1;
            }else{
                array[pos] += 2;
            }
        }

        int cnt = 0, min = 0;


        for(int i = 0; i < 10000 - k + 1; i++ ){
            for(int j = i; j <= i+k; j++){
                cnt += array[j];
            }
            min = Math.max(cnt,min);
            cnt = 0;
        }
        
        System.out.println(min);
        
    }
}