import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        int a = 0, b = 0, c = 0, d = 0;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            for (int i = 0; i < 3; i++) {
                String line1 = br.readLine();
                StringTokenizer st1 = new StringTokenizer(line1);
                String tf = st1.nextToken();
                int temp = Integer.parseInt(st1.nextToken());

                if (tf.equals("Y")) {  // "Y"일 때
                    if (temp >= 37) {
                        a++;
                    } else {
                        c++;
                    }
                } else {  // "N"일 때
                    if (temp >= 37) {
                        b++;
                    } else {
                        d++;
                    }
                }
            }

            String result;
            if (a >= 2) {
                result = "E";
            } else {
                result = "N";
            }

            System.out.print(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
