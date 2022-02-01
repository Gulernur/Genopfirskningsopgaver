package Search;

import java.io.IOException;
import java.util.Arrays;

public class Search {

    public int search(String[] strings, String words) throws IOException {
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].equals(words)){
                return i; 
            }
        }
        throw new IOException();
    }

    public static void main(String[] args) throws IOException {
        Search s = new Search();
        String[] w = {"hej", "hello"};
        System.out.println(s.search(w, "Hej"));
    }
}
