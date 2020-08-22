package org.launchcode.java.studios.areaofacircle;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countingCharacters {
    public static void main(String[] args){

          Scanner input = new Scanner(System.in);
                System.out.println("Enter a text");
                String myString = input.nextLine();
                myString = myString.toLowerCase();

        char[] charactersInString = myString.toCharArray();
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for(char c :charactersInString){

            if(c>='a' && c<='z'){
            if(charCountMap.containsKey(c)) {

                charCountMap.put(c, charCountMap.get(c) + 1);
            }else{

                charCountMap.put(c, 1);

            }}
    }
        for (Map.Entry entry : charCountMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
}}
