package StringQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Stack
{
    private char[] chars;
    private int capacityOfStack;
    private int N=0;
    Stack(int capacityOfStack)
    {
        this.capacityOfStack=capacityOfStack;
        chars=new char[this.capacityOfStack];
    }

    //push
    public void push(char c)
    {
        chars[N++]=c;
    }

    //pop
    public void pop()
    {
         N=N-1;
    }

    //isEmpty
    public boolean isEmpty()
    {
        return N==0 ? true :false;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

}
public class BalanceParanthesisString {
    public static void main(String[] args) {
        String str="()))))";
        Stack stack=new Stack(10);
        char[] chars = str.toCharArray();
        int count=0;
        for (int i = 0; i < chars.length; i++) {

            if(chars[i]=='(')
                stack.push('(');
            else
            {
                if(stack.isEmpty())
                {
                    count++;
                    continue;
                }
                stack.pop();
            }
        }
        count=count+ (stack.getN());
        System.out.println(count);
    }
}
