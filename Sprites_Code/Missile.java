public class Missile extends Sprites {
    private final int BOARD_BREITE = 580;
    private final int MISSILE_VEL = 2;

    public Missile(int x, int y){
        super(x,y);
        loadImage("src/Rakete.png");
        getImageDimensions();
    }
    public void move(){
        this.x += MISSILE_VEL;
        if(x > BOARD_BREITE){
            this.setVisible(false);
        }
    }
}
