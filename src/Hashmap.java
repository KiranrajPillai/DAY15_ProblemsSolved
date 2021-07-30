import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        String sentence = "To be or not to be";
        String[] word = sentence.split(" ");
        int size = word.length;
        int i = 0;
        while (i != size) {

            if (map.containsKey(word[i]) == false) {
                map.put(word[i], 1);
            } else {
                int oldValue = map.get(word[i]);
                int newValue = oldValue + 1;
                map.put(word[i], newValue);
            }
            i++;
        }
        System.out.println(map);
    }
}