package bruteforce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class num1527 {
    public static void main(String[] args) throws Exception{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int count = 0;

        for(int i = A; i <= B; i++) {
            int tmp = i;
            int nam = 0;
            boolean geummin = true;

            while(true) {
                nam = tmp % 10;

                if(!(nam == 4 || nam == 7)) {
                    geummin = false;
                    break;
                }

                tmp /= 10;

                if(tmp == 0) {
                    break;
                }
            }

            if(geummin) {
                count++;
            }
        }

        bw.write(count + "\n");

        br.close();
        bw.flush();
        bw.close();
    }
}
