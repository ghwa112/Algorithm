import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int OFFSET  = 1000;
        int[] array = new int[2001];

        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            for(int j = 0; j < x;j++){
                if(dir == 'R'){
                array[OFFSET]++;
                OFFSET++;
                }else{
                array[OFFSET]++;
                OFFSET--;
                }
            }
        }

        int cnt = 0;

        for(int i = 0; i< 2001; i++){
            if(array[i]>1)
                cnt++;
        }

        System.out.println(cnt);
    }
}