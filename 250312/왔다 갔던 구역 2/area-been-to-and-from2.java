import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int MAX_N = 100;
        int MAX_R = 2000;
        int OFFSET  = 1000;

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] x1 = new int[MAX_N];
        int[] x2 = new int[MAX_N];
        int[] array = new int[MAX_R+1];

        int cur = 1000;
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            if(dir == 'R'){
                x1[i] = cur;
                x2[i] = cur + x;

                cur += x;
            }else{
                x1[i] = cur - x;
                x2[i] = cur; 

                cur -= x;
            }
        }

        int cnt = 0;

        for(int i = 0; i < N; i++){
            for(int j = x1[i]; j < x2[i]; j++ ){
                array[j]++;
            }
        }

        for(int i = 0; i<MAX_R; i++) {
            if(array[i]>=2)
                cnt++;
        }

        System.out.println(cnt);
    }
}