import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        
        char[] array = str.toCharArray();
        int cnt = 0;

        for(int i = 0; i < str.length(); i++){
            if(array[i] == 'C'){
                for(int j = i; j < str.length(); j++){
                    if(array[j] == 'O'){
                        for(int k = j; k < str.length(); k++){
                            if(array[k] == 'W') cnt++;
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}