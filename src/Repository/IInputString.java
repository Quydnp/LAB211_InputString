/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import java.util.HashMap;
import java.util.List;

/**
 *
 * @author HI
 */
public interface IInputString {
    public HashMap<String, StringBuilder> getCharacter(String input);
    public HashMap<String, List<Integer>> getNumber(String input);
}
