import javax.swing.JOptionPane;
public class Lab2Ex4 {
    public static void main(String[] args) {

        stringMethods();

    }

    public static void stringMethods()
    {
        String name = JOptionPane.showInputDialog("Please enter your full name: ");
        char initial = name.charAt(0);
        String nameCaps = name.toUpperCase();

        JOptionPane.showMessageDialog(null, "The number of characters in the name is: " + name.length() + "\nThe first initial of the name is " + initial
        + "\nThe name in uppercase is: " +nameCaps);

    }
}
