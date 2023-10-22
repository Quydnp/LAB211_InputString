/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author HI
 */
public class InputStringRepo implements IInputString{

    Scanner sc = new Scanner(System.in);
    
    @Override
    public HashMap<String, StringBuilder> getCharacter(String input) {
        HashMap<String, StringBuilder> charList = new HashMap<>();
        StringBuilder uppercase = new StringBuilder();
        StringBuilder lowercase = new StringBuilder();
        StringBuilder specialChar = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                uppercase.append(input.charAt(i));
            }
            else if (Character.isLowerCase(input.charAt(i))) {
                lowercase.append(input.charAt(i));
            }
            else if (!Character.isDigit(input.charAt(i))) {
                specialChar.append(input.charAt(i));
            }
        }
        charList.put("All Character: ", new StringBuilder(input));
        charList.put("Uppercase: ", uppercase);
        charList.put("Lowercase: ", lowercase);
        charList.put("Special: ", specialChar);
        
        return charList;
    }

    @Override
    public HashMap<String, List<Integer>> getNumber(String input) {
        HashMap<String, List<Integer>> numList = new HashMap<>();
        List<Integer> allNum = new ArrayList<>();
        List<Integer> evenNum = new ArrayList<>();
        List<Integer> oddNum = new ArrayList<>();
        List<Integer> squareNum = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            if (Character.digit(input.charAt(i), 10) % 2 == 0) {
                evenNum.add(Character.digit(input.charAt(i), 10));
                allNum.add(Character.digit(input.charAt(i), 10));
            }
            else if (Character.digit(input.charAt(i), 10) % 2 == 1) {
                oddNum.add(Character.digit(input.charAt(i), 10));
                allNum.add(Character.digit(input.charAt(i), 10));
            }
            if (checkSquareNum(Character.digit(input.charAt(i), 10))) {
                squareNum.add(Character.digit(input.charAt(i), 10));
            }
        }
        numList.put("All numbers: ", allNum);
        numList.put("Even numbers: ", evenNum);
        numList.put("Odd numbers: ", oddNum);
        numList.put("Square numbers: ", squareNum);
        return numList;
    }
    
    private boolean checkSquareNum(int n) {
        if (Math.sqrt(n) * Math.sqrt(n) == n) {
            return true;
        }
        return false;
    }
    
}
