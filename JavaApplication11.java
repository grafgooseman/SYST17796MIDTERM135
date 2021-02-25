/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

import java.util.Scanner;

/**
 *
 * @author r2kar
 */

public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    Seasons season;
    private boolean abc = true;

    public enum Seasons {
        FALL, WINTER, SPRING, SUMMER
    }

    // a constructor
    public JavaApplication11(Seasons season) {
        this.season = season;
    }

    public void seasonDescription() {
        switch (season) {
            case FALL:
                System.out.println("my fav. season!");
                break;
            case WINTER:
                System.out.println("it is too cold!");
                break;
            case SPRING:
                System.out.println("my allerg!");
                break;
            case SUMMER:
                System.out.println("it is hot!");
                break;
        }
    }



    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        // try to get the input (myStr) from the user
        String myStr = scanner.nextLine();

        JavaApplication11 test1 = new JavaApplication11(Seasons.valueOf(myStr));
        test1.seasonDescription();

        //Here is the check if the inputed value is indeed a season
        System.out.println("Is Season: "+test1.isSeason(myStr));

        int ord = Seasons.valueOf(myStr).ordinal();
        System.out.println(Seasons.valueOf(myStr).ordinal());
        // a for loop that iterated thru the Seasons Enum using values() method
        for (Seasons mySeason : Seasons.values()) {

            System.out.println(mySeason);
        }
        
        scanner.close();
    }

    public boolean isSeason(String myStr){
        
        for(Seasons s:Seasons.values()){
            if(s.toString().equals(myStr)){
                return true;
            }
        }
        return false;
    }

}
