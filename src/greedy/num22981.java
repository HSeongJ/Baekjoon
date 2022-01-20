package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num22981 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        long K = Long.parseLong(st.nextToken());
        long[] speed = new long[N];

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            speed[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(speed);

        long result = Long.MAX_VALUE;
        for(int i = 0; i < speed.length - 1; i++) {
            long tmp;
            tmp = (speed[0] * (i + 1)) + (speed[i + 1] * (speed.length - (i + 1)));
            if(result > (long)Math.ceil((double) K / tmp)) {
                result = (long)Math.ceil((double) K / tmp);
            }
        }

        System.out.println(result);
        br.close();
    }
}
