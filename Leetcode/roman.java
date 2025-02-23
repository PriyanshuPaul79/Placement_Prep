import java.util.HashMap;
import java.util.Map;

public class sol3 {
    public int romanToInt(String s) {
        Map<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);

        int result = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            int currentValue = romanToIntMap.get(s.charAt(i));
            int nextValue = (i + 1 < n) ? romanToIntMap.get(s.charAt(i + 1)) : 0;

            if (currentValue < nextValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    }
}
