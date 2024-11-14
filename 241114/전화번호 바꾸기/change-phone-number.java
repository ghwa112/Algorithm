import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line1 = br.readLine();
            // '-' 문자를 구분자로 사용
            StringTokenizer st1 = new StringTokenizer(line1, "-");
            String a = st1.nextToken();
            String b = st1.nextToken();
            String c = st1.nextToken();

            // a와 b를 문자열로 변환하여 연결한 후, a + b의 합을 출력
            System.out.print(a +"-"+ c + "-" + b);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
