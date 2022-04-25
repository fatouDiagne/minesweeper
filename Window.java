import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import java.awt.*;

public class Window {

    private static JFrame frame;
    private static String title;
    public static final int SIZE = 700;
    JButton reset;
    //JFrame myframe;private final ActionListener actionListener = actionEvent -> {
       
        private final ActionListener actionListener = actionEvent -> {
            //action sur les boutons
        Object source = actionEvent.getSource();
        if (source == reset) {
            //new Run();
        } 
        /*else {
            
        }*/
    };

//int width, int height,
    public Window( int gridSize, String title, Game game, Handler handler,int SIZE) {
        Window.title = title;
        frame = new JFrame(title);
       

        //frame.setPreferredSize(new Dimension(width, height));
        //frame.setMinimumSize(new Dimension(width, height));
        //frame.setMaximumSize(new Dimension(width, height));
        //frame.setResizable(false);
        frame.setSize(SIZE, SIZE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        
        Container grid = new Container();
        //grid.setLayout(new GridLayout(gridSize, gridSize), handler);

        frame.setLayout(new BorderLayout());
        initializeButtonPanel();
        JPanel panel = new Grid(new GridLayout(gridSize, gridSize), handler);
        frame.add(panel, BorderLayout.CENTER);
        
        //frame.setContentPane(panel);
        frame.pack();
        frame.setVisible(true);
    }

    public  void initializeButtonPanel(){
        JPanel buttonPanel = new JPanel();
    
        JButton reset = new JButton("Recommencer");

        reset.addActionListener(actionListener);

    
    
        buttonPanel.add(reset);
        //frame.setPreferredSize(new DimensionUIResource(10, 10));
        frame.add(buttonPanel, BorderLayout.SOUTH);
       //JButton giveUp = new JButton("Abandonner");
    
        }
    public static void update(int flagged) {
        frame.setTitle(title + "Mines: " + Game.MINECOUNT + " - Flags: " + flagged);
    }
}
