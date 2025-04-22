import java.util.*;

public class Main {
    public static int solution(String str){
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        int n = str.length();
        str += str;
        int ans = 0;

        A:for(int i = 0; i < n; i++){
            ArrayDeque<Character> stack = new ArrayDeque<>();
            for(int j = i ; j < i+n; j++){
                char c = str.charAt(j);
                if(map.containsKey(c)){
                    stack.push(c);
                }else{
                    if(stack.isEmpty() || !map.get(stack.pop()).equals(c)){
                        continue A;
                    }
                }
            }
            if(stack.isEmpty())
                ans++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int result = solution("(){}[]");

        System.out.println(result);
    }
}