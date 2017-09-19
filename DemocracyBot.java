
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class DemocracyBot extends Robot
{
    public int beepers;
    public DemocracyBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void fixBallots() {
        if( beeperInStreet()) {
            //makeSureBeepersPresent();
        }
        else {
            //makeSureNoBeepers();
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public boolean beeperInStreet(){
        move();
        if (nextToABeeper()){
            return true;
        }
        else{
            return false;
        }
        
    }

}

