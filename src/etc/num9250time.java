package etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num9250time {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String[] S = new String[N];

        for(int i = 0; i < N; i++) {
            S[i] = br.readLine();
        }

        int q_N = Integer.parseInt(br.readLine());
        String[] Q = new String[q_N];

        for(int i = 0; i < q_N; i++) {
            Q[i] = br.readLine();
        }

        for(int i = 0; i < q_N; i++) {
            for(int j = 0; j < N; j++) {
                if(Q[i].contains(S[j])) {
                    sb.append("YES\n");
                    break;
                }

                if(j == N-1) {
                    sb.append("NO\n");
                }
            }
        }

        System.out.println(sb.toString());
        br.close();
    }
}
