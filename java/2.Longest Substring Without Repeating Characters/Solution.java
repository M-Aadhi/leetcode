public class Solution {

  public int lengthOfLongestSubstring(String s) {
    // To store the result
    int ans = 0;
    
    // Create a count array to store the frequency of characters in the window
    int[] count = new int[128]; // ASCII has 128 characters
    
    // Two pointers to represent the sliding window
    for (int l = 0, r = 0; r < s.length(); ++r) {
      // Increment the count of the current character
      ++count[s.charAt(r)];
      
      // If the current character occurs more than once, we move the left pointer (l)
      while (count[s.charAt(r)] > 1) {
        // Decrease the count of the character at left pointer and move the pointer
        --count[s.charAt(l++)];
      }
      
      // Update the maximum length of the substring found so far
      ans = Math.max(ans, r - l + 1);
    }
    
    // Return the result
    return ans;
  }

  // Helper method for testing the solution
  public static void main(String[] args) {
    Solution solution = new Solution();
    String input = "abcabcbb";
    
    // Test case 1
    int result1 = solution.lengthOfLongestSubstring(input);
    System.out.println("Length of longest substring without repeating characters: " + result1); // Expected output: 3 ("abc")
    
    // Test case 2
    input = "bbbbb";
    int result2 = solution.lengthOfLongestSubstring(input);
    System.out.println("Length of longest substring without repeating characters: " + result2); // Expected output: 1 ("b")
    
    // Test case 3
    input = "pwwkew";
    int result3 = solution.lengthOfLongestSubstring(input);
    System.out.println("Length of longest substring without repeating characters: " + result3); // Expected output: 3 ("wke")
    
    // Test case 4
    input = "";
    int result4 = solution.lengthOfLongestSubstring(input);
    System.out.println("Length of longest substring without repeating characters: " + result4); // Expected output: 0 (empty string)
  }
}
