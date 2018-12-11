

package wormgame.gui;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import javax.swing.JPanel;
import wormgame.domain.Piece;
import wormgame.domain.Worm;
import wormgame.game.WormGame;


public class DrawingBoard extends JPanel implements Updatable{
    
    private WormGame wormG;
    private int pieceL;
    
    public DrawingBoard(WormGame w, int l){
        this.pieceL=l;
        this.wormG=w;
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        List<Piece> t=wormG.getWorm().getPieces();
        for(Piece p:t){
            g.setColor(Color.BLACK);
            g.fill3DRect(p.getX() * pieceL, p.getY() * pieceL, pieceL, pieceL, true);
        }
        g.setColor(Color.red);
        g.fillOval(pieceL * wormG.getApple().getX(), pieceL * wormG.getApple().getY(), pieceL, pieceL);
        
    }

    @Override
    public void update() {
        repaint();
    }

}
