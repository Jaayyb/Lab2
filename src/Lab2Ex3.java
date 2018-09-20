import javax.swing.*;
import java.awt.*;
public class Lab2Ex3 {
    public static void main(String[] args) {

        getCost();

    }

    public static void getCost()
    {

        String name, lengthString, breadthString, costString, result;
        double length, breadth, area, cost, totalCost;

        name = JOptionPane.showInputDialog("Please enter your name: ");
        lengthString = JOptionPane.showInputDialog("Please enter the length of the room: ");
        breadthString = JOptionPane.showInputDialog("Please enter the breadth of the room: ");
        costString = JOptionPane.showInputDialog("Please enter the cost per square metre: ");

        length = Double.parseDouble(lengthString);
        breadth = Double.parseDouble(breadthString);
        area = length * breadth;
        cost = Double.parseDouble(costString);
        totalCost = area * cost;

      /*  System.out.println("Quoatation for " + name + "\nLength of room: " + length + "\nBreadth of room: " + breadth
                + "\nTotal area of the room: " + area + "\nCost per square metre of carpet: " + cost
                + "\nTotal cost of carpet: " + totalCost);
      */

        JTextArea txtArea = new JTextArea();
        txtArea.setFont(new Font("monospaced", Font.PLAIN, 12));
        txtArea.append("Quoatation for " + name + "\nLength of room: " + length + "\nBreadth of room: " + breadth
                + "\nTotal area of the room: " + String.format("%.2f", area) + "\nCost per square metre of carpet: " + cost
                + "\nTotal cost of carpet: " + String.format("%.2f", totalCost));



        JOptionPane.showMessageDialog(null, txtArea);

    }

}
