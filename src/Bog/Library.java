package Bog;

import java.util.ArrayList;

public class Library {
    ArrayList<Bog> books = new ArrayList<>();


    public boolean isBookPresent(Bog bog){
        for(Bog b : books) {
            if(b.getIsbnNumber().equals(bog.getIsbnNumber())){
                return true;
            }
        }
       return false;
    }


    public static void main(String[] args) {
        Bog bog = new Bog("1234", "Harry Potter 1", 2020);
        Library l = new Library();
        l.books.add(new Bog("1234", "Harry Potter 1", 2020));
        l.books.add(new Bog("4321", "Harry Potter 2", 2021));
        l.books.add(new Bog("9876", "Harry Potter 3", 2022));
        System.out.println(l.isBookPresent(bog));
    }
}


