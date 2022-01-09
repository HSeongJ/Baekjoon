package etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class num1492time {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        BigInteger result = new BigInteger("0");
        BigInteger mod = new BigInteger("1000000007");

        for(int i = 1; i <= N; i++) {
            BigInteger tmp = new BigInteger(String.valueOf(i));
            tmp = tmp.pow(K);
            result = result.add(tmp);
        }

        System.out.println(result.remainder(mod));

        br.close();
    }
}
