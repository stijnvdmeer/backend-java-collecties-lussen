import java.util.HashMap;

public class Translator {
    private HashMap<Integer, String> numericAlpha = new HashMap<>();

    public Translator(String[] alphabetic, Integer[] numeric) {
        for (int i = 0; i < alphabetic.length; i++) {
            numericAlpha.put(numeric[i], alphabetic[i]);
        }
    }
    public String translate(int key) {
        if (numericAlpha.containsKey(key)) {
            return numericAlpha.get(key);

        }
        else {
            return null;
        }
    }
}
