package StringQuestions;

public class Palindrome {
    public static void main(String[] args) {
        String string="madam";
        char[] chars = string.toCharArray();
        boolean isPalindrome=false;
        int j=chars.length-1;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]==chars[j])
            {
                isPalindrome=true;
                if(i==j)
                    break;
                j-=1;
                continue;
            }
            break;
        }


    }
}
