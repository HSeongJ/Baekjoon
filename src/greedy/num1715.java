package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class num1715 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i = 0; i < N; i++) {
            queue.offer(Integer.parseInt(br.readLine()));
        }

        while(true) {
            if(queue.size() == 1) {
                break;
            }

            int num1 = queue.poll();
            int num2 = queue.poll();
            sum += num1 + num2;
            queue.offer(num1 + num2);
        }

        System.out.println(sum);

        br.close();
    }
}
