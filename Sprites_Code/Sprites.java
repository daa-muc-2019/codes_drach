import javax.swing.*;
import java.awt.*;

public abstract class Sprites {
    protected int x;
    protected int y;
    protected int breite;
    protected int hoehe;
    protected boolean visible;
    protected Image img;

    public Sprites(int x, int y){
        this.x = x;
        this.y = y;
        this.visible = true;
    }

    protected void getImageDimensions(){
        this.breite = img.getWidth(null);
        this.hoehe = img.getHeight(null);
    }
    protected void loadImage(String imgName){
        ImageIcon imic = new ImageIcon(imgName);
        this.img = imic.getImage();
    }

    public Rectangle getBounds(){
        return new Rectangle(this.x,this.y,this.breite,this.hoehe);
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public Image getImg(){
        return this.img;
    }
    public boolean isVisible(){
        return this.visible;
    }
    public void setVisible(boolean status){
        this.visible = status;
    }

}
