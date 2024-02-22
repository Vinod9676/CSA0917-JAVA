import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args){
        String name =" ";
         int age=0;
        while(name.isBlank()) {
            name = JOptionPane.showInputDialog("enter your name:");


        }
        while (age ==0){
            age += Integer.parseInt(JOptionPane.showInputDialog("enter your age:"));
        }
        JOptionPane.showMessageDialog(null, name +""+age);

    }

}