import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] array = input.toCharArray();
        int cnt = 0;
        for(int i = 0; i < input.length() - 3; i++){
            if(array[i] == '(' && array[i+1] == '('){
                for(int j = i+1; j < input.length() - 1; j++){
                    if(array[j] == ')' && array[j+1] == ')'){
                        
                        cnt++;
                    } 
                }
            }
        }

        System.out.println(cnt);
    }
}