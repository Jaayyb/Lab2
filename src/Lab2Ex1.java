//Program to convert from GBP to EURO
import javax.swing.JOptionPane;
public class Lab2Ex1 {
    public static void main(String[] args) {

        String test = getCalculation();
        JOptionPane.showMessageDialog(null, test);

    }

    public static String getCalculation() {

        double rate = 0, entry = 0;
        String rateString, entryString, outputString = "";


        rateString = JOptionPane.showInputDialog("Please enter the exchange rate GBP to EUR: ");
        rate = Double.parseDouble(rateString);


        //JOptionPane.showMessageDialog(null, "The rate is: " + rate);
        entryString = JOptionPane.showInputDialog("Please enter the amount you wish to convert");
        entry = Double.parseDouble(entryString);

       double euroAmt = entry * rate;

        while(entry != 0)
        {
            outputString =  outputString + "\n\nRate is: " + String.format("%.2f", rate) + "\nGBP Amount is: " + String.format("%.2f", entry) + "\nEUR amount is: "
                    + String.format("%.2f", euroAmt);

            entryString = JOptionPane.showInputDialog("Please enter the amount you wish to convert");
            entry = Double.parseDouble(entryString);
            euroAmt = entry * rate;
        }



        return outputString;
    }
}

