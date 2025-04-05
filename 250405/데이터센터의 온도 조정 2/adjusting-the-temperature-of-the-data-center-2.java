import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int g = sc.nextInt();
        int h = sc.nextInt();
        int[] ta = new int[n];
        int[] tb = new int[n];
        for (int i = 0; i < n; i++) {
            ta[i] = sc.nextInt();
            tb[i] = sc.nextInt();
        }

        int max = 0;
        int count = 0;

        for(int i = 0; i < 1000; i++){
            for(int j = 0; j < n; j++){
                if(i < ta[j]){
                    count += c;
                }else if(i <= tb[j]){
                    count += g;
                }else{
                    count += h;
                }
            }
            max = Math.max(max,count);
            count = 0;
        }
        
        System.out.println(max);
    }
}