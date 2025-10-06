import java.util.Queue;
import java.util.*;
public class Duplicateremoval {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("azxxzy"));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        StringBuilder na=new StringBuilder();
        for(char ch:s.toCharArray())
        {
            if(!stack.isEmpty() && stack.peek()==ch)
            {
                stack.pop();
            }
            else{
                stack.push(ch);
            }
        }
       while(!stack.isEmpty())
       {
           na.append(stack.pop());
       }
       return na.reverse().toString();
    }
}
