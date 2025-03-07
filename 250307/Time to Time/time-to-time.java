import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int cnt = 0;
        while (a != c || b != d){

            b++;
            cnt++;
            if(b==60){
                a++;
                b=0;
            }
            
        }
        System.out.println(cnt);
    }
}