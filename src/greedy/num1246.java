package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num1246 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] P = new int[M];
        int[] cost = new int[M];
        int idx = 0;

        for(int i = 0; i < M; i++) {
            P[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(P);

        for(int i = 0; i < M; i++) {
            for(int j = 0; j < M; j++) {
                if(P[i] <= P[j]) {
                    cost[i] += P[i];
                }
                if(cost[i] == P[i] * N) {
                    break;
                }
            }
            if(cost[i] > cost[idx]) {
                idx = i;
            }
        }

        System.out.println(P[idx] + " " + cost[idx]);
        br.close();
    }
}
