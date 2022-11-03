package JavaFiles;
import javax.swing.JOptionPane;

public class MyClass {
    public static void main(String args[]) {
      String name= JOptionPane.showInputDialog("enter your name");
      JOptionPane.showMessageDialog(null, "Hello "+ name);

      int Age= Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));
      JOptionPane.showMessageDialog(null, "You are "+ Age+ " old");

      Double salary= Double.parseDouble(JOptionPane.showInputDialog("Please enter your Salary"));
      JOptionPane.showMessageDialog(null, "Your salary is "+ salary);



      // Integer.parseInt(name)
      // Integer.parseInt(name, Age)



}}