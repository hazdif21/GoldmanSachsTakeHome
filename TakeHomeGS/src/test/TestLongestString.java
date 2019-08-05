package test;

import main.java.LongestString;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TestLongestString {

    //tests that correct output is given when input is a string of lowercase characters
    @Test
    public void testGetLongestStringAndCountForLowercaseString() {
        String sentence = "the longest word in this string is waterpalooza";
        Map.Entry<String, Integer> result = LongestString.getLongestWordAndCount(sentence);
        String actualLongestWord = result.getKey();
        int actualWordLength = result.getValue();
        Assert.assertEquals("waterpalooza", actualLongestWord);
        Assert.assertEquals(12, actualWordLength);
    }

    //tests that correct output is given when input is a string of uppercase characters
    @Test
    public void testGetLongestStringAndCountForUppercaseString() {
        String sentence = "THE LONGEST WORD IN THIS STRING IS UPPERCASE";
        Map.Entry<String, Integer> result = LongestString.getLongestWordAndCount(sentence);
        String actualLongestWord = result.getKey();
        int actualWordLength = result.getValue();
        Assert.assertEquals("uppercase", actualLongestWord);
        Assert.assertEquals(9, actualWordLength);
    }

    //tests that correct output is given when input is a string of lowercase and uppercase characters
    @Test
    public void testGetLongestStringAndCountForMixedCaseString() {
        String sentence = "the LongEst worD in ThIs StrInG is MiXeDCasE";
        Map.Entry<String, Integer> result = LongestString.getLongestWordAndCount(sentence);
        String actualLongestWord = result.getKey();
        int actualWordLength = result.getValue();
        Assert.assertEquals("mixedcase", actualLongestWord);
        Assert.assertEquals(9, actualWordLength);
    }

    //tests that correct output is given when input is a empty string
    @Test
    public void testGetLongestStringAndCountForEmptyString() {
        String sentence = "";
        Map.Entry<String, Integer> result = LongestString.getLongestWordAndCount(sentence);
        String actualLongestWord = result.getKey();
        int actualWordLength = result.getValue();
        Assert.assertEquals("", actualLongestWord);
        Assert.assertEquals(0, actualWordLength);
    }

    //tests that correct output is given when input is a string of white spaces
    @Test
    public void testGetLongestStringAndCountForWhitespaceString() {
        String sentence = "                 ";
        Map.Entry<String, Integer> result = LongestString.getLongestWordAndCount(sentence);
        String actualLongestWord = result.getKey();
        int actualWordLength = result.getValue();
        Assert.assertEquals("", actualLongestWord);
        Assert.assertEquals(0, actualWordLength);
    }

    //tests that correct output is given when input is a string containing repetitive words
    @Test
    public void testGetLongestStringAndCountForStringWithRepeatedWords() {
        String sentence = "The longest word here is actually repetitive repetitive REPETITIVE rePeTiTive";
        Map.Entry<String, Integer> result = LongestString.getLongestWordAndCount(sentence);
        String actualLongestWord = result.getKey();
        int actualWordLength = result.getValue();
        Assert.assertEquals("repetitive", actualLongestWord);
        Assert.assertEquals(actualWordLength, 10);
    }

    //tests that correct output is given when input is a string containing Integer
    @Test
    public void testGetLongestStringAndCountForStringWithIntegers() {
        String sentence = "It took us 4 days to travel to Morocco";
        Map.Entry<String, Integer> result = LongestString.getLongestWordAndCount(sentence);
        String actualLongestWord = result.getKey();
        int actualWordLength = result.getValue();
        Assert.assertEquals("morocco", actualLongestWord);
        Assert.assertEquals(actualWordLength, 7);
    }

    //tests that correct output is given when input is a string containing only integers
    @Test
    public void testGetLongestStringAndCountForStringWithOnlyIntegers() {
        String sentence = "22 4444 8";
        Map.Entry<String, Integer> result = LongestString.getLongestWordAndCount(sentence);
        String actualLongestWord = result.getKey();
        int actualWordLength = result.getValue();
        Assert.assertEquals("4444", actualLongestWord);
        Assert.assertEquals(actualWordLength, 4);
    }

    //tests that correct output is given when input is a string containing special characters
    @Test
    public void testGetLongestStringAndCountForStringWithSpecialCharacters() {
        String sentence = "Th!s $entence h@s $pec!@l ch@r@cter$";
        Map.Entry<String, Integer> result = LongestString.getLongestWordAndCount(sentence);
        String actualLongestWord = result.getKey();
        int actualWordLength = result.getValue();
        Assert.assertEquals("ch@r@cter$", actualLongestWord);
        Assert.assertEquals(actualWordLength, 10);
    }
}
