//Use HashMaps or String arrays to loop through user's input and implement the following:
//Replacements:
//replace i with you
//replace me with you
//replace my with your
//replace am with are
//User enters something:"my teacher hates me"
//Program will loop through string & replace "my" with "your" & "me" with "you"
//The replacement method returns the same words as the user entered only the replacement words have been swapped

package com.company;

import java.util.HashMap;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        boolean Q;


//Welcome user
        System.out.println("Hello! I am Eliza and I am here to help!");
        String userinput = " ";

//Create Do while loop
        do {

            System.out.println("Good day.What is your problem? Enter your response here or Q to quit");
            userinput = Keyboard.nextLine();

            //System.out.println(userinput);
            String[] userArray = new String[userinput.length()];
            userArray = Split(userinput, userArray);

            HashMap<String, String> myMap = new HashMap<>();
            myMap = createHashMap();

//            for (String word: userArray){
//                if (myMap.containsKey(word)){
//                    //String replacedWord;
//                    word = myMap.get(word);
//                    //word = replacedWord;
//                    //String result = Replacement(replacedWord);
//
////                    word = replacedWord;
//
//            //Replace words
//            //Options to replace words
//            //1. Override word ASAP
//            //2. Get value of corresponding to key, save to variable, put word & override it
////              String replacedWord;
////              replacedWord= myMap.get(word);
////              word = replacedWord;
//                }
//
//            }

            String result = Replacement(userArray, myMap);
            System.out.println(result);
            Q = quitcheck(userinput);
        }

        while (!Q);
        System.out.println("Thanks have a great day!");
    }

    public static HashMap<String, String> createHashMap() {
        HashMap<String, String> myMap = new HashMap<>();
        myMap.put("i", "you");
        myMap.put("me", "you");
        myMap.put("my", "your");
        myMap.put("am", "are");
        return myMap;
    }

    public static String Replacement(String[] userArray, HashMap<String, String> myMap) {
        String str = " ";
        for (String word : userArray) {
            if (myMap.containsKey(word)) {
                String replacedWord = "";
                replacedWord = myMap.get(word);
                str += replacedWord + " ";
            } else {
                str += word + " ";
            }
        }

//            word = replacedWord;
        //String result = Replacement(replacedWord);

//                    word = replacedWord;

        //Replace words
        //Options to replace words
        //1. Override word ASAP
        //2. Get value of corresponding to key, save to variable, put word & override it


//        String str = " ";
//        str += replacedWord;
//        for (String name: replacementArray){
//            str += name + " ";
//        }
        return str;

    }

    public static String[] Split(String userInput, String[] userArray) {
        userArray = userInput.split(" ");
        return userArray;
    }

    public static boolean quitcheck(String userinput) {
        boolean Q = false;

        if (userinput.equalsIgnoreCase("Q")) {
            Q = true;
        } else if (userinput.equalsIgnoreCase("I am feeling great")) {
            Q = true;

        }
        return Q;

    }
}