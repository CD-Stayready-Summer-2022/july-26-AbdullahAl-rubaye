package com.codedifferently;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String howManyLettersDoYouSee(String input) {
        char[] chars = input.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        for (char i : chars) {
            if (map.containsKey(i)) {
                int counter = map.get(i);
                map.put(i, ++counter);
            } else {
                map.put(i, 1);
            }
        }
        return input;
    }
}
