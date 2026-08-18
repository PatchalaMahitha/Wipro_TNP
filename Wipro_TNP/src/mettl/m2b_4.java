package mettl;

public class m2b_4 {

    public static int digitRemove_Palin(int input1) {

        String s = Integer.toString(input1);

        // Already a palindrome
        if (isPalindrome(s))
            return -1;

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {

                // Try removing left digit
                String s1 = s.substring(0, left) + s.substring(left + 1);

                if (isPalindrome(s1))
                    return s.charAt(left) - '0';

                // Otherwise remove right digit
                return s.charAt(right) - '0';
            }

            left++;
            right--;
        }

        return -1;
    }

    private static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}