

package game;

import gameoflife.GameOfLifeBoard;
import java.util.Random;


public class PersonalBoard extends GameOfLifeBoard{
    
    public PersonalBoard(int width, int height){
        super(width, height);
    }

    @Override
    public void initiateRandomCells(double d) {
        for(int i=0; i<super.getWidth(); i++){
            for(int j=0; j<super.getHeight(); j++){ 
                double rng=new Random().nextDouble();
                super.getBoard()[i][j] = d+rng>=1;
            }
        }
    }

    @Override
    public boolean isAlive(int i, int i1) {
        if(i<0 || i>=super.getWidth() || i1<0 || i1>=super.getHeight()){ 
            return false;
        }
        return super.getBoard()[i][i1];
    }

    @Override
    public void turnToLiving(int i, int i1) {
        if(i<0 || i>=super.getWidth() || i1<0 || i1>super.getHeight()){ 
            return;
        }
        super.getBoard()[i][i1]=true;
    }

    @Override
    public void turnToDead(int i, int i1) {
        if(i<0 || i>=super.getWidth() || i1<0 || i1>super.getHeight()){ 
            return;
        }
        super.getBoard()[i][i1]=false;
    }

    @Override
    public int getNumberOfLivingNeighbours(int i, int i1) {
        int t=0;
        for(int n=0; n<super.getWidth(); n++){
            for(int m=0; m<super.getHeight(); m++){
                if(Math.abs(i-n)<=Math.abs(1) && Math.abs(i1-m)<=Math.abs(1) && (n!=i || m!=i1)){
                    if(super.getBoard()[n][m]){
                        t++;
                    }
                }
            }
        }
        return t;
    }

    @Override
    public void manageCell(int i, int i1, int i2) {
        if(i2<2){
            super.getBoard()[i][i1]=false;
        }else if(i2>3){
            super.getBoard()[i][i1]=false;
        }else if(super.getBoard()[i][i1]==false && i2==3){  
            super.getBoard()[i][i1]=true;
        }
    }
    
    

}
