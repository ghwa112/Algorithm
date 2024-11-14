
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 20; j++) {  // j 루프
                if (j % 2 != 0) {  // j가 홀수일 때만 실행
                    if (j == 19) {
                        System.out.println(String.valueOf(i) + " * " + String.valueOf(j) + " = " + (i * j));
                    } else {
                        System.out.println(String.valueOf(i) + " * " + String.valueOf(j) + " = " + (i * j)
                                + " / " + String.valueOf(i) + " * " + String.valueOf(j+1) + " = " + (i * (j+1)));
                    }
                }
            }
        }
    }
}
