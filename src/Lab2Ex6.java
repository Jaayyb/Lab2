import javax.swing.*;
import java.awt.*;
public class Lab2Ex6 {
    public static void main(String[] args) {

        String txtAreaString;
        JTextArea txtArea = new JTextArea();
        txtArea.append("Number \tCube\n-----------\t-----------");

        for (int x = 1; x < 16; x++) {

            txtArea.append("\n" + x + "\t" + getCube(x));
        }

        JOptionPane.showMessageDialog(null, txtArea);
    }

    public static int getCube(int x) {

        x = x * x * x;

        return x;
    }
}
