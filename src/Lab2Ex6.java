import javax.swing.*;
import java.awt.*;
public class Lab2Ex6 {
    public static void main(String[] args) {

        int number = 1;
        getCube(number);
    }

    public static void getCube(int x) {

        String txtAreaString;
        JTextArea txtArea = new JTextArea();
        txtArea.append("Number \tCube\n-----------\t-----------");

        for (x = 1; x < 16; x++) {

            int cube = x * x * x;
            txtArea.append("\n" + x + "\t" + cube);
        }

        JOptionPane.showMessageDialog(null, txtArea);
    }
}