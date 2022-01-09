package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num1343 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();

        S = S.replaceAll("XXXX", "AAAA");
        S = S.replaceAll("XX","BB");

        if(S.contains("X")) {
            System.out.println(-1);
        } else {
            System.out.println(S);
        }

        br.close();
    }
}
