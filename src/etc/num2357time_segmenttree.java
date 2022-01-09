package etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class num2357time_segmenttree {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] N = new int[Integer.parseInt(st.nextToken())];
        int M = Integer.parseInt(st.nextToken());
        int[] start = new int[M];
        int[] end = new int[M];
        int[] max = new int[M];
        int[] min = new int[M];
        Arrays.fill(max, 0);
        Arrays.fill(min, 1000000001);

        for (int i = 0; i < N.length; i++) {
            N[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            start[i] = Integer.parseInt(st.nextToken());
            end[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            for (int j = start[i]-1; j <= end[i]-1; j++) {
                if (max[i] < N[j]) {
                    max[i] = N[j];
                }
                if (min[i] > N[j]) {
                    min[i] = N[j];
                }
            }
            sb.append(min[i] + " " + max[i] + "\n");
        }

        System.out.println(sb);
        br.close();
    }
}
