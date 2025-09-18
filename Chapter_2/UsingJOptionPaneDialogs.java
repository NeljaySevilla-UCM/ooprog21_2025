import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
                       String name = JOptionPane.showInputDialog("Please enter your name:");

            
            if (name == null || name.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "No name entered. Exiting program.");
                break;
            }

            int response = JOptionPane.showConfirmDialog(
                null, 
                "Do you want to display your name: " + name + "?", 
                "Confirm Name", 
                JOptionPane.YES_NO_OPTION
            );

           
            if (response == JOptionPane.YES_OPTION) {
               
                JOptionPane.showMessageDialog(null, "Your name is: " + name);
                break;  
            }
       
        }
    }
}
