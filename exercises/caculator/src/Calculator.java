import java.util.Stack;
public class Calculator {
    public static int calculate(String s) {

	    if(s.isEmpty()) return 0;

        Stack<Integer> stack = new Stack<>();
        int num=0;
        char sign ='+';
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                num = num*10+s.charAt(i)-'0';
            }

            if(!Character.isDigit(s.charAt(i))||i==s.length()-1){
                if(sign=='+'){
                    stack.push(num);
                }
                else if(sign=='-'){
                    stack.push(-num);
                }
                else if(sign=='*'){
                    stack.push(stack.pop()*num);
                }
                sign = s.charAt(i);
                num=0;
            }
        }

        int result =0;
        for(int i: stack){
            result+=i;
        }
        return result;
    }
}
