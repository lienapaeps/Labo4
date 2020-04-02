package ui.view;

import domain.model.LetterCounter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOccurencesUI {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Geef een woord");
        String word = bufferedReader.readLine();
        System.out.println("Geef een letter");
        String letter = bufferedReader.readLine();

        char letter2 = letter.charAt(0);
        int aantalLetters = LetterCounter.countLetters(word, letter2);

        System.out.println("Het woord " + word + " bevat " + aantalLetters + " keer de letter " + letter);
    }
}
