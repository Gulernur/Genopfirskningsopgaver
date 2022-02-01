package Arraylist;

import java.util.ArrayList;

public class Arraylist {

    public boolean doesArraylistContainString(ArrayList<String> list, String word){
        if(!list.contains(word)){
            list.add(word);
            return false;
        } else{
            System.out.println("The string has been found");
            return true;
        }
    }

    public static void main(String[] args) {
        Arraylist arraylist = new Arraylist();
        ArrayList<String> list = new ArrayList<>();
        //list.add("Hello");
        list.add("Hola");
        list.add("Hej");
        list.add("Hejsa");
        System.out.println(arraylist.doesArraylistContainString(list, "Hello"));
        System.out.println(arraylist.doesArraylistContainString(list, "Hello"));
    }
}
