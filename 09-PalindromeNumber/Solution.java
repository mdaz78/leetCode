class Solution {
  // ANSI escape codes for colors
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_RED = "\u001B[31m";

  public boolean isPalindrome(int x) {
    String value = x + "";
    String[] chars = value.split("");

    int i = 0, j = value.length() - 1;

    while (i <= j) {
      if (!chars[i].equals(chars[j])) {
        return false;
      }

      i += 1;
      j -= 1;
    }

    return true;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();

    // Test case 1: Positive palindrome
    int test1 = 121;
    boolean expected1 = true;
    boolean result1 = solution.isPalindrome(test1);
    System.out.println("Test 1: isPalindrome(" + test1 + ") = " + result1 + " (Expected: " + expected1 + ") - "
        + (result1 == expected1 ? ANSI_GREEN + "PASSED" + ANSI_RESET : ANSI_RED + "FAILED" + ANSI_RESET));

    // Test case 2: Negative number
    int test2 = -121;
    boolean expected2 = false;
    boolean result2 = solution.isPalindrome(test2);
    System.out.println("Test 2: isPalindrome(" + test2 + ") = " + result2 + " (Expected: " + expected2 + ") - "
        + (result2 == expected2 ? ANSI_GREEN + "PASSED" + ANSI_RESET : ANSI_RED + "FAILED" + ANSI_RESET));

    // Test case 3: Non-palindrome
    int test3 = 123;
    boolean expected3 = false;
    boolean result3 = solution.isPalindrome(test3);
    System.out.println("Test 3: isPalindrome(" + test3 + ") = " + result3 + " (Expected: " + expected3 + ") - "
        + (result3 == expected3 ? ANSI_GREEN + "PASSED" + ANSI_RESET : ANSI_RED + "FAILED" + ANSI_RESET));

    // Test case 4: Single digit
    int test4 = 7;
    boolean expected4 = true;
    boolean result4 = solution.isPalindrome(test4);
    System.out.println("Test 4: isPalindrome(" + test4 + ") = " + result4 + " (Expected: " + expected4 + ") - "
        + (result4 == expected4 ? ANSI_GREEN + "PASSED" + ANSI_RESET : ANSI_RED + "FAILED" + ANSI_RESET));

    // Test case 5: Zero
    int test5 = 0;
    boolean expected5 = true;
    boolean result5 = solution.isPalindrome(test5);
    System.out.println("Test 5: isPalindrome(" + test5 + ") = " + result5 + " (Expected: " + expected5 + ") - "
        + (result5 == expected5 ? ANSI_GREEN + "PASSED" + ANSI_RESET : ANSI_RED + "FAILED" + ANSI_RESET));

    // Test case 6: Large palindrome
    int test6 = 1221;
    boolean expected6 = true;
    boolean result6 = solution.isPalindrome(test6);
    System.out.println("Test 6: isPalindrome(" + test6 + ") = " + result6 + " (Expected: " + expected6 + ") - "
        + (result6 == expected6 ? ANSI_GREEN + "PASSED" + ANSI_RESET : ANSI_RED + "FAILED" + ANSI_RESET));

    // Test case 7: Large non-palindrome
    int test7 = 1234;
    boolean expected7 = false;
    boolean result7 = solution.isPalindrome(test7);
    System.out.println("Test 7: isPalindrome(" + test7 + ") = " + result7 + " (Expected: " + expected7 + ") - "
        + (result7 == expected7 ? ANSI_GREEN + "PASSED" + ANSI_RESET : ANSI_RED + "FAILED" + ANSI_RESET));

    // Test case 8: Even length palindrome
    int test8 = 1001;
    boolean expected8 = true;
    boolean result8 = solution.isPalindrome(test8);
    System.out.println("Test 8: isPalindrome(" + test8 + ") = " + result8 + " (Expected: " + expected8 + ") - "
        + (result8 == expected8 ? ANSI_GREEN + "PASSED" + ANSI_RESET : ANSI_RED + "FAILED" + ANSI_RESET));

    // Test case 9: Number ending with zero (not palindrome unless it's 0)
    int test9 = 10;
    boolean expected9 = false;
    boolean result9 = solution.isPalindrome(test9);
    System.out.println("Test 9: isPalindrome(" + test9 + ") = " + result9 + " (Expected: " + expected9 + ") - "
        + (result9 == expected9 ? ANSI_GREEN + "PASSED" + ANSI_RESET : ANSI_RED + "FAILED" + ANSI_RESET));

    System.out.println("\nAll test cases completed!");
  }
}
