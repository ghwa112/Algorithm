import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int ans = 0;
        int a, b, c;
        a = 11;
        b = 11;
        c = 11;

        while(true){
            if(A==a && B==b && C==c)
                break;
            c++;
            ans++;
            if(c==60){
                c=0;
                b++;
            }
            if(b==24){
                b=0;
                a++;
            }
            if(a>15){
                ans = -1;
                break;
            }
                
            
        } 
        System.out.println(ans);
    }
}