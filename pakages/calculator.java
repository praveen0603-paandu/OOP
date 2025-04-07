import java.awt.*; 
import java.awt.event.*; 
15.d)Shape Calculator 
public class ShapeCalculator { 
    // Frame and components 
    private Frame frame; 
    private TextField lengthField, widthField, radiusField; 
    private TextArea resultArea; 
 
    public ShapeCalculator() { 
        // Create a new Frame 
        frame = new Frame("Shape Calculator"); 
 
        // Create components 
        Label lengthLabel = new Label("Length:"); 
        lengthField = new TextField(10); 
         
        Label widthLabel = new Label("Width:"); 
        widthField = new TextField(10); 
         
        Label radiusLabel = new Label("Radius:"); 
        radiusField = new TextField(10); 
         
        Button rectangleButton = new Button("Calculate Rectangle"); 
        Button circleButton = new Button("Calculate Circle"); 
        resultArea = new TextArea(10, 30); 
        resultArea.setEditable(false); 
 
        // Set layout 
        frame.setLayout(new FlowLayout()); 
 
        // Add components to the frame 
        frame.add(lengthLabel); 
        frame.add(lengthField); 
        frame.add(widthLabel); 
        frame.add(widthField); 
        frame.add(rectangleButton); 
         
        frame.add(radiusLabel); 
        frame.add(radiusField); 
        frame.add(circleButton); 
        frame.add(resultArea); 
 
        // Set frame properties 
        frame.setSize(400, 400); 
        frame.setVisible(true); 
 
        // Add window listener to handle window closing 
        frame.addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent e) { 
                frame.dispose(); // Close the frame 
            } 
        }); 
 
        // Add action listeners for buttons 
        rectangleButton.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                calculateRectangle(); 
            } 
        }); 
 
        circleButton.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                calculateCircle(); 
            } 
        }); 
    } 
 
    // Method to calculate area and perimeter of a rectangle 
    private void calculateRectangle() { 
        try { 
            double length = Double.parseDouble(lengthField.getText()); 
            double width = Double.parseDouble(widthField.getText()); 
            double area = length * width; 
            double perimeter = 2 * (length + width); 
            resultArea.setText("Rectangle Area: " + area + "\nRectangle Perimeter: " 
+ perimeter); 
        } catch (NumberFormatException e) { 
            resultArea.setText("Please enter valid numbers for length and width."); 
        } 
    } 
 
    // Method to calculate area and circumference of a circle 
    private void calculateCircle() { 
        try { 
            double radius = Double.parseDouble(radiusField.getText()); 
            double area = Math.PI * radius * radius; 
            double circumference = 2 * Math.PI * radius; 
            resultArea.setText("Circle Area: " + area + "\nCircle Circumference: " + 
circumference); 
        } catch (NumberFormatException e) { 
            resultArea.setText("Please enter a valid number for radius."); 
        } 
    } 
 
    public static void main(String[] args) { 
        new ShapeCalculator(); // Create an instance of the Shape Calculator 
    } 
} 