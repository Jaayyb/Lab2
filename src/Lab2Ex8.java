import javax.swing.JOptionPane;
public class Lab2Ex8 {
    public static void main(String[] args) {

        int[] myList = new int[11];
        String inputString;
        int input;

        for(int i=0; i<10; i++)
        {
            inputString = JOptionPane.showInputDialog("Please enter an integer: ");
            input = Integer.parseInt(inputString);

            myList[i] = input;
        }
        JOptionPane.showMessageDialog(null, "The first value in the array is "+ myList[0]+ "\nThe fifth value in the array is " + myList[4]);

    }
}

