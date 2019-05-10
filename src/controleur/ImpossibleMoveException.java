/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

/**
 *
 * @author helen
 */
public class ImpossibleMoveException extends Exception{
    public String getMessage()
    {
        String s = "This move is impossible.";
        return s;
    }
}
