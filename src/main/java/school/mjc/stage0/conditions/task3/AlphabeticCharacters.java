package school.mjc.stage0.conditions.task3;

import java.util.Arrays;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {

        int intValue = character;

        if (intValue > 127 || intValue < 0) {
            System.out.println("wrong alphabet!");
            return;
        }

        int[] arrayOfVowels = {65, 69, 73, 79, 85};

        for (int arrayOfVowel : arrayOfVowels) {
            if (intValue == arrayOfVowel || intValue == arrayOfVowel + 26) {
                System.out.println("Vowel");
                return;
            }
        }
        System.out.println("Consonant");
    }
}
