package main.java;

import java.util.HashMap;
import java.util.Map;

public class LongestString {

    public static Map.Entry<String, Integer> getLongestWordAndCount(String sentence) {

        //declaring a hashmap using String as Key and Integer as Value
        HashMap<String, Integer> map = new HashMap<>();

        //declaring an array along with trimming the string to lowercase and splitting each word using whitespace
        String[] array = sentence.trim().toLowerCase().split(" ");
        Map.Entry<String, Integer> longestWordAndCountEntry = null;

        //using a for loop to traverse through the array of words and store the word, as well as its length, in a hashmap
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], array[i].length());
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (longestWordAndCountEntry == null
                    || entry.getValue().compareTo(longestWordAndCountEntry.getValue()) > 0) {
                longestWordAndCountEntry = entry;
            }
        }
        return longestWordAndCountEntry;
    }
}

