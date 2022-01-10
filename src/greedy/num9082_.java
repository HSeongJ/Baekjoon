package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class num9082_ {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while(T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] num = new int[N];
            char[] bomb = new char[N];
            int sum = 0;
            
            String num_str = br.readLine();
            String bomb_str = br.readLine();

            for (int i = 0; i < N; i++) {
                num[i] = num_str.charAt(i) - '0';
                bomb[i] = bomb_str.charAt(i);
            }

            while (true) {
                boolean check = true;

                for (int i = 0; i < N; i++) {
                    int count1 = 0; //Check #
                    int count2 = 0; //Check *
                    for (int j = -1; j < 2; j++) {
                        try {
                            if (bomb[i + j] == '#') {
                                count1++;
                            }
                            if (bomb[i + j] == '*') {
                                count2++;
                            }
                        } catch (Exception e) {
                        }
                    } //end(check count1)

                    if (num[i] - count2 == 0) {
                        for (int j = -1; j < 2; j++) {
                            try {
                                if (bomb[i + j] == '#') {
                                    bomb[i + j] = 'X';
                                }
                            } catch (Exception e) {}
                        }//end(num[i] == count1)

                    } else if (num[i] - count2 == count1) {
                        for (int j = -1; j < 2; j++) {
                            try {
                                if (bomb[i + j] == '#') {
                                    bomb[i + j] = '*';
                                }
                            } catch (Exception e) {}
                        } //end(num[i] == count1)
                    }
                } //end for(i)

                for (int i = 0; i < N; i++) {
                    if (bomb[i] == '#') {
                        check = false;
                        break;
                    }
                }

                if (check) {
                    for(int i = 0; i < N; i++) {
                        if(bomb[i] == '*') {
                            sum++;
                        }
                    }
                    System.out.println(sum);
                    break;
                }
            }
        }
        br.close();
    }
}
