package com.allensarmiento.codingquestions.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UniqueCharacterCheckerTest {
    @Test
    void containsAllUniqueCharacters() {
        assertTrue(UniqueCharacterChecker.doesStringContainAllUniqueCharacters("abc"));
        assertTrue(UniqueCharacterChecker.doesStringContainAllUniqueCharacters("abcdef"));
    }

    @Test
    void doesNotContainAllUniqueCharacters() {
        assertFalse(UniqueCharacterChecker.doesStringContainAllUniqueCharacters("aabc"));
        assertFalse(UniqueCharacterChecker.doesStringContainAllUniqueCharacters("aaa"));
    }
}
