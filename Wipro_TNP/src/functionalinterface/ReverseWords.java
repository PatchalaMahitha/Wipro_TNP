package functionalinterface;

import java.util.*;
import java.util.function.Consumer;

public class ReverseWords {

    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>(
                Arrays.asList("Java","Python","C","HTML","Spring",
                        "Oracle","React","Node","CSS","SQL"));

        Consumer<ArrayList<String>> c=list->{

            for(int i=0;i<list.size();i++)
                list.set(i,new StringBuilder(list.get(i)).reverse().toString());
        };

        c.accept(words);

        System.out.println(words);
    }
}