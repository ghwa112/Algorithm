import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {

        try{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line1 = br.readLine();
            StringTokenizer st1 = new StringTokenizer(line1);
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());

            System.out.print(String.valueOf(a) +" "+ String.valueOf(b) + " " + (a + b));
        }catch(IOException e){}
        


    }
}