package com.example;

import static org.junit.Assert.*;

import org.junit.Test;



public class PalindromeTest{

    /* Sanity - mainline - Regresstion Test 1 - matcH */

	@Test
    public void testWordInString() {
        String sentence = "hello world";
        assertTrue(sentence.contains("hello"));
    }
    /* Sanity - mainline - Regresstion Test 2 - miss */

    @Test
    public void testWordNotInString() {
        String sentence = "hello world";
        assertFalse(sentence.contains("cat"));
    }
    /* Corner case Test 1 - Empty */

    @Test
    public void testWordInEmptyString() {
        String sentence = "";
        assertFalse(sentence.contains("hei"));
    }
    /* Corner case Test 1 - Empty */

    @Test
    public void testWordInStringCaseInsensitive() {
        String sentence = "hello world";
        assertTrue(sentence.toLowerCase().contains("Hello"));
    }
       /* Corner case Test 1 - Empty */
 
    @Test
    public void testWordWithSpecialCharacters() {
        String sentence = "hello world";
        assertTrue(sentence.contains("$hello"));
    }
}
