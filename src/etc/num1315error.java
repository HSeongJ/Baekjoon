package etc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class num1315error {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int p_Str = 1;
        int p_Int = 1;
        int p_Pnt = 0;
        int count = 0;
        ArrayList<Integer> STR = new ArrayList<>();
        ArrayList<Integer> INT = new ArrayList<>();
        ArrayList<Integer> PNT = new ArrayList<>();


        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            STR.add(Integer.parseInt(st.nextToken()));
            INT.add(Integer.parseInt(st.nextToken()));
            PNT.add(Integer.parseInt(st.nextToken()));
        }

        while(true) {
            int idx = -1;
            int need_Pnt = Integer.MAX_VALUE;
            for(int i = 0; i < STR.size(); i++) {
                //스텟이 크거나 작을경우 -> 퀘스트 가능한 경우
                if(p_Str >= STR.get(i) || p_Int >= INT.get(i)) {
                    idx = i;
                    break;
                }
                //현재 스탯과 필요스탯의 차가 가장 작은 인덱스 찾기
                if(need_Pnt > STR.get(i) - p_Str) {
                    idx = i;
                    need_Pnt = STR.get(i) - p_Str;
                }
                if(need_Pnt > INT.get(i) - p_Int) {
                    idx = i;
                    need_Pnt = INT.get(i) - p_Int;
                }
                /*
                if(need_Pnt > (STR.get(i) + INT.get(i)) - (p_Str + p_Int)) {
                    idx = i;
                    need_Pnt = (STR.get(i) + INT.get(i)) - (p_Str + p_Int);
                }*/
            }

            //수행 가능 시 포인트 획득
            if(idx == -1) {
                break;
            } else if(p_Str >= STR.get(idx) || p_Int >= INT.get(idx)) {
                //작은 경우
                p_Pnt += PNT.get(idx);

                STR.remove(idx);
                INT.remove(idx);
                PNT.remove(idx);
                count++;
            } else if(need_Pnt > p_Pnt) {
                break;
            } else if(need_Pnt == STR.get(idx) - p_Str) {
                p_Pnt -= need_Pnt;
                p_Pnt += PNT.get(idx);

                p_Str += need_Pnt;

                STR.remove(idx);
                INT.remove(idx);
                PNT.remove(idx);
                count++;
            } else if(need_Pnt == INT.get(idx) - p_Int) {
                p_Pnt -= need_Pnt;
                p_Pnt += PNT.get(idx);

                p_Int += need_Pnt;

                STR.remove(idx);
                INT.remove(idx);
                PNT.remove(idx);
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}
