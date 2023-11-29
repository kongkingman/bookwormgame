import javax.swing.JFrame;
import javax.swing.JTextField;

public class Bookworm {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Bookworm Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JTextField
        JTextField textField = new JTextField();
        textField.setBounds(300, 250, 200, 30); // Set the position and size of the text field

        // Add the text field to the frame
        frame.add(textField);

        // Set the size of the frame>
        frame.setSize(800, 600);

        // Set the layout to null
        frame.setLayout(null);

        // Center the frame on the screen
        frame.setLocationRelativeTo(null);

        // Make the frame visible
        frame.setVisible(true);
    }
}