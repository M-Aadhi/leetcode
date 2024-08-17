# Longest Substring Without Repeating Characters

## Problem Description:
The program aims to find the length of the longest substring without repeating characters in a given string. It uses the sliding window technique and a frequency array to efficiently track the presence of characters.

## Steps:

1. **Input:** The program takes a string as input.

2. **Initialize Count Array:** A frequency array of size 128 is created to represent the count of ASCII characters in the current window.

3. **Loop through String:** 
    - The program uses two pointers, `l` (left) and `r` (right), to represent the sliding window.
    - It iterates through the string with the `r` pointer.
    - For each character at position `r`, the program increments the count of the character in the frequency array.

4. **Handle Duplicates:** 
    - If a character occurs more than once in the window (i.e., its count exceeds 1), the `l` pointer is moved to shrink the window by decrementing the count of characters at the `l` pointer until the character count becomes 1.

5. **Update Maximum Length:** 
    - The program calculates the length of the current window (substring) as `r - l + 1` and updates the maximum length found so far.

6. **Return Result:** 
    - After processing the entire string, the program returns the maximum length of the substring without repeating characters.

## Example Code Explanation:

Let’s say you have a string `s = "abcabcbb"`.

1. The program starts with both `l` and `r` at the beginning of the string.

2. At index 0, character `'a'` is added to the window, and the maximum length is updated to 1.

3. Similarly, `'b'` at index 1 and `'c'` at index 2 are added to the window, and the length is updated to 3.

4. At index 3, character `'a'` repeats. The program moves the left pointer `l` from 0 to 1 to exclude the first `'a'`, shrinking the window.

5. This process continues until the entire string is processed.

6. The longest substring without repeating characters in this case is `"abc"` with a length of 3.

## Example Usage:

```java
public static void main(String[] args) {
    Solution solution = new Solution();
    String s = "abcabcbb";
    int result = solution.lengthOfLongestSubstring(s);
    System.out.println("Length of longest substring without repeating characters: " + result);
}
