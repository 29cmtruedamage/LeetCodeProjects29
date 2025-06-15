package JavaCode;
import java.util.Stack;


public class ValidParanthesis {
    public static void main(String[] args){
        String t1 = "()";       // -> true
        String t2 = "()[]{}";   // -> true
        String t3 = "(]";       // -> false
        String t4 = "([])";     // -> true

        System.out.println(isValid(t1) + "\n" + isValid(t2)
                + "\n" + isValid(t3) + "\n" + isValid(t4));
    }


    //Solution -> LeetCode #20
    static boolean isValid(String s) {
        if(s.length() < 2){
            return false;
        }

        Stack<String> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            String x = Character.toString(s.charAt(i));
            if(x.equals("(") || x.equals("{") || x.equals("[")){
                stack.push(x);
            }else{
                if(stack.empty()){ return false;}
                String y = stack.pop();
                if(x.equals(")") && !y.equals("(") ||
                        x.equals("}") && !y.equals("{") ||
                        x.equals("]") && !y.equals("[")   ){
                    return false;
                }

            }
        }
        return stack.empty();

    }
}
