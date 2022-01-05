package basicMath2;

import java.util.Scanner;

public class num1085 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        int x_min = 501;
        int y_min = 501;

        if (x - 0 >= w - x)
            x_min = w - x;
        else
            x_min = x - 0;

        if (y - 0 >= h - y)
            y_min = h - y;
        else
            y_min = y - 0;

        if (x_min >= y_min)
            System.out.println(y_min);
        else
            System.out.println(x_min);
    }

}
