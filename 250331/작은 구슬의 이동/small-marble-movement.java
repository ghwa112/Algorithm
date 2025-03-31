import java.util.Scanner;

public class Main {

    public static boolean inRange(int x, int y, int n) {
        return x > 0 && x <= n && y > 0 && y <= n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // 격자 크기 (N x N)
        int T = sc.nextInt(); // 이동 시간
        int R = sc.nextInt(); // 시작 행
        int C = sc.nextInt(); // 시작 열
        String D = sc.next(); // 시작 방향 (U, D, L, R)

        // 방향 설정: R(0), U(1), L(2), D(3)
        int[] dx = {1, 0, -1, 0}; // x: 열(col)
        int[] dy = {0, -1, 0, 1}; // y: 행(row)
        int dirNum = 0;

        switch (D) {
            case "U":
                dirNum = 1;
                break;
            case "D":
                dirNum = 3;
                break;
            case "R":
                dirNum = 0;
                break;
            case "L":
                dirNum = 2;
                break;
        }

        for (int i = 0; i < T; i++) {
            int nx = C + dx[dirNum];
            int ny = R + dy[dirNum];

            if (!inRange(nx, ny, N)) {
                // 방향 반대로 전환
                dirNum = (dirNum + 2) % 4;
                continue;
            }

            // 이동
            C = nx;
            R = ny;
        }

        // 최종 좌표 출력
        System.out.println(R + " " + C);
    }
}
