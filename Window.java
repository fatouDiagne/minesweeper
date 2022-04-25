import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.*;

public class Window {

    private static JFrame frame;
    private static String title;
    public static final int SIZE = 700;
   
    
       
    public Window( int gridSize, String title, Game game, Handler handler,int SIZE) {
        Window.title = title;
        frame = new JFrame(title);
       

       
        frame.setSize(SIZE, SIZE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        

        frame.setLayout(new BorderLayout());
        JPanel panel = new Grid(new GridLayout(gridSize, gridSize), handler);
        frame.add(panel, BorderLayout.CENTER);
        
        
        frame.pack();
        frame.setVisible(true);
    }

    public  void initializeButtonPanel(){
        JPanel buttonPanel = new JPanel();
        JButton reset = new JButton("Recommencer");
        buttonPanel.add(reset);
       
        frame.add(buttonPanel, BorderLayout.SOUTH);
    
        }
    public static void update(int flagged) {
        frame.setTitle(title + "Mines: " + Game.MINECOUNT + " - Flags: " + flagged);
    }
}
