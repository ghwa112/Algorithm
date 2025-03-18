import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        String[] dayOfWeek = new String[]{"Mon","Tue","Wed","Thu","Fri","Sat","Sun"};
        int[] dayOfMonth = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
        int day = 0;

        while(true){
            if(m1 == m2 && d1 == d2)
                break;
            if( dayOfMonth[m1-1] == d1){

                m1++;
                d1 = 1;
            }
            day = day % 7;
            day++;
            d1++;
        }

        System.out.println(dayOfWeek[day]);


    }
}