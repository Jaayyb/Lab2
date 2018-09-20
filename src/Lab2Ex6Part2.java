import javax.swing.*;
import java.awt.*;
public class Lab2Ex6Part2 {
    public static void main(String[] args) {


        String input = JOptionPane.showInputDialog("Please enter the length of the side of your cubic container: ");

        int inputNumber = Integer.parseInt(input);

       inputNumber = MyMethods.getCube(inputNumber);



        if(inputNumber >= 100)
        {
            JOptionPane.showMessageDialog(null, "You can't take this on board, put it into your check in luggage.");
        }

    }
}