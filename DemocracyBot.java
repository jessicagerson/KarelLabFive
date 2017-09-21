
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
        move();
            for (int x = 0; x<5; x++){
            if( beeperInStreet()) {
                makeSureBeepersPresent();
            }
            else {
                makeSureNoBeepers();
            }
        }
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public boolean beeperInStreet(){
        
        if (nextToABeeper()){
            return true;
        }
        else{
            return false;
        }
    }
        public void makeSureNoBeepers(){
        turnLeft();
        move();
        if (nextToABeeper()){
            while (nextToABeeper()){
                pickBeeper();
            }
            turnLeft();
            turnLeft();
            move();
            move();
        }
        else{
            turnLeft();
            turnLeft();
            move();
            move();
        }
        if (nextToABeeper()){
            while (nextToABeeper()){
                pickBeeper();
            }
            turnLeft();
            turnLeft();
            move();
            turnRight();
            move();
            move();
        }
        else{
            turnLeft();
            turnLeft();
            move();
            turnRight();
            move();
            move();
        }
    }
        public void makeSureBeepersPresent(){
        turnLeft();
        move();
        if (nextToABeeper()){
            while(nextToABeeper()){
                pickBeeper();
            }
            putBeeper();
        }
        else {
            putBeeper();
        }
        turnLeft();
        turnLeft();
        move();
        move();
        if (nextToABeeper()){
            while(nextToABeeper()){
                pickBeeper();
            }
            putBeeper();
        }
        else {
            putBeeper();
        }
        turnLeft();
        turnLeft();
        move();
        turnRight();
        move();
        move();
    
    }
}

