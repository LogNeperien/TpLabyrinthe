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
public class FileFormatException extends Exception{
    public String getMessage()
    {
        String s = "File format problem";
        return s; 
    }
}
