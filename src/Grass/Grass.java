package Grass;

import java.util.Scanner;

public class Grass {
    private double grassGrowth = 0.8;

    public int grassMowing(double currentHeight, double maxHeight){
        boolean keepGoing = true;
        int days = 0;
        while(keepGoing){
            days++;
            currentHeight += grassGrowth;
            if(currentHeight >= maxHeight){
                keepGoing = false;
            }
        }
        return days;
    }

    public static void main(String[] args) {
        Grass grass = new Grass();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the current height of the grass?");
        double currentHeight = sc.nextDouble();
        System.out.println("What is the max height the grass can be?");
        double maxHeight = sc.nextDouble();
        System.out.println(grass.grassMowing(currentHeight, maxHeight));
    }
}
