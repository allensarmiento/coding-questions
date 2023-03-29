package com.allensarmiento.codingquestions.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PermutationCheckerTest {
    @Test
    void isValidPermutation() {
        assertTrue(PermutationChecker.isPermutation("abc", "cba"));
        assertTrue(PermutationChecker.isPermutation("abcdef", "dfceba"));
    }

    @Test
    void isNotValidPermutation() {
        assertFalse(PermutationChecker.isPermutation("abc", "def"));
        assertFalse(PermutationChecker.isPermutation("abcdef", ""));
        assertFalse(PermutationChecker.isPermutation("", "abcdef"));
        assertFalse(PermutationChecker.isPermutation("abcdef", "ghijkl"));
    }
}
