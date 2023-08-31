import javax.swing.JOptionPane;
public class VerybasicGUI {
    public static void main(String[] args) {
      String name = JOptionPane.showInputDialog("enter your name");
       JOptionPane.showMessageDialog(null,"hello " + name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("enter your age"));
        JOptionPane.showMessageDialog(null,"Your age is " + age);
        double height = Double.parseDouble(JOptionPane.showInputDialog("enter your height"));
        JOptionPane.showMessageDialog(null,"Your height is " + height);
    }
}


