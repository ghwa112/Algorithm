import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean inRange(int x, int y, int n) {
		return (0 <= x && x < n && 0 <= y && y < n);
	}

	public static void main(String[] args) {

		int[] dx = new int[] { 0, 1, 0, -1 };
		int[] dy = new int[] { 1, 0, -1, 0 };
		int cnt = 0;
		int result = 0;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			String line1 = br.readLine();
			int n = Integer.parseInt(line1);
			int[][] arr = new int[n][n];

			for (int i = 0; i < n; i++) {
				String line = br.readLine();
				StringTokenizer str = new StringTokenizer(line);
				for (int j = 0; j < n; j++) {
					arr[i][j] = Integer.parseInt(str.nextToken());
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					for (int dirNum = 0; dirNum < 4; dirNum++) {
						int nx = i + dx[dirNum], ny = j + dy[dirNum];
						if (inRange(nx, ny, n) && arr[nx][ny] == 1)
							cnt++;
					}
					if (cnt > 2) {
                        result++;
                        continue; // 다음 셀로 넘어감
                    }
					cnt = 0;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(result);
	}
}
