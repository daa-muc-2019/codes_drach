import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

public class Board extends JPanel implements ActionListener {
    private Timer tm;
    private SpaceShip player;
    private List<Gegner> gegnerListe;
    private final int RAUMSCHIFF_START_X = 40;
    private final int RAUMSCHIFF_START_Y = 60;
    private final int BOARD_BREITE = 800;
    private final int BOARD_HOEHE = 600;
    private final int TICK_TIME = 15;

    public Board(){
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(BOARD_BREITE,BOARD_HOEHE));
        player = new SpaceShip(RAUMSCHIFF_START_X,RAUMSCHIFF_START_Y);
        tm = new Timer(TICK_TIME,this);
        tm.start();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        drawObjects(g);
    }

    public void drawObjects(Graphics g){
        if (player.isVisible()){
            g.drawImage(player.getImg(), player.getX(), player.getY(), this);
        }
        List<Missile> missileList = player.getMissileList();
        for (Missile m : missileList){
            if(m.isVisible()){
                g.drawImage(m.getImg(), m.getX(), m.getY(), this);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        updateShip();
        updateMissiles();
        repaint();
    }


    public void updateShip(){
        if(player.isVisible()){
            player.move();
        }
    }
    public void updateMissiles(){
        List<Missile> missileList = player.getMissileList();
        for(int i = 0; i<missileList.size();i++){
            if(missileList.get(i).isVisible()){
                missileList.get(i).move();
            }
            else{
                missileList.remove(i);
            }
        }
    }

    private class TAdapter extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e){
            player.keyPressed(e);
        }
        @Override
        public void keyReleased(KeyEvent e){
            player.keyReleased(e);
        }
    }
}
