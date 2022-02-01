package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorting {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something: ");
        ArrayList<String> words = new ArrayList<>();
        String word = "";
        for (int i = 0; i < 5; i++) {
            word = scanner.nextLine();
            words.add(word);
        }
        Collections.sort(words);
        Collections.reverse(words);
        System.out.println(words);
    }
}
