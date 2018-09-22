import javax.swing.JOptionPane;
public class Lab2Ex7 {
    public static void main(String[] args) {

        String inputString;
        int input = 0;

        while(input != -1) {

            inputString = JOptionPane.showInputDialog("Please enter a number (-1 to exit): ");
            input = Integer.parseInt(inputString);

            if(input == -1)
            {
                JOptionPane.showMessageDialog(null, "The program has been terminated, thank you.");
                System.exit(0);
            }

            if(isEven(input) == true)
            {
                JOptionPane.showMessageDialog(null, "The number " + input + " is even");
            }
            else {
                JOptionPane.showMessageDialog(null, "The number " + input + " is odd");
            }
        }
    }
    public static boolean isEven(int x)
    {
        boolean isEven = true;

        if(x % 2 == 1)
        {
            isEven = false;
        }
        else {
            isEven = true;
        }
        return isEven;
    }
}
