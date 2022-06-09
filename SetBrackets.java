
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class SetBrackets {
    public static void main(String[] args) {
        String s = "(){}({})";
        Stack<Character> stack=new Stack();
        if(s.length()==0) {
            System.out.println(false);
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(stack.isEmpty()) stack.push(c);
            else if((stack.peek()=='['&& c==']') || (stack.peek()=='('&& c==')')
                    || (stack.peek()=='{'&& c=='}')){
                stack.pop();
            }
            else stack.push(c);
        }
        System.out.println(stack.isEmpty());
    }
}

