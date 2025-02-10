package src;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        String longestPalindrome = "";
        for (int i=0; i<s.length(); i++) {
            String s1 = palindrome(s, i, i);
            String s2 = palindrome(s, i, i+1);
            longestPalindrome = longestPalindrome.length() > s1.length() ? longestPalindrome : s1;
            longestPalindrome = longestPalindrome.length() > s2.length() ? longestPalindrome : s2;
        }
        return longestPalindrome;
    }

    // find the longest palindrome given a string and left index l and right index r
    String palindrome(String s, int l, int r) {
        while (l >= 0 && r < s.length()
                && s.charAt(l) == s.charAt(r)) {
            l--; r++;
        }
        return s.substring(l + 1, r);
    }
}
