package greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

class Jewel implements Comparable<Jewel>{
    int weight;
    int price;

    public Jewel(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }

    @Override
    public int compareTo(Jewel o) {
        return this.weight - o.weight;
    }
}

public class num1202 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        long result = 0;

        ArrayList<Jewel> ary = new ArrayList<>();
        Integer[] bag = new Integer[K];

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            ary.add(new Jewel(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        for(int i = 0; i < K; i++) {
            bag[i] = Integer.parseInt(br.readLine());
        }

        Collections.sort(ary);
        Arrays.sort(bag);

        PriorityQueue<Jewel> pq = new PriorityQueue<>(((o1, o2) -> o2.price - o1.price));

        int temp = 0;
        for(int i=0; i<K; i++) {
            for(int j=temp; j<N; j++) { // 시간초과가 나는 부분
                if(ary.get(j).weight <= bag[i]) {
                    pq.offer(ary.get(j));
                    temp++;
                } else {
                    break;
                }
            }
            if(!pq.isEmpty()) {
                result += pq.poll().price;
            }
        }

        bw.write(result + "\n");

        br.close();

        bw.flush();
        bw.close();
    }
}
