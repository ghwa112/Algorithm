import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        char[] cht = str.toCharArray();
        int cnt = 0;
        for(int i = 0; i < cht.length; i++){
            if(cht[i] == '('){
                for(int j = 0; j < (cht.length-i); j++ ){
                    if(cht[i+j] == ')') cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}