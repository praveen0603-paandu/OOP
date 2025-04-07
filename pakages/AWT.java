import java.awt.*; 
import java.awt.event.*; 
 
public class SimpleAWTApp { 
    SimpleAWTApp() { 
        // Create a new Frame 
        Frame frame = new Frame("AWT Example"); 
 
        // Create a Button 
        Button button = new Button("Click Me!"); 
        button.setBounds(50, 100, 80, 30); // Set button position and size 
 
        // Add button to the frame 
        frame.add(button); 
 
        // Set frame properties 
        frame.setSize(300, 200); 
        frame.setLayout(null); // Use no layout manager 
        frame.setVisible(true); // Make the frame visible 
 
        // Add a window listener to handle window closing 
        frame.addWindowListener(new WindowAdapter() { 
public void windowClosing(WindowEvent e) { 
frame.dispose(); // Close the frame 
} 
}); 
// Add an action listener to the button 
button.addActionListener(new ActionListener() { 
public void actionPerformed(ActionEvent e) { 
System.out.println("Button clicked!"); // Print message on button click 
} 
}); 
} 