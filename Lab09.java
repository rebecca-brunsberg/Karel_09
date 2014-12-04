/**
 * A robot moves along a row, collecting piles of beepers and placing them one square to
 * the right.
 * 
 * @author Rebecca brunsberg
 * @version 4th December 2014
 *
 */

import edu.fcps.karel2.Display; 
import javax.swing.JOptionPane;

public class Lab09 {
  
  public static void main(String[] args) {
   String map = JOptionPane.showInputDialog("Which map?");
   Display.openWorld("maps/"+map+".map");
   Display.setSize(10, 10);
   Athlete athena = new Athlete(1, 1, Display.EAST, 0);
   //TODO write a combination of definite and indefinite loops that will cause athena
   // to pick up each pile of beepers and deposit them one square to the right.
 
   int beepersUp=0;
   int beepersDown=0;
   for (int space=1; space<=8; space++){
     while(athena.nextToABeeper()){
       athena.pickBeeper();
       beepersUp++;
     }
     while (beepersDown>0){
       athena.putBeeper();
       beepersDown--;
     }
     athena.move();
     beepersDown=beepersUp;
     beepersUp=0;
     
   }
   
  }
 }
  