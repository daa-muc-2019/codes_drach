import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class SpaceShip extends Sprites implements KeyListener {
    private int vel_x;
    private int vel_y;
    private List<Missile> missileList;

    public SpaceShip(int x, int y){
        super(x,y);
        this.vel_x = 0;
        this.vel_y = 0;
        this.missileList = new ArrayList<>();
        loadImage("src/Schiff.png");
        getImageDimensions();
    }

    public void move(){
        this.x += this.vel_x;
        this.y += this.vel_y;
        if (this.x<1){
           this.x=1;
        }
        if (this.y<1){
            this.y = 1;
        }
    }
    public List getMissileList(){
        return this.missileList;
    }
    public void fire()  {
        missileList.add(new Missile(this.x+this.breite,this.y+this.hoehe/2));
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            fire();
        }
        if (e.getKeyCode() == KeyEvent.VK_UP){
            this.vel_y = -1;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN){
            this.vel_y = 1;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            this.vel_x = 1;
        }
        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            this.vel_x = -1;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        this.vel_x = 0;
        this.vel_y = 0;

    }
}
