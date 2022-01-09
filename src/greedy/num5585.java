package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num5585 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int money = 1000 - Integer.parseInt(br.readLine());
        int[] coin = new int[]{500, 100, 50, 10, 5, 1};
        int count = 0;

        for(int i = 0; i < coin.length; i++) {
            count += money / coin[i];

            money %= coin[i];
        }

        System.out.println(count);
        br.close();
    }
}
