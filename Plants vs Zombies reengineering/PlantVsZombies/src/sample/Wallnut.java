package sample;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

/**
 * The Class Wallnut.
 */
public class Wallnut extends Plant{
    
    /**
     * Instantiates a new wallnut.
     *
     * @param x the x
     * @param y the y
     * @param row the row
     * @param col the col
     */
    public Wallnut(int x, int y,int row,int col) {
        super(x, y, "/assets/walnut_full_life.gif", 400,60,75,row,col);
        this.path=getClass().getResource("/assets/walnut_full_life.gif").toString();
    }
    
    /**
     * Check hp.
     */
    public void checkHp()
    {
        if(getHp()<=0)
        {
            setHp(0);
            GamePlayController.allPlants.remove(this);
            img.setVisible(false);
            img.setDisable(true);
        }
    }

}
