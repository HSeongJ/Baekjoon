import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Test {
    public static void main(String[] args) throws Exception{

        ArrayList<Integer> ary = new ArrayList<>();
        ArrayList<Integer> ary2 = new ArrayList<>();

        ary.add(10);

        ary2 = (ArrayList<Integer>) ary.clone();
        ary.add(20);
        ary.add(30);
        System.out.println(ary2.toString());
    }
}