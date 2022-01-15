package greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class num16120 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        Stack<Character> stack = new Stack<>();
        String result = null;

        StringBuilder sb;

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if((stack.size() <= 1 || i == str.length()-1) && ch == 'A') {
                result = "NP";
                break;
            } else if(ch == 'A'){
                sb = new StringBuilder();
                sb.append(stack.pop());
                sb.append(stack.pop());
                sb.append(ch);
                sb.append(str.charAt(i + 1));
                if(sb.toString().equals("PPAP")) {
                    stack.push('P');
                    i++;
                } else {
                    result = "NP";
                    break;
                }
            } else {
                stack.push(ch);
            }
        }

        if(stack.size() == 1 && stack.peek() == 'P' && result == null) {
            result = "PPAP";
        } else {
            result = "NP";
        }

        System.out.println(result);
        br.close();
    }
}
