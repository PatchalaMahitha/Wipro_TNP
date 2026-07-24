package mettl;

public class string_1 {

    public int findStringCode(String input1) {

        String[] words = input1.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {

            int sum = 0;
            int left = 0;
            int right = word.length() - 1;

            while (left <= right) {

                int leftValue =
                    Character.toUpperCase(word.charAt(left)) - 'A' + 1;

                int rightValue =
                    Character.toUpperCase(word.charAt(right)) - 'A' + 1;

                if (left == right) {
                    // Middle character
                    sum += leftValue;
                } else {
                    // Absolute difference between first-last,
                    // second-penultimate, etc.
                    sum += Math.abs(leftValue - rightValue);
                }

                left++;
                right--;
            }

            result.append(sum);
        }

        return Integer.parseInt(result.toString());
    }
}