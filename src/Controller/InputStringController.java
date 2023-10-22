/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Repository.InputStringRepo;
import View.Menu;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author HI
 */
public class InputStringController extends Menu<String> {

    private InputStringRepo inputString;
    static String[] options = {
        "Analyze number types",
        "Display character types",
        "Exit"
    };
    Scanner sc = new Scanner(System.in);

    public InputStringController() {
        super("========= ANALYSIS STRING PROGRAM  =========", options);
        inputString = new InputStringRepo();
    }

    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                System.out.print("Enter string: ");
                String input = sc.nextLine();
                HashMap<String, List<Integer>> numList = inputString.getNumber(input);
                for (Map.Entry<String, List<Integer>> entry : numList.entrySet()) {
                    System.out.println(entry.getKey() + " " + entry.getValue());
                    
                }
                break;

            case 2:
                System.out.print("Enter string: ");
                input = sc.nextLine();
                HashMap<String, StringBuilder> charList = inputString.getCharacter(input);
                for (Map.Entry<String, StringBuilder> entry : charList.entrySet()) {
                    System.out.println(entry.getKey() + " " + entry.getValue());
                    
                }
                break;

            case 3:
                System.exit(0);
        }
    }
}
