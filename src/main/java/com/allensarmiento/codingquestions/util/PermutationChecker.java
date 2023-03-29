package com.allensarmiento.codingquestions.util;

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Given two strings, write a method to decide if one is a permutation of the other.
public class PermutationChecker {
    public static boolean isPermutation(String s1, String s2) {
        Map<Character, Integer> s1Mapping = generateLetterMapping(s1);
        Map<Character, Integer> s2Mapping = generateLetterMapping(s2);

        if (s1Mapping.size() != s2Mapping.size()) {
            return false;
        }

        Iterator<Map.Entry<Character, Integer>> iterator = s1Mapping.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();

            boolean containsKey = s2Mapping.containsKey(entry.getKey());
            boolean hasSameValue = s2Mapping.get(entry.getKey()) == entry.getValue();
            if (!containsKey || !hasSameValue) {
                return false;
            }
        }

        return true;
    }

    private static Map<Character, Integer> generateLetterMapping(String str) {
        Map<Character, Integer> letterMapping = new HashMap<>();

        CharacterIterator characterIterator = new StringCharacterIterator(str);
        while (characterIterator.current() != CharacterIterator.DONE) {
            letterMapping.merge(characterIterator.current(), 1, (v1, v2) -> v1 + 1);
            characterIterator.next();
        }

        return letterMapping;
    }
}
