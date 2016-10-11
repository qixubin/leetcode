package _32;

import java.util.Stack;

/**
 * Created by qixubin on 2016/5/23.
 *
 * Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

 For "(()", the longest valid parentheses substring is "()", which has length = 2.

 Another example is ")()())", where the longest valid parentheses substring is "()()", which has length = 4.

 */
public class Solution {

    public int longestValidParentheses(String s) {
        int max=0,start=0;
        Stack<Integer> stack=new Stack();
        int[] a=new int[s.length()];
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]=='(')
                stack.push(i);
            else if(!stack.empty()){
                start=stack.pop();
                a[i]=i-start+1;
                if(start>1)
                    a[i]+=a[start-1];
                max=Math.max(max,a[i]);
            }
        }
        return max;
    }


    public static void main(String[] argv){
        //System.out.println("abc".substring(2,1));

        Solution s1 = new Solution();
        int max = s1.longestValidParentheses("(()()()");
        System.out.println(max);
    }

}
