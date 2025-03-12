import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rect1_x1 = sc.nextInt();
        int rect1_y1 = sc.nextInt();
        int rect1_x2 = sc.nextInt();
        int rect1_y2 = sc.nextInt();
        int rect2_x1 = sc.nextInt();
        int rect2_y1 = sc.nextInt();
        int rect2_x2 = sc.nextInt();
        int rect2_y2 = sc.nextInt();

        int MAX = 2000;
        int OFFSET = 1000;

        int[][] square = new int[MAX][MAX];

        for(int i = rect1_x1 + OFFSET; i <= rect1_x2 + OFFSET; i++){
            for(int j = rect1_y1 + OFFSET; j <= rect1_y2 + OFFSET; j++){
                square[i][j]++;
            }
        }

        for(int i = rect2_x1 + OFFSET; i <= rect2_x2 + OFFSET; i++){
            for(int j = rect2_y1 + OFFSET; j <= rect2_y2 + OFFSET; j++){
                square[i][j]--;
            }
        }
        int minX = MAX;
        int maxX = 0;
        int minY = MAX;
        int maxY = 0;

        for(int i = rect1_x1 + OFFSET; i <= rect1_x2 + OFFSET; i++){
            for(int j = rect1_y1 + OFFSET; j <= rect1_y2 + OFFSET; j++){
                if(square[i][j] == 1){
                    minX = Math.min(minX,i - OFFSET);
                    maxX = Math.max(maxX,i - OFFSET);
                    minY = Math.min(minY,j - OFFSET);
                    maxY = Math.max(maxY,j - OFFSET);
                }
            }
        }


        int ans = (maxX - minX) * (maxY - minY);

        System.out.println(ans);
        // Please write your code here.
    }
}