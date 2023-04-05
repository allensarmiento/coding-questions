package com.allensarmiento.codingquestions.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class URLifyTest {
    @Test
    void urlifyCorrectly() {
        assertEquals(
                URLify.replaceSpaces("Mr John Smith    ", 13),
                "Mr%20John%20Smith"
        );

        assertEquals(
                URLify.replaceSpaces("Test one two three      ", 18),
                "Test%20one%20two%20three"
        );
    }
}
