import java.util.HashMap;

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Hello Zubair";
        HashMap<Character, Integer> charMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ') {
                charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
            }
        }
        
        System.out.println("Character Count: " + charMap);
    }
}

