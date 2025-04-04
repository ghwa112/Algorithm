import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] aArray = new int[1000000];
        int[] bArray = new int[1000000];

        int startA = 0, startB = 0;

        // A의 이동
        for (int i = 0; i < n; i++) {
            String[] parts = br.readLine().split(" ");
            char dir = parts[0].charAt(0);
            int count = Integer.parseInt(parts[1]);

            for (int j = 1; j <= count; j++) {
                aArray[startA + j] = aArray[startA + j - 1] + (dir == 'L' ? -1 : 1);
            }
            startA += count;
        }

        // B의 이동
        for (int i = 0; i < m; i++) {
            String[] parts = br.readLine().split(" ");
            char dir = parts[0].charAt(0);
            int count = Integer.parseInt(parts[1]);

            for (int j = 1; j <= count; j++) {
                bArray[startB + j] = bArray[startB + j - 1] + (dir == 'L' ? -1 : 1);
            }
            startB += count;
        }

        // 두 사람이 만나는 가장 이른 시점 찾기
        int ans = -1;
        int maxTime = Math.min(startA, startB);  // 둘 중 더 짧은 시간까지만 비교
        for (int i = 1; i <= maxTime; i++) {
            if (aArray[i] == bArray[i]) {
                ans = i;
                break;
            }
        }

        System.out.println(ans);
    }
}
