package com.brocode.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int longestConsecutiveA(String s) {
        int count = 0;
        int min = 0; // Updated variable to capture the presence of 'A'
        Queue<Character> queue = new LinkedList<>();

        for (char c : s.toCharArray()) {
            queue.offer(c);
            if (c == 'A') {
                min = 1; // Set min to 1 if 'A' is encountered
            }
        }

        while (!queue.isEmpty()) {
            if (queue.peek() == 'A') {
                count++;
            } else {
                count = 0;
            }
            queue.poll();
        }

        return Math.max(count, min);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.longestConsecutiveA("ABAAABBBAAA")); // Output: 3
        System.out.println(solution.longestConsecutiveA("BABAABABBB")); // Output: 1
    }
}
