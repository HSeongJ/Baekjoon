package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num9082 {
    static int count1;
    static int count2;

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] num = new int[N];
            char[] bomb = new char[N];
            int result = 0;
            String num_str = br.readLine();
            String bomb_str = br.readLine();

            for (int i = 0; i < N; i++) {
                num[i] = num_str.charAt(i) - '0';
                bomb[i] = bomb_str.charAt(i);
                if(bomb[i] == '*') result++;
            }


        }

        br.close();
    }

    public static void checkCh(char ch) {
        if(ch == '#') {
            count1++;
        } else if(ch == '*') {
            count2++;
        }
    }
}
