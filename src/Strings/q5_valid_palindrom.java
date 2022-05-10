package Strings;

//https://leetcode.com/problems/valid-palindrome-ii/

//Example 1:
//
//        Input: s = "aba"
//        Output: true
//        Example 2:
//
//        Input: s = "abca"
//        Output: true
//        Explanation: You could delete the character 'c'.

public class q5_valid_palindrom {

    public static void main(String[] args) {

    }
    private static boolean checkPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            // Found a mismatched pair - try both deletions
            if (s.charAt(i) != s.charAt(j)) {
                return (checkPalindrome(s, i, j - 1) || checkPalindrome(s, i + 1, j));
            }
            i++;
            j--;
        }

        return true;
    }
}
