/*

Write a function that reverses characters in (possibly nested) parentheses in the input string.

Input strings will always be well-formed with matching ()s.

Example

For inputString = "(bar)", the output should be
solution(inputString) = "rab";
For inputString = "foo(bar)baz", the output should be
solution(inputString) = "foorabbaz";
For inputString = "foo(bar)baz(blim)", the output should be
solution(inputString) = "foorabbazmilb";
For inputString = "foo(bar(baz))blim", the output should be
solution(inputString) = "foobazrabblim".
Because "foo(bar(baz))blim" becomes "foo(barzab)blim" and then "foobazrabblim"

*/

package com.codesignal.com;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _013_ReverseInParentheses {
    public static void main(String[] args) {
        _013_ReverseInParentheses obj = new _013_ReverseInParentheses();

        TestUtils.testCase(obj::solution, "(bar)", "rab", 1);
        TestUtils.testCase(obj::solution, "foo(bar)baz", "foorabbaz", 2);
        TestUtils.testCase(obj::solution, "foo(bar)baz(blim)", "foorabbazmilb", 3);
        TestUtils.testCase(obj::solution, "foo(bar(baz))blim", "foobazrabblim", 4);
        TestUtils.testCase(obj::solution, "", "", 5);
        TestUtils.testCase(obj::solution, "()", "", 6);
        TestUtils.testCase(obj::solution, "(abc)d(efg)", "cbadgfe", 7);

        TestUtils.printSummary();
    }

    private String solution(String s) {
        if (s.indexOf('(') >= 0) {
            return solution(s.substring(0, s.lastIndexOf('(')) + new StringBuffer(s.substring(s.lastIndexOf('(') + 1, s.indexOf(')', s.lastIndexOf('(') + 1))).reverse() + s.substring(s.indexOf(')', s.lastIndexOf('(') + 1) + 1));
        }
        return s;
    }

    String solution4(String inputString) {
        System.out.println(inputString);
        int start = inputString.lastIndexOf("(");
        int end = inputString.indexOf(")", start);
        if (start == -1 || end == -1 || start > end)
            return inputString;
        return solution(inputString.substring(0, start) +
                new StringBuilder(inputString.substring(start + 1, end))
                        .reverse()
                + inputString.substring(end + 1));
    }

    String solution3(String inputString) {
        // Stack to manage the current string part
        Deque<StringBuilder> stack = new ArrayDeque<>();
        stack.push(new StringBuilder());

        inputString.chars().mapToObj(c -> (char) c).forEach(c -> {
            if (c == '(') {
                // Push a new StringBuilder for the new segment inside parentheses
                stack.push(new StringBuilder());
            } else if (c == ')') {
                // Pop the current segment, reverse it, and append it to the previous one
                StringBuilder reversed = stack.pop().reverse();
                stack.peek().append(reversed);
            } else {
                // Append the current character to the latest segment
                stack.peek().append(c);
            }
        });

        // Return the fully constructed string from the stack
        return stack.pop().toString();
    }

    String solution2(String inputString) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder current = new StringBuilder();
        for (char c : inputString.toCharArray()) {
            if (c == '(') {
                // Push the current string onto the stack and start a new one
                stack.push(current);
                current = new StringBuilder();
            } else if (c == ')') {
                // Reverse the current string
                current.reverse();
                // Pop the last string from the stack and append the reversed string
                current = stack.pop().append(current);
            } else {
                // Otherwise, keep building the current string
                current.append(c);
            }
        }
        return current.toString();
    }

    String solution5(String inputString) {
        List<StringBuffer> list = new ArrayList<>();
        StringBuffer temp = new StringBuffer();

        for (char c : inputString.toCharArray()) {
            if (c == '(') {
                list.add(temp);  // Store the current segment before the '('
                temp = new StringBuffer();  // Reset the temp buffer
            } else if (c == ')') {
                temp.reverse();  // Reverse the current segment inside the parentheses
                StringBuffer last = list.remove(list.size() - 1);  // Get the last segment before the '('
                temp = last.append(temp);  // Append the reversed segment to the previous one
            } else {
                temp.append(c);  // Build the current segment
            }
        }

        // No need to join because temp already contains the full string
        return temp.toString();
    }
}
