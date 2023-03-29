package com.allensarmiento.codingquestions.util;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.HashMap;
import java.util.Map;

public class UniqueCharacterChecker {
    public static boolean doesStringContainAllUniqueCharacters(String str) {
        Map<Character, Boolean> map = new HashMap();

        CharacterIterator iterator = new StringCharacterIterator(str);

        while (iterator.current() != CharacterIterator.DONE) {
            if (map.containsKey(iterator.current())) {
                return false;
            }
            map.put(iterator.current(), true);
            iterator.next();
        }

        return true;
    }
}
