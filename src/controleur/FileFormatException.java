/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleur;

/**
 *
 * @author helene
 */
public class FileFormatException extends Exception {
    
    @Override
    public String getMessage() {
        String a = "File format problem";
        return a;
    }
    
}
