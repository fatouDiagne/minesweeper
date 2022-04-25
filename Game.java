import javax.swing.SwingUtilities;
import javax.swing.UIManager;
public class Game {

    
    public static final int GRIDSIZE = 9;
    public static final int size = 500;
    //public static final int MINECOUNT = (int) Math.round(GRIDSIZE * GRIDSIZE * .1);
    public static final int MINECOUNT = 10;

    private Handler handler = new Handler();

    public Game() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }  catch (Exception ignore) {}
        new Window( GRIDSIZE, "Demineur  -", this, handler,size);
        Window.update(0);
       
    }

    //Démarrer le jeux
    public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> new Game());
    }

}
