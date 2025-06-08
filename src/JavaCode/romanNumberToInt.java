package JavaCode;

import java.util.HashMap;
//Leetcode #13 -> Roman Numerik into Arab Numerik
public class romanNumberToInt {
    public static void main(String[] args) {
        String _14_ = "XIV";
        String _58_ = "LVIII";
        String _1994_ = "MCMXCIV";
        System.out.println(romanToInt(_14_));
        System.out.println(romanToInt(_58_));
        System.out.println(romanToInt(_1994_));
    }

    //Solution
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        if (s.length() > 1) {
            for (int i = s.length() - 1; i > 0; i--) {
                int current = map.get(s.charAt(i));
                if (map.get(s.charAt(i - 1)) < current) {
                    current = current - map.get(s.charAt(i - 1));
                    i = i - 1;
                }
                result = result + current;
            }
            if (map.get(s.charAt(0)) < map.get(s.charAt(1))) {
                return result;
            } else {
                result = result + map.get(s.charAt(0));
            }
            return result;
        } else {
            return map.get(s.charAt(0));
        }
    }
}