package examples;

import datan.*;
import datangraphics.*;

import java.text.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;        //for action and window events

/**
* Example for the creation of random numbers
*/
public class E1Random {
   int methodNumber, seed1, seed2;
   int[] seeds;
   String line;
   String[] ac, ac1, actionCommands;
   AuxJNumberInput[] ni = new AuxJNumberInput[2];
   DatanFrame df;  
   NumberFormat numForm;
   double[] rand;
   String[] methodString = {"Uniform based on MLCG", "Uniform based on ECUY", "Standard normal based on ECUY"};

   public E1Random(){
      String s = "Example for the creation of random numbers";
      df = new DatanFrame(getClass().getName(), s);
      seeds = new int[2];
// parameter input
      AuxJInputGroup ig = new AuxJInputGroup("Parameter input", "");
      JLabel errorLabel = new JLabel();
      ni[0] = new AuxJNumberInput("seed_1", "seed for MLCG or seed_1 for ECUY", errorLabel);
      ni[0].setProperties("seed_1", true, 1);
      ni[0].setNumberInTextField(DatanRandom.getSeedMlcg());
      ni[1] = new AuxJNumberInput("seed_2", "seed_2 for ECUY", errorLabel);
      ni[1].setProperties("seed_2", true, 1);
      ni[1].setNumberInTextField(1);
      ni[1].setEnabled(false);
      ig.add(ni[0]);
      ig.add(ni[1]);
      df.add(ig);
      df.add(errorLabel);
// radio-button group for choice of method
      ac = new String[3];
      ac[0] = methodString[0];
      ac[1] = methodString[1];
      ac[2] = methodString[2];
      RadioListener rl = new RadioListener();
      AuxJRButtonGroup rbg = new AuxJRButtonGroup("Random number Generator", "", ac, rl);
      rbg.setSelectedIndex(1);
      methodNumber=0;
      df.add(rbg);
// go button 
      JButton goButton = new JButton("Go");
      GoButtonListener gl = new GoButtonListener();
      goButton.addActionListener(gl);
      df.add(goButton);
   }

    protected boolean inputOk(){
       boolean ok = true;
       for(int i = 0; i < ni.length; i++){
          if(ni[i].isEnabled()) ok = ok && ni[i].parseOk();
       }
       return ok;
    }

    protected void compute(){
      if(ni[0].isEnabled()) seed1 = (int)ni[0].parseInput();
      if(ni[1].isEnabled()) seed2 = (int)ni[1].parseInput();
      int n = 100;
      if(methodNumber == 0){
         df.writeLine("RandomNumbers produced by method DatanRandom.mlcg");
         DatanRandom.setSeedMlcg(seed1);
         rand = DatanRandom.mlcg(n);
         ni[0].setNumberInTextField(DatanRandom.getSeedMlcg());
      }
      else{
//         seeds = new int[2];
         seeds[0] = seed1;
         seeds[1] = seed2;
         DatanRandom.setSeedsEcuy(seeds);
         if (methodNumber == 1){
            df.writeLine("RandomNumbers produced by method DatanRandom.ecuy");
            rand = DatanRandom.ecuy(n);
         }
         else{
            df.writeLine("RandomNumbers produced by method DatanRandom.standardNormal");
            rand = DatanRandom.standardNormal(n);
         }
         seeds = DatanRandom.getSeedsEcuy();
         ni[0].setNumberInTextField(seeds[0]);
         ni[1].setNumberInTextField(seeds[1]);
      }
      int nlines = n / 5;
      int iline;
      for(iline = 0; iline < nlines; iline++){
         line = "";
         for(int i = 0; i < 5; i++){
            line = line + "  " + String.format(Locale.US, "%16.12f", rand[5 * iline + i]);
         }
         df.writeLine(line);
      }
      df.writeLine("-----------------------------------------------------------------------");
    }



    
    
    private class GoButtonListener implements ActionListener { 
        public void actionPerformed(ActionEvent e) {
           if (inputOk()) compute();
       }
    }

    /** Listens to the radio buttons. */
    
    private class RadioListener implements ActionListener { 
        public void actionPerformed(ActionEvent e) {
           actionCommands = ac;
           int l = actionCommands.length;
	        for(int i = 0; i < actionCommands.length; i++) {
		        if(e.getActionCommand() == actionCommands[i]){
                 methodNumber = i;
              }
          }
          if(methodNumber == 0){
            ni[1].setEnabled(false);
            ni[0].setNumberInTextField(DatanRandom.getSeedMlcg());
          }
          else{
            ni[1].setEnabled(true);
            seeds = DatanRandom.getSeedsEcuy();
            ni[0].setNumberInTextField(seeds[0]);
            ni[1].setNumberInTextField(seeds[1]);
          }
       }
    }
    
   


   public static void main(String s[]) {
      new E1Random();
   }

}
