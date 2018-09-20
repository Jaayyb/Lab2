//Program to output a table of yards and inches
//Using JTextArea.
import javax.swing.*;
public class Lab2Ex2 {
    public static void main(String[] args) {

        getText();
    }

    public static void getText(){

        //Creating an OBJECT named "textAreaObject" of type JTextArea
        JTextArea textAreaObject = new JTextArea("");

        String txtArea = "Yards\tInches\n-------\t--------";

        //Appending the string variable "txtArea" to object "textAreaObject"
        textAreaObject.append(txtArea);

        //For loop which intializes at 1, run until it hits 11, increments by 1 every iteration
        for(int i=1;i<11;i++){

            //Every iteration of the loop whats contained in brackets is appended to "textAreaObject"
            textAreaObject.append("\n"+i+"\t"+i*36);

        }

        //Using JOptionPane to display the textAreaObject
        JOptionPane.showMessageDialog(null,textAreaObject);
    }
}
