import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    static Set<Character> first = new HashSet<>();
    static Set<Character> second = new HashSet<>();
    static Set<Character> third = new HashSet<>();

    static {
        first.add('q');
        first.add('w');
        first.add('e');
        first.add('r');
        first.add('t');
        first.add('y');
        first.add('u');
        first.add('i');
        first.add('o');
        first.add('p');

        second.add('a');
        second.add('s');
        second.add('d');
        second.add('f');
        second.add('g');
        second.add('h');
        second.add('j');
        second.add('k');
        second.add('l');

        third.add('z');
        third.add('x');
        third.add('c');
        third.add('v');
        third.add('b');
        third.add('n');
        third.add('m');
    }

    public String[] findWords(String[] words) {

        List<String> list = new ArrayList<>();

        for (String word : words) {

            Set<Character> line;
            boolean flag = true;
            char[] arr = word.toLowerCase().toCharArray();

            if (first.contains(arr[0])) line = first;
            else if (second.contains(arr[0])) line = second;
            else line = third;

            for (char c : arr)
                if (!line.contains(c)) {
                    flag = false;
                    break;
                }

            if (flag) list.add(word);
        }

        String[] ans = new String[list.size()];

        return list.toArray(ans);
    }
}