package com.bridgelabz.hashtable;

import java.util.HashMap;
import java.util.Set;

public class HashTable {

    static void userInputSentence(String userString) {

        HashMap<String, Integer> frequency = new HashMap<String, Integer>();
        String[] words = userString.split(" "); // splitting to find word
        for (String word : words) {
            if (frequency.containsKey(word)) {
                frequency.put(word, frequency.get(word) + 1);
            } else {
                frequency.put(word, 1); // storing the word as key
            }
        }
        Set<String> stringFrequency = frequency.keySet();
        System.out.println("Frequency Of Words In Sentence: \n'Paranoids are not paranoid because\n"
                + "they are paranoid but because they keep putting themselves deliberately into\n"
                + "paranoid avoidable situations' is : ");
        for (String word : stringFrequency) {
            if (frequency.get(word) > 1)
                System.out.println(word + " = " + frequency.get(word) + " times.");

        }
    }
    public static void remove(String string, String removeWord) {
        String[] stringArray = string.split(" ");
        String newSentenceAfterRemovingWord = " ";


        for (String words : stringArray) {

            if (!words.equals(removeWord)) {

                newSentenceAfterRemovingWord = newSentenceAfterRemovingWord + words + " ";

            }
        }

        System.out.println(newSentenceAfterRemovingWord);
    }

    public static void main(String[] args) {
        userInputSentence("Paranoids are not paranoid because they are paranoid but because "
                + "they keep putting themselves deliberately into paranoid avoidable situations");



        String string = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String removeWord = "avoidable";
        remove(string, removeWord);
    }
}
