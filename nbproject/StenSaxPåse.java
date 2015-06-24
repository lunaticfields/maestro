/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StenSaxPåse;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Elev
 */
public class StenSaxPåse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        int computerChoice = cpuChoice (); 
        int userChoice = userChoice(); 
        JOptionPane.showMessageDialog(null, "Datorns val" + computerChoice);
        winner (computerChoice, userChoice);
        
    }
    
    public static int cpuChoice(){
        Random r = new Random();
        int choice = r.nextInt(3) + 1;
        return choice;
    }
    
    public static int userChoice() {
    
        String input; 
        input = JOptionPane.showInputDialog("Skriv 1 för sten, 2 för sax, 3 för påse");
        int choice2 = Integer.parseInt (input);
        return choice2;
    }
    public static void winner (int dator, int spelare)
     
    { 
        if (dator == 1 && spelare == 2)
            JOptionPane.showMessageDialog(null, "Du förlorade!");
                    
                     if (dator == 2 && spelare == 1)
            JOptionPane.showMessageDialog(null, "Du vann!");
                    
                     if (dator == 1 && spelare == 3)
            JOptionPane.showMessageDialog(null, "Du vann med påse över sten");
                    
                     if (dator == 3 && spelare == 1)
            JOptionPane.showMessageDialog(null, "Datorn vann med påse över sten");
                    
                     if (dator == 3 && spelare == 2)
            JOptionPane.showMessageDialog(null, "Du vann med sax över påse!");
                    
                     if (dator == 2 && spelare == 3)
            JOptionPane.showMessageDialog(null, "Datorn vann med sax över påse!");
                    
                     if (dator == spelare)
            JOptionPane.showMessageDialog(null, "Oavgjort! Kör om.");
                    
    }
    
    
    
     
    
