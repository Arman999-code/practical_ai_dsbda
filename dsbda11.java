import java.util.*;

public class WordCount {
    public static void main(String[] args) {

        String text = "hello hadoop hello world";
        String[] words = text.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        System.out.println(map);
    }
}
