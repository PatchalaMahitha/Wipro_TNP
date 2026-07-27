package mettl;

class String_2
{
    public class Result
    {
        public final String output1;
        public final String output2;
        public final String output3;

        public Result(String out1, String out2, String out3)
        {
            output1 = out1;
            output2 = out2;
            output3 = out3;
        }
    }

    public Result encodeThreeStrings(String input1, String input2, String input3)
    {
        String[] parts1 = splitString(input1);
        String[] parts2 = splitString(input2);
        String[] parts3 = splitString(input3);

        String output1 = parts1[0] + parts2[0] + parts3[0];
        String output2 = parts1[1] + parts2[1] + parts3[1];
        String output3 = parts1[2] + parts2[2] + parts3[2];

        StringBuilder toggled = new StringBuilder();

        for (char ch : output3.toCharArray())
        {
            if (Character.isUpperCase(ch))
            {
                toggled.append(Character.toLowerCase(ch));
            }
            else
            {
                toggled.append(Character.toUpperCase(ch));
            }
        }

        output3 = toggled.toString();

        return new Result(output1, output2, output3);
    }

    private String[] splitString(String str)
    {
        int n = str.length();
        int base = n / 3;
        int rem = n % 3;

        int front = base;
        int middle = base;
        int end = base;

        if (rem == 1)
        {
            middle++;
        }
        else if (rem == 2)
        {
            front++;
            end++;
        }

        String part1 = str.substring(0, front);
        String part2 = str.substring(front, front + middle);
        String part3 = str.substring(front + middle);

        return new String[] {part1, part2, part3};
    }
}