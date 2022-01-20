package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num22864 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int now = 0;
        int result = 0;

        for(int i = 0; i < 24; i++) {
            if(now + A <= M) {
                now += A;
                result += B;
            } else {
                now -= C;
            }
            if(now < 0) {
                now = 0;
            }
        }
        System.out.println(result);

        br.close();
    }
}
