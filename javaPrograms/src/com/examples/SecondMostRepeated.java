package com.examples;

public class SecondMostRepeated {
	public static void main(String[] args) {
        String str = "aabbcdd";
        char secondMostRepeated = findSecondMostRepeated(str);
        System.out.println("Second most repeated character: " + secondMostRepeated);
    }

    public static char findSecondMostRepeated(String str) {
        int[] count = new int[256]; // Assuming ASCII characters
        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            count[ch]++;
        }
        // Find the second most repeated character
        int maxCount = 0;
        int secondMaxCount = 0;
        char secondMostRepeated = '\0'; // Default value
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                secondMaxCount = maxCount;
                maxCount = count[i];
            } else if (count[i] > secondMaxCount && count[i] != maxCount) {
                secondMaxCount = count[i];
                secondMostRepeated = (char) i;
            }
        }
        return secondMostRepeated;
    }
}

