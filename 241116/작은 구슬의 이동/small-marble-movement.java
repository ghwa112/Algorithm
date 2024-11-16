import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean inRange(int x, int y, int n) {
        return (1 <= x && x <= n && 1 <= y && y <= n);
    }

    public static int getDir(char a) {
        if (a == 'R') return 0; // 오른쪽
        if (a == 'D') return 1; // 아래쪽
        if (a == 'U') return 2; // 위쪽
        return 3; // 왼쪽
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 첫 번째 줄 입력: n (격자 크기), t (이동 횟수)
        StringTokenizer str = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(str.nextToken());
        int t = Integer.parseInt(str.nextToken());

        // 두 번째 줄 입력: 초기 위치 r, c, 방향 d
        StringTokenizer str2 = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(str2.nextToken()); // 행
        int c = Integer.parseInt(str2.nextToken()); // 열
        char dir = str2.nextToken().charAt(0);      // 방향

        // 방향 벡터 정의 (R, D, U, L 순서)
        int[] dx = {0, 1, -1, 0};
        int[] dy = {1, 0, 0, -1};

        // 초기화
        int x = r;
        int y = c;
        int d = getDir(dir);

        // t번 이동
        for (int i = 0; i < t; i++) {
            int nx = x + dx[d];
            int ny = y + dy[d];

            // 경계를 벗어나면 방향 반전
            if (!inRange(nx, ny, n)) {
                if (d == 0) d = 3; // 오른쪽 → 왼쪽
                else if (d == 3) d = 0; // 왼쪽 → 오른쪽
                else if (d == 1) d = 2; // 아래쪽 → 위쪽
                else if (d == 2) d = 1; // 위쪽 → 아래쪽
            } else {
                // 이동
                x = nx;
                y = ny;
            }
        }

        // 최종 위치 출력
        System.out.println(x + " " + y);
    }
}
